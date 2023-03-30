package ATV10;

public class ContaEspecial extends ContaBancaria{
    
    private double limite;

    public ContaEspecial(String nome, String numero, double limite){
        super(nome, numero);
        this.limite = limite;
    }

}
