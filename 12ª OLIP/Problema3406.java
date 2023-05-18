import java.util.Scanner;

public class Main{
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int gat = sc.nextInt();
        int cmd = sc.nextInt();
        
        int[] pgat = new int[gat];
        
        for(int i=0; i<gat; i++){
            pgat[i] = sc.nextInt();
        }
        
        while(cmd!=0){
            int op = sc.nextInt();
            if(op == 1){
                int soma = 0;
                int i = sc.nextInt();
                int j = sc.nextInt();
                for(int x = i-1; x<j; x++){
                    soma+= pgat[x];
                }
                System.out.println(soma);
            }else if(op == 0){
                int i = sc.nextInt();
                int j = sc.nextInt();
                int v = sc.nextInt();
                for(int x = i-1; x<j; x++){
                    pgat[x] += v;
                }
            }
            cmd--;
        }
    }
}
