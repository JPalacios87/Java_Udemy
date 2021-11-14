//Mi clase en Java

public class HolaMundo {
    public static void main(String[] args) {
        // var is not availabel in a compound declaration
        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println("c = " + c);

        a += 1; //a = a + 1
        System.out.println("a = " + a);

        a += 3; //a = a + 3
        System.out.println("a = " + a);

        a -= 2; //a = a - 2
        System.out.println("a = " + a);
    }
}