package Java_GUi;
import javax.swing.*;

public class JavaPasswordField {
    public static void main(String[] args) {
        JFrame frame = MyFrame.getFrame();
        JPasswordField pw = new JPasswordField("user Name");
        pw.setBounds(150,100,100,30);
        frame.add(pw);
    }
}
