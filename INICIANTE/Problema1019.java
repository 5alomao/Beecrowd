import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        int sec = s.nextInt();
        int h=0,m=0,se=0;
        while(sec!=0){
            if(sec > 3600){
                sec-=3600;
                h++;
            }else if(sec < 3600 && sec >= 60){
                sec-=60;
                m++;
            }else{
                sec-=1;
                se++;
            }
        }
        System.out.printf("%d:%d:%d\n",h,m,se);
    }
}
