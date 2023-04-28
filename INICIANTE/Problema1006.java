import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        double x,y,z;
        double med;
        x = s.nextDouble();
        y = s.nextDouble();
        z = s.nextDouble();
        med = (x*2 + y*3 + z*5)/10;
        
        System.out.printf("MEDIA = %.1f\n",med);
    }
}
