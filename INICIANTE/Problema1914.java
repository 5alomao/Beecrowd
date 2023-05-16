import java.util.Scanner;

public class Main{
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int qt = sc.nextInt();
        
        String n1,op1,n2,op2;
        int num1, num2;
        
        while(qt!=0){
            int soma=0;
            n1 = sc.next();
            op1 = sc.next();
            n2 = sc.next();
            op2 = sc.next();
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            soma = num1 + num2;
            if(soma % 2 == 0){
                if(op1.equals("PAR"))
                    System.out.println(n1);
                else if(op2.equals("PAR"))
                    System.out.println(n2);
            }else{
                if(op1.equals("IMPAR"))
                    System.out.println(n1);
                else if(op2.equals("IMPAR"))
                    System.out.println(n2);
            }
            qt--;
        }
    }
}
