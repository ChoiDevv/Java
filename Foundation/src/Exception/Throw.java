package Exception;

public class Throw {

    private int number;

    public int arithmeticExceptionThrow() {
        try {
            number = 4 / 0;
        } catch (java.lang.ArithmeticException e) {
            throw new NumberException();
        }
        return number;
    }
}
