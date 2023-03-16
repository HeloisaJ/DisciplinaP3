package ATV6;

public class Circunferencia {
    
    private double centroX;
    private double centroY;
    private double raio;
   
    public Circunferencia(double centroX, double centroY, double raio){
        this.centroX = centroX;
        this.centroY = centroY;
        this.raio = raio;
    }
    
    public double getCentroX(){
        return this.centroX;
    }
    
    public double getCentroY(){
        return this.centroY;
    }
    
    public double getRaio(){
        return this.raio;
    }
}
