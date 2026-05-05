package Java_GUi;
import  javax.swing.*;
import java.beans.JavaBean;

public class JavaButton  {
    public static void main(String[] args) {

        JFrame frame = MyFrame.getFrame();
        JButton b1 = new JButton("Click Me");
        b1.setBounds(120, 110, 120, 40);

        frame.add(b1);
    }
}
