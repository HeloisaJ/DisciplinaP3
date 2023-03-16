package ATV6;

public class Pontos {
    
    private double pontoX;
    private double pontoY;
    private double distancia;
   
    public Pontos(double a, double b, double c){
        Bhaskara p = new Bhaskara(a, b, c);
        this.pontoX = p.definirPontoX();
        this.pontoY = p.definirPontoY();
    }
    
    public void calculo(Circunferencia x){
        if(this.pontoX == -1 || this.pontoY == -1){
            this.distancia = -1;
        }
        else{
            double d = Math.sqrt(Math.pow(this.pontoX - x.getCentroX(), 2) + Math.pow(this.pontoY - x.getCentroY(), 2));
            this.distancia = d;
        }
        comparar(x);
    }
    
    private void comparar(Circunferencia x){
        double raio = x.getRaio();
        if(this.distancia == -1){
            System.out.println("Não foi possível determinar pois o resultado do cálculo do delta foi negativo.");
        }
        else if(raio == this.distancia){
            System.out.println("A distância deste ponto é igual ao raio.");
        }
        else if(raio > this.distancia){
            System.out.println("Este ponto está dentro da circunferência.");
        }
        else if(raio < this.distancia){
            System.out.println("Este ponto está fora da circunferência.");
        }   
    }
}
