import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 1;

        for (int i = 1; i <= y; i++) {
            System.out.print(i);

            if (count == x) {
                System.out.println();
                count = 0;
            } else if (i != y) {
                System.out.print(" ");
            }

            count++;
        }

        sc.close();
    }
}
