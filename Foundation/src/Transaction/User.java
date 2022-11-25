package Transaction;

import java.io.IOException;
import java.util.Objects;

public class User {
    private String userId;
    private String password;

    public User() {

    }

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

    public void validate(String userId, String password) {
        UserList userList = new UserList();
        if (!Objects.equals(userId, userList.getUser1()) && !Objects.equals(password, userList.getPassword())) {
            throw new Exception("아이디 또는 비밀번호가 틀렸습니다.");
        }
    }

    public String login(String userId, String password) throws IOException {
        validate(userId, password);
        System.out.println("로그인 되었습니다.");
        return userId;
    }
}
