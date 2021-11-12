import java.util.Scanner;

public class TiendaLibros {
    public static void main(String[] args) {
        
        var consolaNombre = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        var nombre = consolaNombre.nextLine();
        
        var consolaId = new Scanner(System.in);
        System.out.println("Introduce el Id: ");
        var id = consolaId.nextLine();
        Integer.parseInt(id);

        var consolaPrecio = new Scanner(System.in);
        System.out.println("Introduce el precio: ");
        var precio = consolaPrecio.nextLine();

        var consolaEnvioGratuito = new Scanner(System.in);
        System.out.println("¿Envío gratuito?: ");
        var envioGratuito = consolaEnvioGratuito.nextLine();

        System.out.println(
            "Nombre: \n" + nombre + " #" + id + "\n" +
            "precio: " + precio + " Euros" + "\n" +
            "Envio gratuito: " + envioGratuito
            );
    }
}
