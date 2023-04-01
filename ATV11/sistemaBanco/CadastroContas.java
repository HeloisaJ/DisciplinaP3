package ATV11.sistemaBanco;

import ATV11.tiposConta.ContaBancaria;
import ATV11.tiposConta.ContaEspecial;
import ATV11.tiposConta.ContaPoupanca;

public class CadastroContas {
    
    private ContaBancaria contas [];
    private int cont;

    public CadastroContas(){
        this.contas = new ContaBancaria [10];
    }

    public void inserirContaBancaria(String nome, int numero){
        if(this.cont == this.contas.length){
            System.out.println("O sistema de contas está cheio no momento, espere um momento.");
        }
        else if(this.cont == 0){
            this.contas[this.cont] = new ContaBancaria(nome, numero);
            this.cont++;
            System.out.println("Conta bancária criada com sucesso!");
        }
        else{
            boolean achou = false;
            for(int i = 0; i < this.cont; i++){
                if(numero == this.contas[i].getNumero() && this.contas[i] instanceof ContaBancaria){
                    achou = true;
                }
            }

            if(achou == true){
                System.out.println("Já existe um usuário de uma conta bancária com esse número.");
            }
            else{
                this.contas[this.cont] = new ContaBancaria(nome, numero);
                this.cont++;
                System.out.println("Conta bancária criada com sucesso!");
            }
        }
    }

    public void inserirContaPoupanca(String nome, int numero, int dia){
        if(this.cont == this.contas.length){
            System.out.println("O sistema de contas está cheio no momento, espere um momento.");
        }
        else if(this.cont == 0){
            this.contas[this.cont] = new ContaPoupanca(nome, numero, dia);
            this.cont++;
            System.out.println("Conta poupança criada com sucesso!");
        }
        else{
            boolean achou = false;
            for(int i = 0; i < this.cont; i++){
                if(numero == this.contas[i].getNumero() && this.contas[i] instanceof ContaPoupanca){
                    achou = true;
                }
            }

            if(achou == true){
                System.out.println("Já existe um usuário de uma conta poupança com esse número.");
            }
            else{
                this.contas[this.cont] = new ContaPoupanca(nome, numero, dia);
                this.cont++;
                System.out.println("Conta poupança criada com sucesso!");
            }
        }
    }

    public void inserirContaEspecial(String nome, int numero, double limite){
        if(this.cont == this.contas.length){
            System.out.println("O sistema de contas está cheio no momento, espere um momento.");
        }
        else if(this.cont == 0){
            this.contas[this.cont] = new ContaEspecial(nome, numero, limite);
            this.cont++;
            System.out.println("Conta especial criada com sucesso!");
        }
        else{
            boolean achou = false;
            for(int i = 0; i < this.cont; i++){
                if(numero == this.contas[i].getNumero() && this.contas[i] instanceof ContaEspecial){
                    achou = true;
                }
            }

            if(achou == true){
                System.out.println("Já existe um usuário de uma conta especial com esse número.");
            }
            else{
                this.contas[this.cont] = new ContaEspecial(nome, numero, limite);
                this.cont++;
                System.out.println("Conta especial criada com sucesso!");
            }
        }
    }

    public void realizarDeposito(double valor, int numero){
        if(this.cont == 0){
            System.out.println("O sistema de contas está vazio!");
        }
        else{
            int pos = buscarContas(0, numero);
            if(pos == -1){
                System.out.println("Número da conta não encontrado.");
            }
            else{
                System.out.println("Saldo Anterior: " + this.contas[pos].getSaldo());
                this.contas[pos].depositar(valor);
                System.out.println("Saldo Atual: " + this.contas[pos].getSaldo());
            }
        } 
    }

    public void realizarSaque(double valor, int numero){
        if(this.cont == 0){
            System.out.println("O sistema de contas está vazio!");
        }
        else{
            int pos = buscarContas(0, numero);
            if(pos == -1){
                System.out.println("Número da conta não encontrado.");
            }
            else{
                if(this.contas[pos] instanceof ContaEspecial){
                    ContaEspecial n = (ContaEspecial) this.contas[pos];
                    n.saque(valor);
                }
                else{
                    this.contas[pos].saque(valor);
                }
            }
        }
    }

    public void atualizarPoupanca(int dia, double taxa){
        boolean acertou = false;
        if(this.cont == 0){
            System.out.println("O sistema de contas está vazio!");
        }
        else{
            int i;
            for(i = 0; i < this.cont; i++){
                if(this.contas[i] instanceof ContaPoupanca){
                    ContaPoupanca n = (ContaPoupanca) this.contas[i];
                    if(dia == n.getDia()){
                        n.atualiza(taxa);
                        acertou = true;
                    }
                }
            }

            if(acertou){
                System.out.println("Algumas contas poupanças foram atualizadas.");
            }
            else{
                System.out.println("Nenhum dia de rendimento coincidiu com a data de hoje.");
            }
        }
    }

    public void mostrarSaldo(){
        if(this.cont == 0){
            System.out.println("O sistema de contas está vazio!");
        }
        else{
            for(int i = 0; i < this.cont; i++){
                System.out.println(this.contas[i]);
            }
        }
    }

    private int buscarContas(int comeco, int numero){
        int i;
        for(i = comeco; i < this.cont; i++){
            if(numero == this.contas[i].getNumero()){
                return i;
            }
        }
        return -1;
    }
}
