package constructor;

public class Number {
    int a;

    Number() {
        a = 10;
    }

    Number(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Number n = new Number();
        Number n1 = new Number(20);
        Number n2 = new Number(30);

        System.out.println(n.a);
        System.out.println(n1.a);
        System.out.println(n2.a);
    }
}