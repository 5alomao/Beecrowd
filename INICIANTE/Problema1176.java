import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int num = sc.nextInt();

            if (num == 0) {
                System.out.println("Fib(0) = 0");
            } else if (num == 1) {
                System.out.println("Fib(1) = 1");
            } else {
                long a = 0;
                long b = 1;
                long res = 0;
                for (int j = 2; j <= num; j++) {
                    res = a + b;
                    a = b;
                    b = res;
                }
                System.out.println("Fib(" + num + ") = " + res);
            }

        }

        sc.close();

    }
}
