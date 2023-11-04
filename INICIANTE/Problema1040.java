import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double n1 = sc.nextDouble();
        n1 *= 2;
        double n2 = sc.nextDouble();
        n2 *= 3;
        double n3 = sc.nextDouble();
        n3 *= 4;
        double n4 = sc.nextDouble();
        n4 *= 1;
        
        double med = (n1+n2+n3+n4)/10;
        DecimalFormat df = new DecimalFormat("#.0");
        
        System.out.println("Media: " + df.format(med));
        if(med >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (med < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double nExame = sc.nextDouble();
            System.out.println("Nota do exame: " + df.format(nExame));
            med = (med+nExame) / 2;
            if(med >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + df.format(med));
        }
        sc.close();
    }
}
