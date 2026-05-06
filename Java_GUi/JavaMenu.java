package Java_GUi;
import javax.swing.*;
import java.awt.*;
public class JavaMenu {
    public static void main(String[] args) {
        JMenuBar mb = new JMenuBar();
        JMenu menu , submenu;
        JMenuItem i1, i2, i3, i4, i5;
        menu = new JMenu("Menu");
        submenu = new JMenu("Submenu");
        i1 = new JMenuItem("Item1");
        i2 = new JMenuItem("Item2");
        i3 = new JMenuItem("Item3");
        i4 = new JMenuItem("Item4");
        i5 = new JMenuItem("Item5");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        mb.add(menu);
        JFrame frame = MyFrame.getFrame();
        frame.setJMenuBar(mb);
    }
}

