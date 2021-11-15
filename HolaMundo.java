//Mi clase en Java

public class HolaMundo {
    public static void main(String[] args) {
        var resultado = (1 > 2) ? "verdadero" : "falso"; // es una simplificación de la estructura "if else"
        System.out.println("resultado = " + resultado);

        var numero = 8;
        resultado = (numero % 2 == 0) ? "es par" : "es impar";
        System.out.println("resultado = " + resultado);
    }
}