import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class ShowPicture {
    public void promptPay() {
        var frame = new JFrame();
        var icon = new ImageIcon("promptoay.png");
        var label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public void paotang() {
        var frame = new JFrame();
        var icon = new ImageIcon("paotang.png");
        var label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public void Credir_Debit() {
        var frame = new JFrame();
        var icon = new ImageIcon("credit_debit.png");
        var label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}