import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        int x =s.nextInt();
        
        int a=0,m=0,d=0;
        
        while(x!=0){
            if(x>365){
                x-=365;
                a++;
            }else if(x < 365 && x >= 30){
                x-=30;
                m++;
            }else{
                x-=1;
                d++;
            }
        }
        System.out.println(a + " ano(s)");
        System.out.println(m + " mes(es)");
        System.out.println(d + " dia(s)");
    }
}
