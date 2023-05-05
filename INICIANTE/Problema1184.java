import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char op = sc.next().charAt(0);

        double[][] matriz = new double[12][12];
        double somaAbaixoDiagonal = 0;
        int qtd=0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextDouble();
                if (j < i) {
                    somaAbaixoDiagonal += matriz[i][j];
                    qtd++;
                }
            }
        }

        if (op == 'M') {
            double mediaAbaixoDiagonal = somaAbaixoDiagonal / qtd;
            System.out.printf("%.1f\n", mediaAbaixoDiagonal);
        } else if (op == 'S') {
            System.out.printf("%.1f\n", somaAbaixoDiagonal);
        }
    }
}
