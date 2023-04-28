import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int a,b;
        int soma=0;
        a=s.nextInt();
        b=s.nextInt();
        soma= a+b;
        System.out.printf("SOMA = %d\n",soma);
    } 
}
