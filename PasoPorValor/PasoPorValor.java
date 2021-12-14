package PasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("valor x = " + x);
        cambioValor(x);

        System.out.println("valor x nuevo valor = " + x);
        ;
    }

    public static void cambioValor(int arg1) {
        System.out.println("valor arg1 = " + arg1);
        arg1 = 15;
        /**
         * CUANDO SE TRABAJA CON TIPOS PRIMITIVOS EN JAVA:
         * Cuando se llama desde el método main al método "cambioValor" lo que se está
         * pasando es una copia del valor de "x". 
         * Aunque se modifica el valor de arg1 a "15", no se puede devolver ese valor
         * modificado a la variable "x" del método main porque no es accesible dentro
         * del método "cambioValor".
         * Al salir del método "cambioValor" la variable "arg1" se destruye (previamente
         * su valor ha cambiado a "15")
         */
    }
}
