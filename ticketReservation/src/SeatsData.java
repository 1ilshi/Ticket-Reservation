import java.util.Scanner;
public interface SeatsData {
    Scanner keyboard = new Scanner(System.in);
    void getType();
    void getAmount();
    String chosenType();
    int chosenTypePrice();
    int totalPrice();

}
