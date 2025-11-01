package JavaPractice;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderExample {
    public static void main(String[] args) {
       String fileName = "buffered_output.txt";
       try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        String line;
        System.out.println("Reading from: "+fileName+" : ");
        while((line= reader.readLine())!=null){
        System.out.println(line);
        }
       } catch (Exception e) {
        
       }
    }
}
