package JavaPractice;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {
    public static void main(String[] args) {

        try ( FileWriter writer = new FileWriter("output.txt");) {
            writer.write("Hello, this is a test file.\n");
            writer.write("Learning FileWriter in Java!");
            System.out.println("Successfully written to the file.");
        } catch (IOException e) {
          System.out.println("An exception occurred.");
          e.printStackTrace();
        }
    }
}
