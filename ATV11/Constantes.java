package ATV11;

public class Constantes {
    
    public enum Limite{
        LIMITE (-5000.0);

        public double valorLimite;

        Limite(double valor){
            valorLimite = valor;
        }
    }

    public enum EspacoDias{
        DIAS (32);

        public int valorDia;

        EspacoDias(int valor){
            valorDia = valor;
        }
    }

    public enum EspacoTaxa{
        TAXA (6);

        public double valorTaxa;

        EspacoTaxa(double valor){
            valorTaxa = valor;
        }
    }
}
