import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        int tg, vmed;
        
        tg = s.nextInt();
        vmed = s.nextInt();
        int dist = tg * vmed;
        double litros = dist/12.0;
    
        System.out.printf("%.3f\n",litros);
        
    }
}
