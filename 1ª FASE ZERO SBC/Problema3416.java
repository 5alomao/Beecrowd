import java.util.Scanner;

public class Main{
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int l = sc.nextInt();
        int d = sc.nextInt();
        int cont = l;
        
        while(n*d > l*1000){
            l += cont;
        }
        
        System.out.println(l);    
        
        sc.close();
    }
}
