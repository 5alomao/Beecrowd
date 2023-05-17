import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int a,b,c,d;
        
        while(sc.hasNextInt()){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            int diff = Math.abs(a-b);
            int res = c;
            for(int i=3; i<d;i++){
                res += diff;
            }
            System.out.println(res);
        }
    }
}
