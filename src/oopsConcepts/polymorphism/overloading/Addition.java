package oopsConcepts.polymorphism.overloading;

public class Addition {
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(float a, float b){
        System.out.println(a+b);
    }
    static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    static void add(double a, double b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        add(1,2);
        add(2.3f, 3.5f);
        add(1,2,3);
        add(2.5, 3.6);
    }

}
