package Extends;

public class Do {
    public static void main(String[] args) {
        String main = "Java";
        Java java = new Java(main);
        Programming programming = new Programming(main);
        System.out.println("Programming Class: " + programming.name);
        System.out.println("Java Class: " + java.name);
        java.coding();
    }
}
