package ATV10;

import java.util.Scanner;

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
        double valor, taxa, limite;
        String nome, numero;
        int op;
        do{
            menu();
            op = input.nextInt();

        }while(op >= 0);
    }

}
