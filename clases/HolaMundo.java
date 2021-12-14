//Mi clase en Java
public class HolaMundo {
    public static void main(String[] args) {
        inicio:
        for (var contador = 0; contador < 31; contador++) {
            if (contador % 2 == 0) {
                continue inicio; // Ir a la siguiente iteracion del ciclo for
            }
            System.out.println("Contador =  " + contador);
        }

        /**
         * for (var contador = 0; contador < 3; contador++) { if (contador % 2 == 0) {
         * System.out.println("Contador = " + contador); break; }
         * 
         * }
         */

        /*
         * var contador = 0; while (contador < 3) { System.out.println("Contador =  " +
         * contador); contador++; } System.out.println("contador = " + contador);
         */

        /*
         * var contador = 0; do { System.out.println("Contador =  " + contador);
         * contador++; } while (contador < 0);
         */
    }
}
