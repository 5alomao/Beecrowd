import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int l = sc.nextInt();
        char t = sc.next().charAt(0);
        double[][] matriz = new double[12][12];
        double soma = 0;
        
        for(int i=0; i<12; i++){
            for(int j=0;j<12;j++){
                matriz[i][j] = sc.nextDouble();
                if(l == i)
                    soma+=matriz[l][j];
            }
        }
        if(t == 'S')
            System.out.printf("%.1f\n",soma);
        else if(t == 'M')
            System.out.printf("%.1f\n",soma/12.0);
    } 
}
