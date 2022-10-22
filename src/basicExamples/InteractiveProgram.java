package basicExamples;

import java.util.Scanner;

public class InteractiveProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int tsaCuboid = 2*(l*b+b*h+l*h);
        System.out.println("The TSA is : " + tsaCuboid + " Sq units");
    }
}
