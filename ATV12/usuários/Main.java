package ATV12.usuários;

import ATV12.tiposEmpregados.Assalariado;
import ATV12.tiposEmpregados.Comissionado;
import ATV12.tiposEmpregados.Horista;

import  java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, sobrenome, cpf;
        double salario, total, taxa, precoHora, horasTrabalhadas;
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = input.nextLine();
        System.out.println("Digite seu cpf: ");
        cpf = input.next(); input.nextLine();

        salario = 3000;
        total = 1500;
        taxa = 25;
        precoHora = 30;
        horasTrabalhadas = 200;

        Assalariado x = new Assalariado(nome, sobrenome, cpf, salario);
        Comissionado y = new Comissionado(nome, sobrenome, cpf, total, taxa);
        Horista z = new Horista(nome, sobrenome, cpf, precoHora, horasTrabalhadas); 

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        input.close();
    }

}
