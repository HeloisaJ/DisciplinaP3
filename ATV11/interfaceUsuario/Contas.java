package ATV11.interfaceUsuario;

import java.util.Scanner;
import java.util.Random;

import ATV11.Constantes;
import ATV11.sistemaBanco.CadastroContas;

public class Contas {
    
    public static void menu(){
        System.out.println("Seja bem vindo ao banco!");
        System.out.println("0 - Incluir uma nova conta");
        System.out.println("1 - Saque");
        System.out.println("2 - Depósito");
        System.out.println("3 - Atualizar o valor de todas as contas poupança");
        System.out.println("4 - Mostrar o saldo de cada uma das contas");
        System.out.println("Se quiser encerrar o programa, digite um número menor que 0.");
        System.out.println("Digite um dos números acima: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor, taxa;
        String nome;
        int op, escolha, numero, dia;

        CadastroContas sistema = new CadastroContas();
        do{
            menu();
            op = input.nextInt(); input.nextLine();
            System.out.println("");
            if(op == 0){
                System.out.println("Gostaria de criar uma conta bancaria, uma conta poupança ou uma conta especial ?");
                System.out.println("Digite 1 para conta bancaria, 2 para conta poupança e 3 conta especial: ");
                escolha = input.nextInt(); input.nextLine();

                while(escolha != 1 && escolha != 2 && escolha != 3){
                    System.out.println("Opção para criação de conta inválida! Digite 1, 2 ou 3 para criar uma conta.");
                    System.out.println("Digite 1 para conta bancaria, 2 para conta poupança e 3 conta especial: ");
                    escolha = input.nextInt();
                }

                System.out.println("Digite seu nome: ");
                nome = input.nextLine();
                System.out.println("Informe seu número: ");
                numero = input.nextInt(); input.nextLine();
                if(escolha == 1){
                    sistema.inserirContaBancaria(nome, numero);
                }
                else if(escolha == 2){
                    System.out.println("Digite o dia de rendimento: ");
                    dia = input.nextInt(); input.nextLine();
                    while(dia < 0 || dia > 31){
                        System.out.println("Dia inválido! Digite um número entre 1 e 31: ");
                        dia = input.nextInt(); input.nextLine();
                    }
                    sistema.inserirContaPoupanca(nome, numero, dia);
                }
                else{
                    sistema.inserirContaEspecial(nome, numero, Constantes.Limite.LIMITE.valorLimite);
                }
                System.out.println("");
            }
            else if(op == 1){
                System.out.println("Informe o número da conta: ");
                numero = input.nextInt(); input.nextLine();
                System.out.println("Informe a quantia a ser sacada: ");
                valor = input.nextDouble(); input.nextLine();
                while(valor <= 0){
                    System.out.println("Quantia a ser sacada inválida! Digite um número maior que 0:");
                    valor = input.nextDouble(); input.nextLine();
                }
                sistema.realizarSaque(valor, numero);
                System.out.println("");
            }
            else if(op == 2){
                System.out.println("Informe o número da conta: ");
                numero = input.nextInt(); input.nextLine();
                System.out.println("Informe a quantia a ser depositada: ");
                valor = input.nextDouble(); input.nextLine();
                while(valor <= 0){
                    System.out.println("Quantia a ser depositada inválida! Digite um número maior que 0:");
                    valor = input.nextDouble(); input.nextLine();
                }
                sistema.realizarDeposito(valor, numero);
                System.out.println("");
            }
            else if(op == 3){
                Random randomico = new Random();
                dia = randomico.nextInt(Constantes.EspacoDias.DIAS.valorDia);
                taxa = randomico.nextDouble(Constantes.EspacoTaxa.TAXA.valorTaxa);
                sistema.atualizarPoupanca(dia, taxa);
                System.out.println("");
            }
            else if(op == 4){
                sistema.mostrarSaldo();
                System.out.println("");
            }
            else if(op < 0){
                System.out.println("Tchau!");
            }
            else{
                System.out.println("Opção inválida! Digite uma das opções presentes no menu.");
                System.out.println("");
            }

        }while(op >= 0);

        input.close();
    }

}
