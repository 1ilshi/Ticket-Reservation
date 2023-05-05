import java.util.Objects;

class CheckLogin extends IDPASS{
    public void adder(){
        super.addID("a", "1");
        super.addID("b", "2");
        super.addID("c", "3");
    }
    public boolean checklogin(String username, String password) {
        adder();
        boolean loginStatus = false;
        for(int i = 0; i < super.passwordArr.size(); i++){
            if (Objects.equals(username, super.usernameArr.get(i)) && Objects.equals(password, super.passwordArr.get(i))) {
                loginStatus = true;
                break;
            }
        }
        return loginStatus;
    }
}
