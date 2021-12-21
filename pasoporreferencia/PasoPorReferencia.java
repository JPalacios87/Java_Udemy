//Clases que existen en distintos paquetes puede interactuar entre sí.

package pasoporreferencia; //Nombre del paquete en el que se encuentra esta clase.

import clases.Persona; //Importo la clase "Persona" del paquete llamado "clases". Puede haber más de un import.

public class PasoPorReferencia { // El nombre de la clase.
    public static void main(String[] args) { 
        Persona persona1 = null; //Provocamos un error en tiempo de ejecución. NullPointerException
        //persona1.nombre = "Juan";
        //System.out.println("persona1 nombre: " + persona1.nombre);
        persona1 = cambiarValor(persona1);
        System.out.println("persona1 cambionombre: " + persona1.nombre);
    }

    public static Persona cambiarValor(Persona persona) {
        if (persona == null) {
            System.out.println("Valor de persona invalido: null");
            return null;
        } else
            persona.nombre = "Carla";
        return persona;
    }
}