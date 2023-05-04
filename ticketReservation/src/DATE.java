import java.util.Scanner;
public interface DATE {
    Scanner keyboard = new Scanner(System.in);
    void yearInput();
    void monthInput();
    void dateInput();
    String dateText();
}
