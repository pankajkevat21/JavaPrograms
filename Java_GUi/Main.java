package Java_GUi;
import  javax.swing.*;
public class Main {
public static void main(String[] args) {
    JFrame frame = new JFrame("Main Frame");
    frame.setSize(400,400);
    frame.setLayout(null);
    String columns[] = {"ID","Name","Salary"};
    String data[][] = {{"101","Pankaj","50700"},
            {"102","Aman","69000"},
            {"102","Aman","69000"},
            {"102","Aman","69000"},
            {"102","Aman","69000"},
            {"102","Aman","69000"},
            {"103","Rohit","70700"}};

    JTable jt1 = new JTable(data,columns);
    jt1.setBounds(20,30,300,200);
    frame.add(jt1);
    frame.setVisible(true);
}
}
