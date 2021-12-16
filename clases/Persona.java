package clases;

public class Persona { // Todas las clases en Java heredan de la clase "Object". Es la clase padre de
                       // todas las clases en Java.
    // Los atributos de la clase llevan antes la palabra "public" para que puedan
    // ser accesibles desde otras clases de otros paquetes en Java. Pero no es buena
    // práctica. La mejor práctica es el encapsulamiento.
    public String nombre;
    public String apellido;

    public void desplegarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

}
