import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int C = sc.nextInt();
        while(C!=0){
            int n = sc.nextInt();
            if(n % 2 == 0)
                System.out.println(0);
            else
                System.out.println(1);
            C--;
        }
    }
}
