package constructor;

class Person {
    Person() {
        System.out.println("Person called");
    }
}

class Child extends Person {
    Child() {
        super();
        System.out.println("Child called");
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
    }
}