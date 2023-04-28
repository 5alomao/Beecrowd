import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
         
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int diferenca = (a*b-c*d);
        
        System.out.println("DIFERENCA = "+diferenca);
    }
}
