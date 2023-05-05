import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int z = sc.nextInt();
        
        while(z<=x)
            z = sc.nextInt();
        
        int soma=x;
        int v=1;
        while (soma <= z) {
            x++;
            soma += x;
            v++;
        }
        System.out.println(v);
    }
}
