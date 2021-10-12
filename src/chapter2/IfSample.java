package chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) System.out.println("x փոքր է y-ից");
        x = x * 2;
        if (x == y) System.out.println("x հավասար է y");
        x = x * 2;
        if (x > y) System.out.println("x մեծ է y-ից");
        if (x == y) System.out.println("ոչ մի բան չի ցույց տա");

    }
}
