import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        
        double raio;
        double pi = 3.14159;
        raio = ent.nextDouble();
        double area = raio*raio*pi;
        
        System.out.printf("A=%.4f\n",area);
    }
}
