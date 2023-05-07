import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] matriz = new double[12][12];
        int col = sc.nextInt();
        char op = sc.next().charAt(0);
        double soma = 0.0;
        int count = 0;
        
        for(int i=0; i<12; i++){
            for(int j=0; j<12; j++){
                matriz[i][j] = sc.nextDouble();
                if(j==col){
                    soma+=matriz[i][j];
                    count++;
                }
            }
        }
        
        if(op == 'S'){
            System.out.printf("%.1f%n", soma);
        }else if(op == 'M'){
            double med = soma/count;
            System.out.printf("%.1f%n", med);
        }
    }
}
