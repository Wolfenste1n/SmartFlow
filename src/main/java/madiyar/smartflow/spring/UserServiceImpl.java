package madiyar.smartflow.spring;

public class UserServiceImpl implements UserService {
    private String userFullName;



    @Override
    public void registerUser(User user) {

    }

    @Override
    public String getUserFullName() {
        return userFullName;
    }

    @Override
    public boolean authenticateUser(String username, String password) {
        return false;
    }
}
