package ATV11.tiposConta;

public class ContaBancaria{

    private String nome;
    private int numero;
    private double saldo; 

    public ContaBancaria(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void saque(double valor){
        double quantia = this.saldo - valor;
        if(quantia > 0){
            System.out.println("Saldo anteriormente: " + this.saldo);
            this.setSaldo(quantia);
            System.out.println("Saldo atual: " + this.saldo);
        }
        else{
            System.out.println("Quantia para saque maior que o saldo.");
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double valor){
        this.saldo = valor;
    }

    public int getNumero(){
        return this.numero;
    }

    public String toString(){
        return "Nome: " + this.nome + ", Saldo: " + this.saldo;
    }
}