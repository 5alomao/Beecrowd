import java.lang.Math;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        
        double delta = (b*b) - (4*a*c);
        double raiz = Math.sqrt(delta);
        
        double x1 = (-b + raiz)/(2*a);
        double x2 = (-b - raiz)/(2*a);

        if(a != 0 && delta >= 0){
            System.out.printf("R1 = %.5f\n",x1);
            System.out.printf("R2 = %.5f\n",x2);
        }
        else
            System.out.println("Impossivel calcular");
    }
}
