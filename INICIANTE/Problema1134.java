import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int op;
        int gas=0,alc=0,dis=0;
        do{
            op = sc.nextInt();
            switch(op){
                case 1:
                    alc++;
                    break;
                case 2:
                    gas++;
                    break;
                case 3:
                    dis++;
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }while(op!=4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alc);
        System.out.println("Gasolina: "+gas);
        System.out.println("Diesel: "+dis);
    }
}
