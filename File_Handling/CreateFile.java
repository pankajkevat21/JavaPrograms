package File_Handling;
import java.io.File;
import  java.io.IOException;
public class CreateFile {
    public static void main(String[] args) {
        try{
            File obj = new File("first.txt");
            if(obj.createNewFile()){
                System.out.println("file created");
            }
            else
                System.out.println("file already exist");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
