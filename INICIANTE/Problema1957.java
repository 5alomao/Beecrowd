import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int V = scanner.nextInt();

        String hexadecimal = Integer.toHexString(V).toUpperCase();

        System.out.println(hexadecimal);
    }
}
