import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        int cod1, qtd1, cod2, qtd2;
        double valor1,valor2;
        
        cod1 = s.nextInt(); 
        qtd1 = s.nextInt();
        valor1 = s.nextDouble();
        
        cod2 = s.nextInt(); 
        qtd2 = s.nextInt();
        valor2 = s.nextDouble();
        
        double total = (qtd1*valor1) + (qtd2*valor2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
    }
}
