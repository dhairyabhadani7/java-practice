package JavaPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperationsExample {
    public static void main(String[] args) {
        Path path = Paths.get("data.txt");

        try {
            // Check if file exists
            if(Files.exists(path)){
                System.out.println("File exists: " + path.toAbsolutePath());
            }
            else{
                Files.createFile(path);
                System.out.println("File created: " + path.toAbsolutePath());
            }

             // Delete the file
             Files.deleteIfExists(path);
             System.out.println("File deleted successfully");
            
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
