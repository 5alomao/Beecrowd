import java.util.Scanner;

public class Main{
    
    public static void main (String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        int qtd = sc.nextInt();
        int bc = sc.nextInt();
        int[] nat = new int [qtd];
        int[] sam = new int [qtd];
        int contbn = 0;
        int contbs = 0;
        
        for(int i =0; i<qtd; i++){
            nat[i] = sc.nextInt();
            if(nat[i] == 1)
                contbn++;
        }
        
        for(int i =0; i<qtd; i++){
            sam[i] = sc.nextInt();
            if(sam[i] == 1)
                contbs++;
        }
        
        if(contbn == bc)
            System.out.println("Tudo certo.");
        else if(contbn != bc && contbs == bc)
            System.out.println("Pegou de Samuel.");
        else
            System.out.println("Pegou de um estranho.");
    }
}
