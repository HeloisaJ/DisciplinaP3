package ATV12.tiposEmpregados;

public class Comissionado extends Empregado{
    
    private double totalVenda;
    private double taxaComissao;

    public Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double taxaComissao){
        super(nome, sobrenome, cpf);
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double vencimento(){
        return this.totalVenda * (this.taxaComissao/100);
    }
}
