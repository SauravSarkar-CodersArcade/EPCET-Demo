package fileHandlingInJava;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File obj = new File("./resources/EPCET/Java.txt");
        try {
            if (obj.createNewFile()) {
                System.out.println("Created File: " + obj.getName());
            } else {
                System.out.println("File Already exists");
            }
        }catch (IOException e){
            System.out.println("Something Unexpected Happened");
        }
    }
}
