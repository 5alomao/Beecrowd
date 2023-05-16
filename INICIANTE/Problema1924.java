import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        String curso;
        sc.nextLine();
        while(n != 0){
            curso = sc.nextLine();
            n--;
        }
        System.out.println("Ciencia da Computacao");
    }
}
