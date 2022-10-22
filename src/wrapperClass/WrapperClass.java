package wrapperClass;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer integer = 234;
        Double newDouble = 3.56;
        //ArrayList<int> num = new ArrayList<int>(); // invalid
        ArrayList<Integer> num = new ArrayList<Integer>(); // valid
        Character ch = 'A';
        System.out.println(integer.intValue());
        System.out.println(newDouble.doubleValue());
        System.out.println(ch.charValue());
        String newString = integer.toString();  // "234";
        System.out.println(newString.charAt(0)); // 2
        System.out.println(newString.length()); // 3
    }
}
