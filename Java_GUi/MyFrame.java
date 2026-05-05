package Java_GUi;

import javax.swing.*;

public class MyFrame {

    private static JFrame frame;   // static (global access)

    // private constructor (object create nahi kar paoge bahar se)
    private MyFrame() {}

    public static JFrame getFrame() {
        if (frame == null) {
            frame = new JFrame("Reusable Frame");
            frame.setSize(400, 400);
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
        return frame;
    }
}