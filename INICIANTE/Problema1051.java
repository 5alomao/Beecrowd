import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        double valor = sc.nextDouble();
        double imp = 0;

        if(valor <= 2000)
            imp = 0;
        else if(valor <= 3000){
            imp = (valor - 2000) * 0.08;
        }
        else if(valor <= 4500){
            imp = 1000 * 0.08 + (valor - 3000) * 0.18;
        }
        else if(valor > 4500)
            imp = 1000 * 0.08 + 1500 * 0.18 + (valor - 4500) * 0.28;
        
        if(imp == 0)
            System.out.println("Isento");
        else  
            System.out.printf("R$ %.2f\n",imp);
        
    }
}
