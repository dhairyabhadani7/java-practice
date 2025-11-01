package JavaPractice;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {
    public static void main(String[] args) {
        
        try (
            FileWriter writer = new FileWriter("output.txt",true);
        ) {
            writer.write("\nI am learning how to append.");
            writer.write("\nthe existing file data will not be overwritten.");
            System.out.println("Successfully appended.");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
