import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        int v = s.nextInt();
        int ncem=0,ncinq=0,nvin=0,ndez=0,ncin=0,ndois=0,num=0;
        int valor = v;
        
        do{
            
            if(valor>=100){
                valor-=100;
                ncem++;
            }else if(valor < 100 && valor >= 50){
                valor-=50;
                ncinq++;
            }else if(valor < 50 && valor >= 20){
                valor-=20;
                nvin++;
            }else if(valor < 20 && valor >= 10){
                valor-=10;
                ndez++;
            }else if(valor < 10 && valor >= 5){
                valor-=5;
                ncin++;
            }else if(valor < 5 && valor >= 2){
                valor-=2;
                ndois++;
            }else{
                valor-=1;
                num++;
            }
            
        }while(valor!=0);
        
        System.out.printf("%d\n",v);
        System.out.printf("%d nota(s) de R$ 100,00\n",ncem);
        System.out.printf("%d nota(s) de R$ 50,00\n",ncinq);
        System.out.printf("%d nota(s) de R$ 20,00\n",nvin);
        System.out.printf("%d nota(s) de R$ 10,00\n",ndez);
        System.out.printf("%d nota(s) de R$ 5,00\n",ncin);
        System.out.printf("%d nota(s) de R$ 2,00\n",ndois);
        System.out.printf("%d nota(s) de R$ 1,00\n",num);
    }
}
