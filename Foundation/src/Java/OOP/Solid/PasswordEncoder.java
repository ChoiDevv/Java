package Java.OOP.Solid;

public class PasswordEncoder {

    public StringBuilder passwordEncode(String password) {
        StringBuilder sb = new StringBuilder();

        return sb.append("{encode}" + password);
    }
}
