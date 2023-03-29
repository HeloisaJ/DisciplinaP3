package ATV8.Conta;

public enum Limite {
    SAQUE (1000);

    public int valorSaque;
    Limite(int valor){
        valorSaque = valor;
    }
}
