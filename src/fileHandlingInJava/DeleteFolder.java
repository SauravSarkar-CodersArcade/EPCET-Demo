package fileHandlingInJava;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File obj = new File("./resources/EPCET");
        if (obj.delete()){
            System.out.println("Deleted Folder " + obj.getName());
        }
        else {
            System.out.println("Failed to delete");
        }
    }
}
