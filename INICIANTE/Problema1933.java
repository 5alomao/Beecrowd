import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        
        if(c1 > c2){
            int c3 = c1;
            c1 = c2;
            c2 = c3;
        }
        
        if(c1 != c2){
            System.out.println(c2);
        }else{
            System.out.println(c1);
        }
    }
}
