//Mi clase en Java

public class HolaMundo {
    public static void main(String[] args) {
        String nombre = "Karla";

        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");//uso el simbolo \ para escapar lo que le siga a continuación, incluso comillas simples
        System.out.println("Comilla doble: \"" + nombre + "\" ");//uso el simbolo \ para escapar lo que le siga a continuación, incluso comillas dobles
    }
}