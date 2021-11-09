import java.util.Scanner;

//Mi clase en Java

public class HolaMundo {
    public static void main(String[] args) {
        boolean varBoolean = false;
        System.out.println("valor varBoolean:" + varBoolean);

        if (varBoolean == true) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }

        var edad = 10;
        //var esAdulto = edad >= 18; //se define el valor de la variable con una expresión que devuelve o true o false.
        if (edad >= 18) { //aunque no está escrito explícitamente, dentro del if se pregunta si la variable esAdulto es true.
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}