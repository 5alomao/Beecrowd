import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        String nome = s.nextLine();
        double salario = s.nextDouble();
        double vendas = s.nextDouble();
        
        double bonus = salario + vendas*0.15;
        
        System.out.printf("TOTAL = R$ %.2f\n",bonus);
    }
}
