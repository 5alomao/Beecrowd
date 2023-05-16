import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int C = sc.nextInt();
        
        while(C!=0){
            String nome = sc.next();
            int fn = sc.nextInt();
            
            if(nome.equals("Thor"))
                System.out.println("Y");
            else
                System.out.println("N");
                
            C--;
        }
    }
}
