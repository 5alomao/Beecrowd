import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");
        int diaInicio = Integer.parseInt(entrada[1]);


        entrada = sc.nextLine().split(" : ");
        int horaInicio = Integer.parseInt(entrada[0]);
        int minutoInicio = Integer.parseInt(entrada[1]);
        int segundoInicio = Integer.parseInt(entrada[2]);


        entrada = sc.nextLine().split(" ");
        int diaTermino = Integer.parseInt(entrada[1]);


        entrada = sc.nextLine().split(" : ");
        int horaTermino = Integer.parseInt(entrada[0]);
        int minutoTermino = Integer.parseInt(entrada[1]);
        int segundoTermino = Integer.parseInt(entrada[2]);

        int totalSegundos = (diaTermino - diaInicio) * 86400 + (horaTermino - horaInicio) * 3600 + (minutoTermino - minutoInicio) * 60 + (segundoTermino - segundoInicio);

        
        int dias = totalSegundos / 86400;
        totalSegundos %= 86400;
        int horas = totalSegundos / 3600;
        totalSegundos %= 3600;
        int minutos = totalSegundos / 60;
        totalSegundos %= 60;
        int segundos = totalSegundos;

        System.out.printf("%d dia(s)\n%d hora(s)\n%d minuto(s)\n%d segundo(s)\n", dias, horas, minutos, segundos);

        sc.close();
    }
}
