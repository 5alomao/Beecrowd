import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        String a = sc.nextLine();
        String b =  sc.nextLine();
        String c =  sc.nextLine();
        
        if(a.equals("vertebrado")){
            if(b.equals("ave")){
                if(c.equals("carnivoro"))
                    System.out.println("aguia");
                else if(c.equals("onivoro"))
                    System.out.println("pomba");
            }else if(b.equals("mamifero")){
                if(c.equals("herbivero"))
                    System.out.println("vaca");
                else if(c.equals("onivoro"))
                    System.out.println("homem");
            }
        }else if(a.equals("invertebrado")){
            if(b.equals("inseto")){
                if(c.equals("hematofago"))
                    System.out.println("pulga");
                else if(c.equals("herbivoro"))
                    System.out.println("lagarta");
            }else if(b.equals("anelideo")){
                if(c.equals("hematofago"))
                    System.out.println("sanguessuga");
                else if(c.equals("onivoro"))
                    System.out.println("minhoca");
            }
        }
        
    }
}
