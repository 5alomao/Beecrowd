import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        double salario = sc.nextDouble();
        int per;
        double reajuste;
        
        if(salario >= 0 && salario <= 400)
            per = 15;
        else if(salario > 400 && salario <= 800)
            per = 12;
        else if(salario > 800 && salario <= 1200)
            per = 10;
        else if(salario > 1200 && salario <= 2000)
            per = 7;
        else
            per = 4;
        
        reajuste = salario*per/100;
        salario+=reajuste;
        
        System.out.printf("Novo salario: %.2f\n",salario);
        System.out.printf("Reajuste ganho: %.2f\n",reajuste);
        System.out.println("Em percentual: "+per+" %");
    }
}
