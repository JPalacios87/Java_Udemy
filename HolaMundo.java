//Mi clase en Java

public class HolaMundo {
    public static void main(String[] args) {
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // incremento
        // 1. preincremento (símbolo antes de la variable)
        var e = 3;
        var f = ++e;// primero se incremente la variable y después se asigna
        System.out.println("e = " + e);// ya está incrementada
        System.out.println("f = " + f);

        // 2. postincremento (símbolo después de la variable)
        var g = 5;
        var h = g++;// primero se asigna el valor de la variable y después se incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // decremento
        // 1. predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);// ya está decrementada
        System.out.println("j = " + j);

        // 1. posdecremento
        var k = 4;
        var l = k--;// primero se usa el valor de la variable y posteriormente se asigna
        System.out.println("k = " + k);// tenía pendiente un decremento
        System.out.println("l = " + l);
    }
}