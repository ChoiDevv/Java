package Java.OOP.Interface;

public class Dog implements Animal {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {

    }

    @Override
    public void move() {
        System.out.println("걷는다.");
    }

    @Override
    public void eat() {
        System.out.println("먹는다.");
    }

    @Override
    public void bark() {
        System.out.println("멍멍");
    }
}
