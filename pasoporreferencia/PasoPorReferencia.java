//Clases que existen en distintos paquetes puede interactuar entre sí.

package pasoporreferencia; //Nombre del paquete en el que se encuentra esta clase.

import clases.Persona; //Importo la clase "Persona" del paquete llamado "clases". Puede haber más de un import.

public class PasoPorReferencia { // El nombre de la clase.
    public static void main(String[] args) { // En cada paquete tiene que haber una clase que lleve el método main.
        Persona persona1 = new Persona(); // Creo un objeto de la clase de la clase Persona.
        persona1.nombre = "Juan";
        System.out.println("persona1 nombre: " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("persona1 nombre: " + persona1.nombre);
    }

    public static void cambiarValor(Persona persona) { // Es una variable llamada "persona" que se destruirá cuando
                                                       // termine el método "cambiarValor".
        /**
         * El método cambiarValor no devuelve ningún valor, pero está apuntando a la
         * misma referencia de memoria que tiene la variable "persona1". Por ello,
         * cuando termine de ejecutarse este método, modificará el valor que esté
         * almacenado en la memoria.
         */
        persona.nombre = "Carla"; // no hace falta hacer return porque el método es void.
    }
}