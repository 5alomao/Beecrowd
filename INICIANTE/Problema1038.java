import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        int cod = s.nextInt();
        int qtd = s.nextInt();
        double total = 0;
        
        if(cod == 1)
            total = 4 * qtd;
        else if(cod==2)
            total = 4.5 * qtd;
        else if(cod==3)
            total = 5 * qtd;
        else if(cod==4)
            total = 2 * qtd;
        else if(cod==5)
            total = 1.5 * qtd;
            
        System.out.printf("Total: R$ %.2f\n",total);
    }
}
