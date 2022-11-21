package Extends;

import java.time.LocalDateTime;

public class Do {
    public static void main(String[] args) {
        String main = "Java";
        LocalDateTime now = LocalDateTime.now();
        Java java = new Java(main);
        Programming programming = new Programming(main);

        System.out.println("Programming Class: " + programming.name);
        System.out.println("Java Class: " + java.name);
        java.coding();

        Spring spring = new Spring("Java Spring");
        spring.coding();
        spring.coding(now);
    }
}
