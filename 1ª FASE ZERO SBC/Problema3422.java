import java.util.Scanner;

public class Main{
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        byte n = sc.nextByte();
        sc.nextLine();
        for(byte i=0; i<n;i++){
            
            String registro = sc.nextLine();
            String[] partes = registro.split(" ");
            int o = Integer.parseInt(partes[0]);
            String t = partes[1]; 
            
            if(t.equals("1T")){
                if(o > 45){
                    o-=45;
                    System.out.println("45+"+o);
                }
                else
                    System.out.println(o);
            }else if(t.equals("2T")){
                o+=45;
                if(o > 90){
                    o-=90;
                    System.out.println("90+"+o);
                }
                else
                    System.out.println(o);
            }
        }
    }
}
