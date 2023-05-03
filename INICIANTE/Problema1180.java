import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] vetor = new int[n];
        
        for(int i=0; i<n; i++){
            vetor[i] = sc.nextInt();
        }
        
        int menor = vetor[0];
        int pos=0;
        
        for(int i=0;i<n;i++){
            if(vetor[i] < menor){
                menor = vetor[i];
                pos=i;
            }
        }
        System.out.println("Menor Valor: "+menor);
        System.out.println("Posicao: "+pos);
    } 
}
