import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x!=0){
            int t=0;
            int soma=0;
            while(t<5){
                if(x%2==0){
                    soma+=x;
                    t++;
                }
                x++;
            }
            System.out.println(soma);
            x = sc.nextInt();
        }
    }
}
