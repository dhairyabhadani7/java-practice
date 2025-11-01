package JavaPractice;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileExample {
    public static void main(String[] args) {
        
        try (FileReader reader=new FileReader("output.txt")) {
            int character;
            while((character=reader.read())!=-1){
                System.out.print((char)character);
            }
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
