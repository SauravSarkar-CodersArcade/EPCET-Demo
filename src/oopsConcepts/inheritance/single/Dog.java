package oopsConcepts.inheritance.single;

public class Dog { // Parent or Base Class Super Class
    public void eat(){
        System.out.println("Eating");
    }
    public void run(){
        System.out.println("Running");
    }
}
class GoldenRetriever extends Dog{ // Child or SubClass
    public static void main(String[] args) {
        GoldenRetriever g1 = new GoldenRetriever();
        g1.eat();
        g1.run();
    }
}
