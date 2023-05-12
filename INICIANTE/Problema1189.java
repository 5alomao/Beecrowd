import java.util.Scanner;

public class Main{
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char op = sc.next().charAt(0);
        
        double[][] matriz = new double[12][12];
        double soma=0.0;
        int cont=0;
        for(int i=0;i<12;i++){
            for(int j=0;j<12;j++){
                matriz[i][j] = sc.nextDouble();
                
                if(j < i && i+j < 11){
                    soma += matriz[i][j];
                    cont++;
                }
            }
        }
        double med = soma/cont;
        if(op == 'M')
            System.out.printf("%.1f%n", med);
        else if(op == 'S')
            System.out.printf("%.1f%n", soma);
    }
}
