package fileHandlingInJava;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File obj = new File("./resources/EPCET/Java.txt");
        if (obj.delete()){
            System.out.println("Text File deleted: " + obj.getName());
        }
        else {
            System.out.println("Failed to delete the file.");
        }
    }

}
