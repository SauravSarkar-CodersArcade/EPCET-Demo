package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// throws keyword : suppress the exception
public class E3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            String str;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the data: ");
            str = br.readLine();
            System.out.println(str);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            br.close(); // closing the reader to release memory
        }
    }
}
