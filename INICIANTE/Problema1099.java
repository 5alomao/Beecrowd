import java.util.Scanner;

public class Main {
    
    public static void main(String[]args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int soma = 0;
        int x = 1;
        while(x<=n){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > b){
                int c = a;
                a = b;
                b = c;
            }
            for(int d = a+1;d<b;d++){
                if(d%2==1)
                    soma+=d;
            }
            System.out.println(soma);
            soma=0;
            x++;
        }
    }
}
