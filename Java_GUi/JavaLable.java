package Java_GUi;
import  javax.swing.*;
public class JavaLable {
    public static void main(String[] args) {
        JFrame frame =  MyFrame.getFrame();
        JLabel lb1 = new JLabel("click me");
        lb1.setBounds(120,100,100,30);
        frame.add(lb1);
    }
}
