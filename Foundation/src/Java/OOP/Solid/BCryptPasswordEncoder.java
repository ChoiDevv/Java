package Java.OOP.Solid;

public class BCryptPasswordEncoder implements PasswordEncode {
    @Override
    public StringBuilder passwordEncode(String password) {
        StringBuilder sb = new StringBuilder();

        return sb.append("{BCrypt}" + password);
    }
}
