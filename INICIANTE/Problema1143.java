import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;

        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\n",count,count*count,count*count*count);
            count++;
        }
    }
}
