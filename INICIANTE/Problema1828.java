import java.util.Scanner;

public class Main{
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int x=1;
        while(t != 0){
            
            String sheldon = sc.next();
            String raj = sc.next();
            
            if(sheldon.equals(raj))
                System.out.println("Caso #"+x+": De novo!");
            else{
                if( 
                (sheldon.equals("tesoura") && (raj.equals("papel") || raj.equals("lagarto"))) ||
                (sheldon.equals("papel") && (raj.equals("pedra") || raj.equals("Spock"))) ||
                (sheldon.equals("pedra") && (raj.equals("lagarto") || raj.equals("tesoura"))) ||
                (sheldon.equals("lagarto") && (raj.equals("Spock") || raj.equals("papel"))) ||
                (sheldon.equals("Spock") && (raj.equals("tesoura") || raj.equals("pedra"))))
                    System.out.println("Caso #"+x+": Bazinga!");
                else 
                   System.out.println("Caso #"+x+": Raj trapaceou!"); 
            }
            t--;
            x++;
        }
    }
}
