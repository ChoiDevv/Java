package Transaction;

import java.util.Objects;

public class User {
    private final String userId;
    private final String password;

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void validate() {
        UserList userList = new UserList();
        if (!Objects.equals(this.userId, userList.getUser1()) && !Objects.equals(this.password, userList.getPassword())) {
            throw new Exception("User didn't match id or password.");
        }
    }
}
