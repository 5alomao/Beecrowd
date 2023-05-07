import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        int x = sc.nextInt();
        vet[0] = x;
        
        for(int i=1; i<10;i++){
            x *= 2;
            vet[i] = x;
        }
        for(int i=0; i<10;i++){
            System.out.printf("N[%d] = %d%n",i,vet[i]);
        }
    }
}
