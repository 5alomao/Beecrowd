import java.util.Scanner;

public class Main{
    public static void main (String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        double x = sc.nextDouble();
        double[] vet = new double[100];
        
        for(int i=0;i<100;i++){
            vet[i] = x;
            System.out.printf("N[%d] = %.4f\n",i,vet[i]);
            x -= (x/2);
        }
    }
}
