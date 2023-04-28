import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        int x,y,prod;
        
        x = s.nextInt();
        y = s.nextInt();
        prod = x * y;
        
        System.out.println("PROD = "+prod);
        
    }
}
