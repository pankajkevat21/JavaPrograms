package File_Handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {

        try {

            File obj = new File("C:\\Users\\panka\\Desktop\\filewithjava.txt");

            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getAbsolutePath());
            } else {
                System.out.println("File already exists");
            }

        } catch (IOException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}