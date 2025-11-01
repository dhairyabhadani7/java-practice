package JavaPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyExample {
    public static void main(String[] args) {
        String sourceFile="buffered_output.txt";
        String destinationFile="copied_output.txt";

        try(
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));

        ) {
            String line;

            while((line=reader.readLine())!=null){
                writer.write(line);
                writer.newLine();
            }
             System.out.println("File copied successfully from " + sourceFile + " → " + destinationFile);
   
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
