import java.util.Scanner;

//Mi clase en Java

public class HolaMundo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Introduce el mes en número para saber la estación: ");
        var mes = Integer.parseInt(scanner.nextLine());
        var estacion = "Estación desconocida";
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        }
        System.out.println("Estación = " + estacion);
    }
}