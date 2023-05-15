import java.util.Scanner;

public class Main{
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        while(sc.hasNext()){
            int t = sc.nextInt();
            int[] vet = new int[t];
            int maior = vet[0];
            for(int i=0; i<t; i++){
                vet[i] = sc.nextInt();
                if(vet[i] > maior)
                    maior = vet[i];
            }
            if(maior < 10)
                System.out.println(1);
            else if(maior >= 10 && maior < 20)
                System.out.println(2);
            else if(maior >= 20)
                System.out.println(3);
        }
    } 
}
