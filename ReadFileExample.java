package JavaPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileExample {
    public static void main(String[] args) {
        Path path = Paths.get("data.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            System.out.println("File Content: ");
            lines.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
