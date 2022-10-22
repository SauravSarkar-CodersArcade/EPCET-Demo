package fileHandlingInJava;
// jar files (Java Archive) excel
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("./resources/EPCET/Java.txt");
        Scanner sc = new Scanner(obj);
        while (sc.hasNextLine()){
            String data = sc.nextLine();
            System.out.println(data);
        }
        sc.close();
    }
}
