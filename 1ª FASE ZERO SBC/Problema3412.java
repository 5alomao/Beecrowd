import java.util.Scanner;

public class Main{
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        byte n = sc.nextByte();
        sc.nextLine();
        for(byte i=0; i<n; i++){
            String nome = sc.nextLine();
            String notas = sc.nextLine();
            String[] notasAluno = notas.split(" ");
            double soma=0;
            double med=0;
            if(notasAluno.length == 1){
                soma = Double.parseDouble(notasAluno[0]);
                med = soma/2;
            }
            else if(notasAluno.length == 2){
                for(byte j=0; j<notasAluno.length;j++){
                    soma += Double.parseDouble(notasAluno[j]);
                }
                med = soma/2;
            }
            else if(notasAluno.length == 3){
                for(byte j=0; j<notasAluno.length;j++){
                    soma += Double.parseDouble(notasAluno[j]);
                }
                med = soma/3;
            }
            else if(notasAluno.length == 4){
                double menor = Double.parseDouble(notasAluno[0]);
                for(int j=0; j<notasAluno.length;j++){
                    if(menor > Double.parseDouble(notasAluno[j]))
                        menor = Double.parseDouble(notasAluno[j]);
                    soma += Double.parseDouble(notasAluno[j]);
                }
                soma -= menor;
                med = soma/3;
            }
            System.out.printf("%s: %.1f%n",nome,med);
        }
    }
}
