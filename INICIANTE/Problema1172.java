import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        
        for(int i=0; i<10;i++){
            int x = sc.nextInt();
            if(x<=0)
                vet[i] = 1;
            else
                vet[i] = x;
        }
        for(int i=0; i<10;i++){
            System.out.printf("X[%d] = %d%n",i,vet[i]);
        }
    }
}
