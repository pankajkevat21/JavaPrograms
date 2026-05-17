package Java_GUi;
import javax.swing.*;
public class JavaOptionPan {
    public static void main(String[] args) {
        JFrame frame = MyFrame.getFrame();
        JOptionPane.showMessageDialog(frame,"Welcome");
        JOptionPane.showMessageDialog(frame, "Alert", "Warning", JOptionPane.WARNING_MESSAGE);        String name = JOptionPane.showInputDialog(frame,"Enter your name:");
        System.out.println(name);
    }
}
