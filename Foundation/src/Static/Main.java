package Static;

public class Main {
    public static void main(String[] args) {
        /*
        * Whosegoods company = new Whosegoods();
        System.out.println("스트링으로 비교하기");
        System.out.println(company.name);
        System.out.println(Whosegoods.staticName); */

        System.out.println("\n");
        System.out.println("정수형으로 비교하기");
        Whosegoods people1 = new Whosegoods();
        Whosegoods people2 = new Whosegoods();

        System.out.println("스태틱 메소드로 접근하기");
        System.out.println(people1.people);
        System.out.println(Whosegoods.getStaticPeople());
    }
}
