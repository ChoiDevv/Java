package Java.OOP.Solid.SRP;

public class UserRequest {

    private final String userId;
    private final String password;

    public UserRequest(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }
}
