import java.util.Scanner;

public class Main{
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        double x = sc.nextDouble();
        
        String nc = String.format("%+.4E",x);
        
        System.out.println(nc);
    }
}
