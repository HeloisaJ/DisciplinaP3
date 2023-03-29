package ATV8.SistemaBanco;

import ATV8.Conta.Conta;
import ATV8.Conta.Limite;

public class CadastroConta {
    private Conta [] contas;
    private int cont;

    public CadastroConta(){
        this.contas = new Conta [10];
    }

    public void inserir(String numero){
        if(this.cont == this.contas.length){
            System.out.println("O sistema de contas está cheio no momento, espere um momento.");
        }
        else if(this.cont == 0){
            this.contas[this.cont] = new Conta(numero);
            this.cont++;
            System.out.println("Conta criada com sucesso!");
        }
        else{
            boolean achou = false;
            for(int i = 0; i < this.cont; i++){
                if(this.contas[i].getNumero().equals(numero) ){
                    achou = true;
                }
            }

            if(achou == true){
                System.out.println("Já existe um usuário de uma conta com esse número.");
            }
            else{
                this.contas[this.cont] = new Conta(numero);
                this.cont++;
                System.out.println("Conta criada com sucesso!");
            }
        }
    }

    public void realizarDeposito(double valor, String numero){
        int pos = buscarContas(numero);
        if(pos == -1){
            System.out.println("Número da conta não encontrado.");
        }
        else{
            System.out.println("Saldo Anterior: " + this.contas[pos].getValue());
            this.contas[pos].depositar(valor);
            System.out.println("Saldo Atual: " + this.contas[pos].getValue());
        }
    }

    public void realizarSaque(double valor, String numero){
        int pos = buscarContas(numero);
        if(pos == -1){
            System.out.println("Número da conta não encontrado.");
        }
        else{
            if(this.contas[pos].getValue() >= Limite.SAQUE.valorSaque){
                System.out.println("Valor do saque maior que o permitido! Você não pode sacar mais de 1.000 reais de uma vez");
            }
            else if(this.contas[pos].getValue() < valor){
                System.out.println("O valor a ser sacado é maior que o valor presente na conta, não foi possível realizar o saque.");
            }
            else{
                System.out.println("Saldo Anterior: " + this.contas[pos].getValue());
                this.contas[pos].saque(valor);
                System.out.println("Saldo Atual: " + this.contas[pos].getValue());
            }
        }
    }

    private int buscarContas(String numero){
        int i;
        for(i = 0; i < this.cont; i++){
            if(numero.equals(this.contas[i].getNumero())){
                return i;
            }
        }
        return -1;
    }
}
