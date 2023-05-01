import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int x = sc.nextInt();
        int cont=0;
        do{
            if(x%2!=0){
                System.out.println(x);
                x++;
                cont++;
            }
            else
                x++;
        }while(cont!=6);
        
    }
}
