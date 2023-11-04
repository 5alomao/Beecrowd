import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int testes = sc.nextInt();
        
        for(int i = 0; i < testes; i++) {
            int num = sc.nextInt();
            int divisores = 0;
            for(int j = 1; j < num; j++) {
                if(num % j == 0) {
                    divisores += j;
                }
            }   
            if(divisores == num) {
                System.out.println(num + " eh perfeito");
            } else {
                System.out.println(num + " nao eh perfeito");
            }
        }
        sc.close();
    }
}
