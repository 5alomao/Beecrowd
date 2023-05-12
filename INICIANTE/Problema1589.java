import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++){
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            
            int res = r1+r2;
            System.out.println(res);
        }
    }
}
