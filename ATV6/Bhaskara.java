package ATV6;

public class Bhaskara {
    
    private double a;
    private double b;
    private double delta;
    
    public Bhaskara(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.delta = calculoDelta(c);
    }
    
    private double calculoDelta(double c){
        return Math.pow(this.b, 2) - 4*this.a*c;
    }
    
    public double definirPontoX(){
        if(this.delta > 0){
            return Math.round((-this.b + Math.sqrt(this.delta))/(2*this.a));
        }
        else if(this.delta == 0){
            return Math.round(-this.b/(2*this.a));
        }
        else {
            return -1;
        }
    }
    
    public double definirPontoY(){
        if(this.delta > 0){
            return Math.round((-this.b - Math.sqrt(this.delta))/(2*this.a));
        }
        else if(this.delta == 0){
            return Math.round(-this.b/(2*this.a));
        }
        else {
            return -1;
        }
    }
}
