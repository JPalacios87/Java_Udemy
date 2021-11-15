//Mi clase en Java

public class HolaMundo {
    public static void main(String[] args) {
        var a = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var resultado = a >= valorMinimo && a <= valorMaximo; // operador 'and' (&&) evalua ambas expresiones y las dos
                                                              // tiene que ser verdaderas, de los contrario es false
        if (resultado) {
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }
        var vacaciones = false;
        var diaDescanso = true;

        if (vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego del hijo");
        } else {
            System.out.println("El padre está ocupado");
        }
    }
}