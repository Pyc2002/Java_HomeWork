// 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.
package Home_Work_2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;



public class Task2 {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("file.txt");
        String text = "TEST ".repeat(100);
        boolean exists = Files.exists(file);
        if (exists == false){
            Files.createFile(file);
        }
        Files.writeString(file, text);
    
    }
    
}
