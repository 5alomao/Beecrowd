import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        while (k != 0) {
            int xd = sc.nextInt();
            int yd = sc.nextInt();

            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                if (x == xd || y == yd) {
                    System.out.println("divisa");
                } else if (x > xd && y > yd) {
                    System.out.println("NE");
                } else if (x > xd && y < yd) {
                    System.out.println("SE");
                } else if (x < xd && y > yd) {
                    System.out.println("NO");
                } else {
                    System.out.println("SO");
                }
            }
            
            k = sc.nextInt();
        }
    }
}
