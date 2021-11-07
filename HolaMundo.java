import java.util.Scanner;

//Mi clase en Java

public class HolaMundo {
    public static void main(String[] args) {
        /*
            tipos primitivos de tipo flotante: float y double 
        */
        
        float numeroFloat = (float)3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor mínimo tipo float = " + Float.MIN_VALUE);
        System.out.println("Valor máximo tipo float = " + Float.MAX_VALUE);

        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor míninmo tipo double = " + Double.MAX_VALUE);
        System.out.println("Valor máximo tipo float = " + Double.MAX_VALUE);
    }
}