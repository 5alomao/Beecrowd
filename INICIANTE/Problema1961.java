import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int p = sc.nextInt();
        int n = sc.nextInt();
        int[] hc = new int[n];
        
        for(int i=0; i<n; i++){
            hc[i] = sc.nextInt();
        }
        
        boolean venceu = true;
        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(hc[i+1] - hc[i]);
            if (diff > p) {
                venceu = false;
                break;
            }
        }
        
        if (venceu) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("GAME OVER");
        }
    }
}
