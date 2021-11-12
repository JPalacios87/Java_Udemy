import java.util.Scanner;

public class TiendaLibros {
    public static void main(String[] args) {

        var consolaNombre = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        var nombre = consolaNombre.nextLine();

        var consolaId = new Scanner(System.in);
        System.out.println("Proporciona el Id: ");
        var id = consolaId.nextLine();
        Integer.parseInt(id);

        var consolaPrecio = new Scanner(System.in);
        System.out.println("Proporciona el precio: ");
        var precio = consolaPrecio.nextLine();
        Double.parseDouble(precio);
        var euro = '\u20AC';

        var consolaEnvioGratuito = new Scanner(System.in);
        System.out.println("Proporciona el envío gratuito: ");
        var envioGratuito = Boolean.valueOf(consolaEnvioGratuito.nextLine());

        // Imprimo el resultado
        System.out.println("Nombre: \n" + nombre + " #" + id + "\n" + "precio: €" + precio + " " + euro + "\n"
                + "Envio gratuito: " + envioGratuito);

        /*
         * import java.util.Scanner;
         * 
         public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Proporciona el nombre:");
                String nombre = scanner.nextLine();
                System.out.println("Proporciona el id:");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Proporciona el precio:");
                double precio = Double.parseDouble(scanner.nextLine());
                System.out.println("Proporciona el envio gratuito:");
                boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
        
                System.out.println(nombre + " #" + id);
                System.out.println("Precio: $" + precio);
                System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
         */
    }
}
