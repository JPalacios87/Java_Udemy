//Mi clase en Java

public class HolaMundo {
    public static void main(String[] args) {
        var condición = true;

        if (condición) {
            System.out.println("Condición verdadera");
        } else {// El else es opcional, podría no estar y ejecutarse solo el if.
            System.out.println("Condición falsa");
        }

        var numero = 3;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            numeroTexto = "Numero tres";
        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}