package ATV12.tiposEmpregados;

public class Empregado {
    
    private String nome;
    private String sobrenome;
    private String cpf;

    public Empregado(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public double vencimento(){
        return 0;
    }

    public String toString(){
        return "Nome: " + this.nome + ", Sobrenome: " + this.sobrenome + ", CPF: " + this.cpf + ", Vencimento: " + this.vencimento();
    }
}