package Java.OOP.Interface;

public class Cat implements Animal {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {

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
        System.out.println("야옹");
    }
}
