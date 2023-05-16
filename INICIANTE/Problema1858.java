import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] t = new int[n];
        int menor = Integer.MAX_VALUE;
        int op = 0;

        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            if (t[i] < menor) {
                menor = t[i];
                op = i + 1;
            }
        }
        System.out.println(op);
    }
}
