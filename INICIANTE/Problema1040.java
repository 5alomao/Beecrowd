import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        double n1 = s.nextDouble();
        double n2 = s.nextDouble();
        double n3 = s.nextDouble();
        double n4 = s.nextDouble();
        
        double media = (n1*2+n2*3+n3*4+n4*1)/10;
        System.out.printf("Media: %.1f\n",media);
        
        if(media >= 7){
            System.out.printf("Aluno aprovado.\n");
        }
        else if(media < 5){
            System.out.printf("Aluno reprovado.\n");
        }
        else if(media >= 5 && media <= 6.9){
            System.out.printf("Aluno em exame.\n");
            double exame = s.nextDouble();
            System.out.printf("Nota do exame: %.1f\n",exame);
            media = (media+exame)/2;
            if(media >= 5)
                System.out.printf("Aluno aprovado.\n");
            else
                System.out.printf("Aluno reprovado.\n");
            System.out.printf("Media final: %.1f\n",media);
        }
    }
}
