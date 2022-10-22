package fileHandlingInJava;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        File obj = new File("./resources/EPCET");
        if (obj.mkdir()){
            System.out.println("Folder Created " + obj.getName());
        }
        else {
            System.out.println("Folder Exists");
        }
    }
}
