package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("Persona = " + persona);
        System.out.println("Persona Nombre = " + persona.nombre);
        System.out.println("Persona Nombre = " + persona.apellido);
    }
}

/** 
 * En Java, solo podemos dentro del mismo archivo una clase de tipo público y el
 * resto de clases ya no se les va a agregar este modificador de acceso, ya que
 * solo se van a poder utilizar dentro de esta clase o dentro del mismo paquete.
 */

class Persona { 
    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}