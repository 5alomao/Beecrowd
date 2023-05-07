import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        boolean formouTriangulo = false;
        
        if (podeFormarTriangulo(a, b, c)) {
            formouTriangulo = true;
        } else if (podeFormarTriangulo(a, b, d)) {
            formouTriangulo = true;
        } else if (podeFormarTriangulo(a, c, d)) {
            formouTriangulo = true;
        } else if (podeFormarTriangulo(b, c, d)) {
            formouTriangulo = true;
        }
        
        if (formouTriangulo) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
    
    private static boolean podeFormarTriangulo(int a, int b, int c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }
}
