import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
         
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int duracaoh = 0;
        int duracaom = 0;
        
        if(h1 < h2)
            duracaoh = h2-h1;
        else
            duracaoh = 24-h1+h2;
            
        if(m1 < m2)
            duracaom = m2-m1;
        else{
            duracaom = 60-m1+m2;
            if(duracaom == 60){
                duracaoh += 1;
                duracaom = 0;
            }
            duracaoh-=1;
        }
            
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",duracaoh,duracaom);
    }
}
