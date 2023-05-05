import java.util.ArrayList;

public class IDPASS {
    ArrayList<String> usernameArr = new ArrayList<>();
    ArrayList<String> passwordArr = new ArrayList<>();

    void addID(String username, String password){
        usernameArr.add(username);
        passwordArr.add(password);
    }
}
