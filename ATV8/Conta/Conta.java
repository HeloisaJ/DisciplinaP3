package ATV8.Conta;

public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero){
        this.numero = numero;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void saque(double valor){
        this.saldo -= valor;
    }

    public double getValue(){
        return this.saldo;
    }

    public String getNumero(){
        return this.numero;
    }
    
}