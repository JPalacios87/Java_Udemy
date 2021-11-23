package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1; // declaro una variable persona
        persona1 = new Persona(); // creo el objeto de persona
        /**
         * También se puede declarar la variable y crear el objeto en una misma línea:
         * Persona persona2 = new Persona()
         */
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();

        Persona persona2 = new Persona();
        System.out.println("persona1: " + persona1); // Se imprime la variable persona1, pero como no se imprime desde
                                                     // el método "desplegarInformación", lo que se imprime es el
                                                     // espacio de la memoria RAM reservado para el objeto persona1.
        System.out.println("persona2: " + persona2); // Igual que en la línea anterio, se está imprimiendo la referencia
                                                     // del espacio reservado en la memoria RAM para el objeto de
                                                     // persona2.

        persona2.desplegarInformacion();// Como en ningún momento le hemos especificado los valores de los atributos
                                        // nombres y apellidos, lo que se imprime es el valor de "null", que significa
                                        // ausencia de valor.

        /**
         * Los objetos tienen los mismos atributos pero no comparten la misma
         * información, ya que apuntan a diferente dirección en memoria.
         */

        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegarInformacion();
    }
}
