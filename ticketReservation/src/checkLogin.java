import java.util.Objects;

public class checkLogin {
    static boolean checkLogin(String username, String password) {
        IDPASS idpass = new IDPASS();
        idpass.add("a", "1");
        idpass.add("b", "2");
        idpass.add("c", "3");
        boolean loginStatus = false;
        for(int i = 0; i < idpass.passwordArr.size(); i++){
            if (Objects.equals(username, idpass.usernameArr.get(i)) && Objects.equals(password, idpass.passwordArr.get(i))) {
                loginStatus = true;
                break;
            }
        }
        return loginStatus;
    }
}
