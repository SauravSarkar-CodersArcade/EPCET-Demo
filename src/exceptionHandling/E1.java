package exceptionHandling;

public class E1 {
    public static void main(String[] args) {
        int i, j, k=0;
        try {
            i = 10;
            j = 2;
            k = i / j;
            int[] numbers = {1,2,3,4,5};
            System.out.println(numbers[10]);
        }

        catch (ArithmeticException e){
            System.out.println(e);
            //System.out.println("Division by zero is invalid");
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index not valid");
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("I am the boss...!!! I will get executed no matter what...!!!");
            System.out.println("Done to release resources");
        }
        System.out.println(k);
    }
}
