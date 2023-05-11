import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nc = sc.nextInt();
		
		for(int i=1; i<=nc; i++){
		    
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    List<Integer> circulo = new ArrayList<>();
		    for(int y=1;y<=n;y++){
		        circulo.add(y);
		    }
		    
		    int posicao=0;
		    while(circulo.size() > 1){
		        posicao = (posicao + k - 1)%circulo.size();
		        circulo.remove(posicao);
		    }
		    System.out.printf("Case %d: %d%n",i,circulo.get(0));
		}
	}
}
