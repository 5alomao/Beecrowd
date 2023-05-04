import java.util.Scanner;

public class Main {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b){
            int c = a;
            a = b;
            b = c;
        }
        for(int i=a+1;i<b;i++){
            if(i%2!=0)
                soma+=i;
        }
        System.out.println(soma);
    }
}
