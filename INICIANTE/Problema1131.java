import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int op=1;
        int g=1;
        int vi=0,vg=0,emp=0;
        
        do{
            int goli = sc.nextInt();   
            int golg = sc.nextInt(); 
            
            if(goli > golg)
                vi++;
            else if(golg > goli)
                vg++;
            else
                emp++;            
            
            System.out.println("Novo grenal (1-sim 2-nao)");
            op = sc.nextInt();
            if(op == 1)
                g++;
        }while(op!=2);
        
        System.out.println(g+" grenais");
        System.out.println("Inter: "+vi);
        System.out.println("Gremio: "+vg);
        System.out.println("Empates: "+emp);
        if(vi > vg)
            System.out.println("Inter venceu mais");
        else if(vg > vi)
            System.out.println("Gremio venceu mais");
        else
            System.out.println("Nao houve vencedor");
    }
}
