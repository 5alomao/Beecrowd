import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
    
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a > b){
            if(a % b == 0)
                System.out.println("Sao Multiplos");
            else
                System.out.println("Nao sao Multiplos");
        }else{
            if(b % a == 0)
                System.out.println("Sao Multiplos");
            else
                System.out.println("Nao sao Multiplos");
        }
    }
}
