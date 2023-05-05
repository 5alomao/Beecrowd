import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int idade = sc.nextInt();
        double qtd = 0.0;
        int soma = 0;
        while(idade>=0) {
            qtd++;
            soma+=idade;
            idade = sc.nextInt();
        }
        double med = soma/qtd;
        System.out.printf("%.2f\n",med);
    }
}
