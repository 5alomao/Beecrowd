import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char op = sc.next().charAt(0);

        double[][] matriz = new double[12][12];
        double somaAcimaDiagonal = 0.0;
        int qtd = 0;
        
        sc.nextLine();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextDouble();
                if (i + j < 11) {
                    somaAcimaDiagonal += matriz[i][j];
                    qtd++;
                }
            }
        }

        if (op == 'M') {
            double mediaAcimaDiagonal = somaAcimaDiagonal / qtd;
            System.out.printf("%.1f\n", mediaAcimaDiagonal);
        } else if (op == 'S') {
            System.out.printf("%.1f\n", somaAcimaDiagonal);
        }
    }
}
