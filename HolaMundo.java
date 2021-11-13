//Mi clase en Java

public class HolaMundo {
    public static void main(String[] args) {
        // var is not availabel in a compound declaration
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("Resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("Resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("Resultado multiplicación = " + resultado);

        var resultado2 = 3D / b;
        System.out.println("Resultado división= " + resultado2);

        resultado = a % b;
        System.out.println("Resultado resto = " + resultado);

        if (b % 2 == 0) {
            System.out.println("Es número par");
        } else {
            System.out.println("Es número impar");
        }
    }
}