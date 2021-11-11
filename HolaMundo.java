import java.util.Scanner;

//Mi clase en Java

public class HolaMundo {
    public static void main(String[] args) {
        // Convertir un tipo String a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        // Pedir un valor:
        var consola = new Scanner(System.in);
        /* System.out.println("Proporciona tu edad: "); edad =
         * Integer.parseInt(consola.nextLine()); System.out.println("Edad: " + edad);
         */
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto =" + edadTexto);

        var caracter = "hola".charAt(1);
        System.out.println("caracter: " + caracter);

        System.out.println("Propociona un caracter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter: "+ caracter);
    }
}