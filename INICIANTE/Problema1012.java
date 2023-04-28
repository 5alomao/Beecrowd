import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        double x = s.nextDouble();
        double y = s.nextDouble();
        double z = s.nextDouble();
        double pi = 3.14159;
        double at,ac,atra,aqua,aret;
        at= (x*z)/2;
        ac = pi * z * z;
        atra = ((x+y)*z)/2;
        aqua = y * y;
        aret = x * y;
        
        System.out.printf("TRIANGULO: %.3f\n",at);
        System.out.printf("CIRCULO: %.3f\n",ac);
        System.out.printf("TRAPEZIO: %.3f\n",atra);
        System.out.printf("QUADRADO: %.3f\n",aqua);
        System.out.printf("RETANGULO: %.3f\n",aret);
    }
}
