package Java.Encapsulation;

public class Service {
    public static void main(String[] args) {

        User user = new User();
        user.setUserId("TEST ID");

        System.out.println(user.getUserId() + "입니다.");
    }
}
