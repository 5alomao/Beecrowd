public class Main {
    public static void main(String[] args) {
        double i = 0.0;
        double y = 1.0;
        double tolerance = 0.0001;

        while (i <= 2) {
            if (Math.abs(i - Math.round(i)) < tolerance) {
                System.out.printf("I=%.0f J=%.0f\n", i, y);
                System.out.printf("I=%.0f J=%.0f\n", i, y + 1);
                System.out.printf("I=%.0f J=%.0f\n", i, y + 2);
            } else {
                System.out.printf("I=%.1f J=%.1f\n", i, y);
                System.out.printf("I=%.1f J=%.1f\n", i, y + 1);
                System.out.printf("I=%.1f J=%.1f\n", i, y + 2);
            }
            i += 0.2;
            y += 0.2;
        }
    }
}
