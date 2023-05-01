import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int op=1;
        
        do{
            double n1,n2;
            do{
                n1 = sc.nextDouble();
                if(n1 < 0 ||  n1 > 10)
                    System.out.println("nota invalida");
            }while(n1 < 0 || n1 > 10);

            do{
                n2 = sc.nextDouble();
                if(n2 < 0 || n2 > 10)
                    System.out.println("nota invalida");
            }while (n2 < 0 || n2 > 10);

            double media =  (n1 + n2) / 2;
            System.out.printf("media = %.2f\n", media);

            do{
                System.out.println("novo calculo (1-sim 2-nao)");
                op = sc.nextInt();
            }while (op < 1 || op > 2);
            
        }while(op!=2);
    }
}
