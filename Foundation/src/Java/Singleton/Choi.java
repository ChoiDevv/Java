package Java.Singleton;

public class Choi {

    private static Choi choi;

    private Choi() {

    }

    public static Choi getInstance() {
        return choi == null ? choi = new Choi() : choi;
    }
}
