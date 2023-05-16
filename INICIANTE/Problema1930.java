import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        int t4 = sc.nextInt();
        int res = (t1-1) + (t2-1) + (t3-1) + t4;
        
        System.out.println(res);
    }
}
