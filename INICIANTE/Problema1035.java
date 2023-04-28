import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int soma1 = c+d;
        int soma2 = a+b;
        if(b>c && d>a && soma1 > soma2 && c > 0 && d > 0 && (a%2==0))
            System.out.println("Valores aceitos");
        else
            System.out.println("Valores nao aceitos");
    }
}
