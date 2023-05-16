import java.util.Scanner;

public class Main{
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        
        String romano = "";
        int[] v = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] simb = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        int num = sc.nextInt();
        
        for(int i=0; i<v.length; i++){
            while(num >= v[i]){
                romano += simb[i];
                num-=v[i];
            }
        }
        
        System.out.println(romano);
    }
}
