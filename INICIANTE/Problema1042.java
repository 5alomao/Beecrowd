import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a < b && a < c){
            System.out.printf("%d\n",a);
            if(b < c){
                System.out.printf("%d\n",b);
                System.out.printf("%d\n",c);
            }else{
                System.out.printf("%d\n",c);
                System.out.printf("%d\n",b);
            }
        }else if(b < a && b < c){
            System.out.printf("%d\n",b);
            if(a < c){
                System.out.printf("%d\n",a);
                System.out.printf("%d\n",c);
            }else{
                System.out.printf("%d\n",c);
                System.out.printf("%d\n",a);
            }
        }else{
            System.out.printf("%d\n",c);
            if(a < b){
                System.out.printf("%d\n",a);
                System.out.printf("%d\n",b);
            }else{
                System.out.printf("%d\n",b);
                System.out.printf("%d\n",a);
            }
        }
        System.out.printf("\n%d\n",a);
        System.out.printf("%d\n",b);
        System.out.printf("%d\n",c);
    }
}
