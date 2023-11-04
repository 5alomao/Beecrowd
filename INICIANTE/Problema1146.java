import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int x = sc.nextInt();
        StringBuilder saida = new StringBuilder();
        while(x != 0) {
            for(int i = 1; i <= x; i++){
                if(i == x)
                    saida.append(i);
                else
                    saida.append(i).append(" ");
            }
            System.out.println(saida.toString());
            saida.setLength(0);
            x = sc.nextInt();
        } 
        
        sc.close();
    }
}
