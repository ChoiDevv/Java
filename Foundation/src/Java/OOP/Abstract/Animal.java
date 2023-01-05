package Java.OOP.Abstract;

public abstract class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {

    }

    public void move() {
        System.out.println("걷는다.");
    }

    public void drink() {
        System.out.println("마신다.");
    }

    public abstract void bark();
}
