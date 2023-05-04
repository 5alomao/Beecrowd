import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if(x > y){
            int z = x;
            x = y;
            y = z;
        }
        for(int i = x+1; i<y; i++){
            if(i%5==3||i%5==2)
                System.out.println(i);
        }
    }
}
