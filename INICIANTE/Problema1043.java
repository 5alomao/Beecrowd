import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double per = a+b+c;
        double area = ((a+b) * c )/ 2;
        
        if(Math.abs(a-b)<c && c<a+b){
            if(Math.abs(a-c)<b && b<a+c){
                if(Math.abs(b-c)<a && a<b+c)
                    System.out.printf("Perimetro = %.1f\n",per);
            }
        }
        else
            System.out.printf("Area = %.1f\n",area);
    }
}
