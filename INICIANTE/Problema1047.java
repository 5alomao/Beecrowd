import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();

        int duracaom;

        if (h1 < h2 || (h1 == h2 && m1 < m2)) {
            duracaom = (h2 - h1) * 60 + (m2 - m1);
        } else {
            duracaom = (24 - h1) * 60 - m1 + h2 * 60 + m2;
        }

        int duracaoh = duracaom / 60;
        int duracaomin = duracaom % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoh, duracaomin);

        sc.close();
    }
}
