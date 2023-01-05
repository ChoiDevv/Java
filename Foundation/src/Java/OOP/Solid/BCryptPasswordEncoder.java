package Java.OOP.Solid;

public class BCryptPasswordEncoder implements PasswordEncode, PasswordCheck {
    @Override
    public StringBuilder passwordEncode(String password) {
        StringBuilder sb = new StringBuilder();

        return sb.append("{BCrypt}" + password);
    }

    @Override
    public boolean match(String password, StringBuilder encodedPassword) {
        boolean response;
        StringBuilder sb = new StringBuilder();
        StringBuilder encodingPassword = sb.append("{BCrypt}" + password);

        if (encodingPassword == encodedPassword) {
            response = true;
        } else {
            response = false;
        }

        return response;
    }
}
