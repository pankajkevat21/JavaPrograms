package Java_GUi;

import javax.swing.*;

public class JavaTextField {
    public static void main(String[] args) {
        JFrame frame = MyFrame.getFrame();
        JTextField tf = new JTextField("user Name");
        tf.setBounds(150,100,100,30);
        frame.add(tf);
    }
}
