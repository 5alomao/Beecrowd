import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double x = sc.nextDouble();
        while(x < 0 || x > 10){
            System.out.println("nota invalida");
            x = sc.nextDouble();
        }
        
        double y = sc.nextDouble();
        while(y < 0 || y > 10){
            System.out.println("nota invalida");
            y = sc.nextDouble();
        }
        
        double med = (x+y)/2;
        System.out.printf("media = %.2f\n",med);
    }
}
