package ATV8.Interface;

import java.util.Scanner;

import ATV8.SistemaBanco.CadastroConta;

public class Main {

    public static void menu(){
        System.out.println("Seja bem vindo ao banco!");
        System.out.println("0 - Informar número da conta");
        System.out.println("1 - Depósito");
        System.out.println("2 - Saque");
        System.out.println("Se quiser encerrar o programa, digite um número menor que 0.");
        System.out.println("Digite um dos números acima: ");
    }

    public static int validarNumero(String num){
        int i, tam = num.length();
        for(i = 0; i < tam; i++){
            if(!Character.isDigit(num.charAt(i))){
                return -1;
            }
        }
        return 0;
    }
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numero;
        CadastroConta sistema = new CadastroConta();
        double valor;
        int op;
        do{
            menu();
            op = input.nextInt();
            System.out.println("");
            if(op == 0){
                System.out.println("Informe seu número: ");
                numero = input.next();
                while(validarNumero(numero) == -1){
                    System.out.println("Número inválido! Digite um número composto somente de digitos: ");
                    numero = input.next();
                }
                sistema.inserir(numero);
                System.out.println("");
            }
            else if(op == 1){
                System.out.println("Informe o número da conta: ");
                numero = input.next(); 
                System.out.println("Informe a quantia a ser depositada: ");
                valor = input.nextDouble(); 
                while(valor <= 0){
                    System.out.println("Quantia a ser depositada inválida! Digite um número maior que 0:");
                    valor = input.nextDouble(); 
                }
                sistema.realizarDeposito(valor, numero);
                System.out.println("");
            }
            else if(op == 2){
                System.out.println("Informe o número da conta: ");
                numero = input.next(); 
                System.out.println("Informe a quantia a ser sacada: ");
                valor = input.nextDouble(); 
                while(valor <= 0){
                    System.out.println("Quantia a ser sacada inválida! Digite um número maior que 0:");
                    valor = input.nextDouble(); 
                }
                sistema.realizarSaque(valor, numero);
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
