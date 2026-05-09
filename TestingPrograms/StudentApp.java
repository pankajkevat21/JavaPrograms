package  TestingPrograms;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
// Backend class (Data storage)
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Main class (Frontend + Logic)
public class StudentApp {
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Management");
        frame.setSize(400, 400);
        frame.setLayout(null);

        JLabel l1 = new JLabel("ID:");
        l1.setBounds(50, 50, 100, 30);
        frame.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 50, 150, 30);
        frame.add(t1);

        JLabel l2 = new JLabel("Name:");
        l2.setBounds(50, 100, 100, 30);
        frame.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 100, 150, 30);
        frame.add(t2);

        JButton addBtn = new JButton("Add Student");
        addBtn.setBounds(50, 160, 120, 30);
        frame.add(addBtn);

        JButton showBtn = new JButton("Show Students");
        showBtn.setBounds(200, 160, 140, 30);
        frame.add(showBtn);

        JTextArea area = new JTextArea();
        area.setBounds(50, 220, 300, 100);
        frame.add(area);

        // Add button logic (Backend)
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(t1.getText());
                String name = t2.getText();

                students.add(new Student(id, name));

                t1.setText("");
                t2.setText("");

                JOptionPane.showMessageDialog(frame, "Student Added!");
            }
        });

        // Show button logic (Backend)
        showBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setText("");

                for (Student s : students) {
                    area.append("ID: " + s.id + ", Name: " + s.name + "\n");
                }
            }
        });

        frame.setVisible(true);
    }
}