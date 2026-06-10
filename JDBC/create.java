package JDBC;
import java.sql.*;

public class create {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/pankajdb";
            String userName = "root";
            String password = "1234";

            Connection con =
                    DriverManager.getConnection(url,userName,password);

            Statement stm = con.createStatement();

            String query1 =
                    "INSERT INTO student VALUES(107,'Pankaj')";

            String query2 =
                    "INSERT INTO student VALUES(107,'Pankaj')";

            stm.executeUpdate(query1);

            String query3 = "DELETE FROM student WHERE id = 107";
            stm.executeUpdate(query3);
            System.out.println("Data inserted");

            System.out.println("Data inserted");
            System.out.println("Data inserted");


            con.close();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}