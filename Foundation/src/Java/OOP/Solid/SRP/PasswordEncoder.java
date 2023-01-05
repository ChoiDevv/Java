package Java.OOP.Solid.SRP;

public class PasswordEncoder {

    public static StringBuilder passwordEncode(String password) {
        StringBuilder sb = new StringBuilder();

        return sb.append("{encode}" + password);
    }
}
