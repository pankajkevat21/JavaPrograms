package Java_GUi;
import javax.swing.*;
import java.awt.*;
public class JavaMenu {
    JMenuBar mb = new JMenuBar();
    JMenu menu1, submenu;
    JMenuItem i1, i2, i3, i4, i5;
    JavaMenu() {
        menu1 = new JMenu("Menu");
        submenu = new JMenu("Sub Menu");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");
        menu1.add(i1);
        menu1.add(i2);
        submenu.add(i3);
        submenu.add(i4);
        menu1.add(submenu);
        menu1.add(i5);
        mb.add(menu1);
        JFrame frame = new JFrame("Menu Example");
        frame.setJMenuBar(mb);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JavaMenu();
    }
}