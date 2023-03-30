package ATV10;

public class ContaPoupanca extends ContaBancaria{
    
    private double taxaRendimento;

    public ContaPoupanca(String nome, String numero, double taxa){
        super(nome, numero);
        this.taxaRendimento = taxa;
    }

    public void autualiza(){

    }



}
