package Java.OOP.Abstract;

public class Cat extends Animal{

    public Cat() {
        super();

    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("야옹");
    }
}
