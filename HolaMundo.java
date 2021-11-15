//Mi clase en Java

public class HolaMundo {
    public static void main(String[] args) {
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = (a != b);
        System.out.println("d = " + d);

        var cadena1 = "Hola";
        var cadena2 = "Hola";
        var e = (cadena1 == cadena2);//Compara referencias de objetos
        System.out.println("e = " + e);

        var f = cadena1.equals(cadena2);//Comparamos contenido de cadenas
        System.out.println("f = " + f);
    }
}