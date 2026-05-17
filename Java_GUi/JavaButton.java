package Java_GUi;
import  javax.swing.*;
import java.beans.JavaBean;

public class JavaButton  {
    public static void main(String[] args) {

        JFrame frame = MyFrame.getFrame();
        JButton b1 = new JButton(new ImageIcon("C:\\Users\\panka\\IdeaProjects\\Pankajapplication\\Screenshot 2026-04-29 200536.png"));
        b1.setBounds(0, 0, 1207, 635);

        frame.add(b1);
    }
}
