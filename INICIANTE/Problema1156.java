import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double s=1;
        int x=3;
        double y =2.0;
        for(int i=x;i<=39;i+=2){
            s += x/y;
            x+=2;
            y*= 2;
        }
        System.out.printf("%.2f\n", s);
    }
}
