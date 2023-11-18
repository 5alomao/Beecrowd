import java.util.Scanner;

public class Main {
    
    public static void printVet(int cont, int[] vet) {
        if(vet[0] % 2 == 0) {
            for(int i=0; i < cont; i++) {
                System.out.println("par["+i+"] = "+vet[i]);
            }    
        } else {
            for(int i=0; i < cont; i++) {
                System.out.println("impar["+i+"] = "+vet[i]);
            }
        }
    } 
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] par = new int[5];
        int[] impar = new int[5];
        int cp=0, ci=0;
        for(int i=0; i<15; i++) {
            int num = sc.nextInt();
            if(cp == 5) {
                printVet(cp,par);
                cp=0;
            }
            if(ci == 5) {
                printVet(ci, impar);
                ci=0;
            }
            if(num % 2 == 0){
                par[cp] = num;
                cp++;
            } else {
                impar[ci] = num;
                ci++;
            }
        }
        printVet(ci, impar);
        printVet(cp, par);
        sc.close();
    }
}
