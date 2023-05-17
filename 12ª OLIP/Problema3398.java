import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        double m;
        int n;
        
        while(sc.hasNextDouble()){
            m = sc.nextDouble();
            n = sc.nextInt();
            double total = m*n;
            System.out.printf("%.2f%n",total);
        }
    }
}
