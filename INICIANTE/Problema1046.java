import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
         
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int duracao = 0;
        if(t1 < t2)
            duracao = t2-t1;
        else if(t2 < t1)
            duracao = 24-t1+t2;

        if(t1 == t2)
            System.out.println("O JOGO DUROU 24 HORA(S)");
        else{
            System.out.printf("O JOGO DUROU %d HORA(S)\n",duracao);
        }
    }
}
