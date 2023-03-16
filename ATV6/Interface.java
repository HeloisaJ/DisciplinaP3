package ATV6;
import java.util.Scanner;;

public class Interface {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double centroX, centroY, raio, a, b, c;
        int i, tam = 5;
        
        System.out.println("Insira os dados da circunferência: ");
        System.out.println("Localização do centro no eixo X: ");
        centroX = input.nextDouble();
        System.out.println("Localização do centro no eixo Y: ");
        centroY = input.nextDouble();
        System.out.println("Raio da cricunferência: ");
        raio = input.nextDouble();
        while(raio <= 0){
            System.out.println("Número para o raio inválido, digite um número maior que 0: ");
            raio = input.nextDouble();
        }
        
        Circunferencia x = new Circunferencia(centroX, centroY, raio);
        
        for(i = 0; i < tam; i++){
            System.out.println("Digite os valores de A, B e C: ");
            System.out.print("A = ");
            a = input.nextDouble();
            System.out.print("B = ");
            b = input.nextDouble(); 
            System.out.print("C = ");
            c = input.nextDouble();
            Pontos p = new Pontos(a, b, c);
            System.out.println("");
            p.calculo(x);
            System.out.println("");
        }

    }
}
