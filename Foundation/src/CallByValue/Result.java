package CallByValue;

public class Result {

    public static void main(String[] args) {
        Number number = new Number();
        Updater update = new Updater();

        update.update(number.number);
        System.out.println(number);

        update.newUpdate(number);
        System.out.println(number);
    }
}
