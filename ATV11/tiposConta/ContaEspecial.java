package ATV11.tiposConta;

public class ContaEspecial extends ContaBancaria{
    
    private double limite;

    public ContaEspecial(String nome, int numero, double limite){
        super(nome, numero);
        this.limite = limite;
    }

    @Override
    public void saque(double valor){
        double x = this.getSaldo() - valor;
        if(x > this.limite){
            System.out.println("Saldo anteriormente: " + this.getSaldo());
            this.setSaldo(x);
            System.out.println("Saldo atual: " + this.getSaldo());
        }
        else{
            System.out.println("A quantia a ser sacada ultrapassa o limite da conta especial. Operação não realizada!");
        }
    }

}
