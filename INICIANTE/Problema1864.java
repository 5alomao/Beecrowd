import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        
        String res = frase.substring(0,n);
        
        System.out.println(res);
    }
}
