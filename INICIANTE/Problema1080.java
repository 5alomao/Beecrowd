import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        
        int maior = 0;
        int pos = 0;
        
        for(int i=1; i<=100;i++){
            int x=sc.nextInt();
            if(x > maior){
                maior = x;
                pos = i;
            }
                
        }
        
        System.out.println(maior);
        System.out.println(pos);
    }
}
