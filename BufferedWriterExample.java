package JavaPractice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String fileName = "buffered_output.txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write("Hello, this is Dhairya using BufferedWriter!");
            writer.newLine(); // adds a newline
            writer.write("This method is fast for large files.");
            writer.newLine();
            writer.write("Learning Java step-by-step 🚀");
            System.out.println("Data written successfully to " + fileName);
        } 
        catch (IOException e) {
           e.printStackTrace();
        }
    }
}
