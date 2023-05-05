import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
 
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int soma=0;
            int t=0;
            while(t < y){
                if(x%2!=0){
                    soma+=x;
                    t++;
                }
                x++;
            }
            System.out.println(soma);
        }
    }
}
