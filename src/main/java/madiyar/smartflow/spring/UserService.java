package madiyar.smartflow.spring;

public interface UserService {
    void registerUser(User user);
    String getUserFullName();
    boolean authenticateUser(String username, String password);
}
