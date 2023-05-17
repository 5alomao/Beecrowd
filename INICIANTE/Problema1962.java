import java.util.Scanner;

public class Main{
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        
        while(n!=0){
            int ano = sc.nextInt();
            
            if(ano > 2015 || ano == 2015)
                System.out.println(Math.abs(2015-(ano+1))+" A.C.");
            else if(ano < 2015)
                System.out.println(Math.abs(2015-ano)+" D.C.");
            n--;
        }
    }
}
