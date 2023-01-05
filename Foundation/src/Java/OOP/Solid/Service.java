package Java.OOP.Solid;

public class Service {

    private static PasswordEncode passwordEncoder;

    public static void addUser(UserRequest request) {
        /*
        * StringBuilder sb = new StringBuilder();
        * StringBuilder encodedPassword = sb.append("{Encode}" + request.getPassword());
        * */
        StringBuilder encodedPassword = passwordEncoder.passwordEncode(request.getPassword());
        User user = new User(request.getUserId(), encodedPassword);

        // 세이브하는 DAO의 역할은 생략.
    }
}
