import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el alto: ");
        int alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho: ");
        int ancho = Integer.parseInt(consola.nextLine());

        // Calculo el area
        int area = alto * ancho;
        // Calculo del perímetro
        int perimetro = (alto + ancho) * 25;

        System.out.println("Area: " + area + "\n" + "Perímetro: " + perimetro);

    }
}
