package Java.Static;

public class Whosegoods {

    String name = "whosegoods";
    static String staticName = "whosegoods";
    int people = 0;
    static int staticPeople = 0;

    public Whosegoods() {
        people++;
        System.out.println("Primitive");
        System.out.println(people);

        System.out.println("Static");
        staticPeople++;
        System.out.println(staticPeople);
    }

    public static int getStaticPeople() {
        return staticPeople;
    }
}
