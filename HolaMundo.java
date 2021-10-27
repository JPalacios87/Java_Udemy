//Mi clase en Java

public class HolaMundo {
    public static void main(String[] args) {
        //Defino la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modifico el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adiós";
        System.out.println(miVariableCadena);

        // var - Inferencia de tipos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        var miVariableCadena2 = "Valeria";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        //var áVariable = 10; No se recomienda utilizar
        //var #Variable = 2; No se permite utilizar caracteres especiales
    }
} 
