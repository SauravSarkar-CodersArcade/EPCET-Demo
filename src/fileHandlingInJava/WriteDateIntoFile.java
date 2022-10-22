package fileHandlingInJava;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDateIntoFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("./resources/EPCET/Training.txt", true);
        writer.append("\n Good Afternoon Everyone...!!!");
        writer.close();
        System.out.println("Successfully wrote to the file");
    }
}
