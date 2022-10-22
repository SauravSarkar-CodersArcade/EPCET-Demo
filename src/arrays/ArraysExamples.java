package arrays;

public class ArraysExamples {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        String[] names = {"EPCET", "CSE", "ECE", "2022"};
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length-1]);
        System.out.println(names[3].charAt(names.length-1));
        System.out.println(args[0]);
        System.out.println(args[1]);
        for (int num : numbers){
            System.out.print(num + " ");
        }
    }
}
