import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class checkLogin {
    static boolean checkLogin(String username, String password) {
        if(Objects.equals(username, IDPASS.ID_1.username)){
            return Objects.equals(password, IDPASS.ID_1.password);
        } else if (Objects.equals(username, IDPASS.ID_2.username)) {
            return Objects.equals(password, IDPASS.ID_2.password);
        } else if (Objects.equals(username, IDPASS.ID_3.username)) {
            return Objects.equals(password, IDPASS.ID_3.password);
        }else return false;
    }
}
