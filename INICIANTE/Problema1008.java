import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        int fun = s.nextInt();
        int horas = s.nextInt();
        double valorHora = s.nextDouble();
        double salario = horas * valorHora;
        
        System.out.printf("NUMBER = %d\n",fun);
        System.out.printf("SALARY = U$ %.2f\n",salario);
        
    }
}
