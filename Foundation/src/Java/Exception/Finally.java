package Java.Exception;

public class Finally {
    private int number;

    public int arithmeticExceptionFinally() {
        try {
            number = 4 / 0;
        } catch (java.lang.ArithmeticException e) {
            number = - 1;
        } finally {
            number = 0;
        }
        return number;
    }
}
