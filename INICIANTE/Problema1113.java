import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        do{
            if(x > y){
                System.out.println("Decrescente");
            }else if(x < y){
                System.out.println("Crescente");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }while(x!=y);
    }
}
