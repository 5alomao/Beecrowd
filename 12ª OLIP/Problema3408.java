import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (scanner.hasNext()) {
            n = scanner.nextInt();
            scanner.nextLine();
            int total = 0;

            for (int i = 0; i < n; i++) {
                String value = scanner.nextLine();
                int numericValue = extractNumericValue(value);
                total += numericValue;
            }

            System.out.println(total);
        }
    }

    public static int extractNumericValue(String value) {
        String numericString = value.replaceAll("[^0-9]", "");
        return Integer.parseInt(numericString);
    }
}
