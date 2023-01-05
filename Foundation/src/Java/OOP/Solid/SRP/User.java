package Java.OOP.Solid.SRP;

public class User {

    private String userId;
    private StringBuilder password;

    public User(String userId, StringBuilder password) {
        this.userId = userId;
        this.password = password;
    }

    public User() {

    }

    public String getUserId() {
        return userId;
    }

    public StringBuilder getPassword() {
        return password;
    }
}
