package oopsConcepts.inheritance.multi;

public class SimpleCalculator {
    void addition(int a, int b){
        System.out.println("Sum is: " + (a+b));
    }
}
class AdvancedCalculator extends SimpleCalculator {
    void subtraction(int a, int b){
        System.out.println("Difference is: " + (a-b));
    }
}
class SuperAdvancedCalculator extends AdvancedCalculator{
    void multiplication(int a, int b){
        System.out.println("Product is: " + (a*b));
    }
    float division(float a, float b){
        return a/b;
    }

    public static void main(String[] args) {
        SimpleCalculator c1 = new SimpleCalculator();
        c1.addition(1,2);
        AdvancedCalculator c2 = new AdvancedCalculator();
        c2.addition(4,5);
        c2.subtraction(10,20);
        SuperAdvancedCalculator c3 = new SuperAdvancedCalculator();
        c3.addition(2,3);
        c3.subtraction(20,30);
        c3.multiplication(4,5);
        System.out.println(c3.division(2.3f, 3.5f));
    }
}
