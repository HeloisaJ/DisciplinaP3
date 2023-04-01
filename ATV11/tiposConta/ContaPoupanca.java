package ATV11.tiposConta;

public class ContaPoupanca extends ContaBancaria{
    
    private int diaRendimento;

    public ContaPoupanca(String nome, int numero, int dia){
        super(nome, numero);
        this.diaRendimento = dia;
    }

    public void atualiza(double taxa){
        this.setSaldo(this.getSaldo() * (1 + taxa));
    }

    public int getDia(){
        return this.diaRendimento;
    }

}
