import java.util.Scanner;

//Mi clase en Java

public class HolaMundo {
    public static void main(String[] args) {
        /*
            tipos primitivos enteros: byte short, int , long
        */
        
        byte numeroByte = (byte)129;
        System.out.println("Valor byte" + numeroByte);
        System.out.println("Valor mínimo del byte:" + Byte.MIN_VALUE);
        System.out.println("Valor máximo del byte:" + Byte.MAX_VALUE);

        short numeroShort = (short)32768;
        System.out.println("Valor numeroShort:" + numeroShort);
        System.out.println("Valor mínimo del short:" + Short.MIN_VALUE);
        System.out.println("Valor máximo del short:" + Short.MAX_VALUE);

        int numeroInt = (int)2147483648L;
        System.out.println("Valor numeroIntt:" + numeroInt);   
        System.out.println("Valor mínimo del int:" + Integer.MIN_VALUE);
        System.out.println("Valor máximo del int:" + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L;
        System.out.println("Valor numeroLong:" + numeroLong);   
        System.out.println("Valor mínimo del long:" + Long.MIN_VALUE);
        System.out.println("Valor máximo del long:" + Long.MAX_VALUE);
    }
}