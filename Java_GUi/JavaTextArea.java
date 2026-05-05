package Java_GUi;
import javax.swing.*;
public class JavaTextArea {
    public static void main(String[] args) {
        JFrame frame = MyFrame.getFrame();
        JTextArea pw = new JTextArea("user Name");
        pw.setBounds(150,100,300,100);
        frame.add(pw);
    }
}
