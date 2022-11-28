package Java.Exception;

public class Arithmetic {
    private int number;

    public int arithmeticException() {
        try {
            number = 4 / 0;
        } catch (java.lang.ArithmeticException e) {
            number = - 1;
        }
        return number;
    }
}
