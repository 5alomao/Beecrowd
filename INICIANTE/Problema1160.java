import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            int pa = sc.nextInt();  
            int pb = sc.nextInt();
            double g1 = sc.nextDouble();
            double g2 = sc.nextDouble();
            int totala = pa;
            int totalb = pb;
            int anos=0;
            while(totala<=totalb){
                totala +=  totala * g1/100;
                totalb +=  totalb * g2/100;
                anos++;
                if (anos > 100){
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }
            if (anos <= 100)
                System.out.println(anos + " anos.");
            anos=0;
        }
        sc.close();
        
    }
}
