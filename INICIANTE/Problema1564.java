import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    while(sc.hasNext()){
	        int op = sc.nextInt();
	        
	        if(op == 0)
	            System.out.println("vai ter copa!");
	        else
	            System.out.println("vai ter duas!");
	    }
	    sc.close();
	}
}
