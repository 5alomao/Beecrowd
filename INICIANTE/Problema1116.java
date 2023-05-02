import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        
        for(int i = 0; i<q; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            double res= (double) x/y;
            if(y==0){
                System.out.println("divisao impossivel");
            }else
                System.out.printf("%.1f\n",res);
        }
    }
}
