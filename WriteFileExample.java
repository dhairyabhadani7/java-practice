package JavaPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class WriteFileExample {
    public static void main(String[] args) {
        Path path = Paths.get("data.txt");
        String content = "Hello, this is Dhairya learning Java NIO!\n";
        List<String> lines = List.of("Line 1: Stream API", "Line 2: Lambda", "Line 3: File Handling");
        try {
            Files.writeString(path, content, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
            Files.write(path, lines, StandardOpenOption.APPEND);
            
            System.out.println(" Data written successfully to " + path.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
