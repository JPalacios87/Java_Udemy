package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1; //declaro una variable persona
        persona1 = new Persona(); // creo el objeto de persona
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
    }
}
