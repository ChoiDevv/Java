package Java.Singleton;

public class Family {
    public static void main(String[] args) {
        Choi choi1 = Choi.getInstance();
        Choi choi2 = Choi.getInstance();
        System.out.println(choi1 == choi2);
    }
}
