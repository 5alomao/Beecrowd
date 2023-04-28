import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        double x1,y1,x2,y2;
        
        x1 = s.nextDouble();
        y1 = s.nextDouble();
        x2 = s.nextDouble();
        y2 = s.nextDouble();
        
        double dist = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        
        System.out.printf("%.4f\n",dist);
    }
}
