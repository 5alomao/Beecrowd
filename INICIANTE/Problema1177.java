import java.util.Scanner;

public class Main {
    
    public static void main(String[]args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] vet = new int[1000];
        int t = sc.nextInt();
        int x=t-1;
        int y=0;
        for(int i=0;i<1000;i++){
            if(y<=x){
                System.out.printf("N[%d] = %d\n",i,y);
                y++;
                if(y>x)
                    y=0;
            }
        }
    }
}
