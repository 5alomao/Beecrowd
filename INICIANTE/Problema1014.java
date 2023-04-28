import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        int dist = s.nextInt();
        double comb = s.nextDouble();
        
        double consumo = dist/comb;
        
        System.out.printf("%.3f km/l\n", consumo);
    }
}
