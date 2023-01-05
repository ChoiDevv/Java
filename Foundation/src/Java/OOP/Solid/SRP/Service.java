package Java.OOP.Solid.SRP;

public class Service {

    public static void addUser(UserRequest request) {
        StringBuilder sb = new StringBuilder();

        /*
        * StringBuilder encodedPassword = sb.append("{Encode}" + request.getPassword());
        * */
        StringBuilder encodedPassword = PasswordEncoder.passwordEncode(request.getPassword());
        User user = new User(request.getUserId(), encodedPassword);

        // 세이브하는 DAO의 역할은 생략.
    }
}
