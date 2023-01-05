package Java.OOP.Abstract;

public class Dog {

    private String name;
    private int age;

    public Dog() {

    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move() {
        System.out.println("걷는다.");
    }

    public void drink() {
        System.out.println("마신다.");
    }

    public void bark() {
        System.out.println("멍멍");
    }
}
