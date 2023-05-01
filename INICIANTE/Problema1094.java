import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        int total = 0;
        int c=0,r=0,s=0;
        double pc,pr,ps;
        for(int i=0; i<n; i++){
            int q = sc.nextInt();
            char t = sc.next().charAt(0);
            if(t == 'C')
                c+=q;
            else if(t == 'R')
                r+=q;
            else if(t == 'S')
                s+=q;
                
            total += q;
        }
        pc = c*100.0/total;
        pr = r*100.0/total;
        ps = s*100.0/total;
        System.out.printf("Total: %d cobaias\n",total);
        System.out.println("Total de coelhos: "+c);
        System.out.println("Total de ratos: "+r);
        System.out.println("Total de sapos: "+s);
        System.out.printf("Percentual de coelhos: %.2f %%\n",pc);
        System.out.printf("Percentual de ratos: %.2f %%\n",pr);
        System.out.printf("Percentual de sapos: %.2f %%\n",ps);
    }
}
