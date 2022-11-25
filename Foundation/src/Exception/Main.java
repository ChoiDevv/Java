package Exception;

public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        Finally finallyClass = new Finally();
        Throw throwClass = new Throw();

        System.out.println(arithmetic.arithmeticException());
        System.out.println(finallyClass.arithmeticExceptionFinally());
        System.out.println(throwClass.arithmeticExceptionThrow());
    }
}
