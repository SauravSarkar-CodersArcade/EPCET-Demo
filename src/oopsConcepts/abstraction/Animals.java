package oopsConcepts.abstraction;

abstract class Animals {
    abstract void sound(); // Abstract Method
    public void walk(){ // Concrete or Normal Method
        System.out.println("I am walking");
    }
}
class Tiger extends Animals{
    void sound() {
        System.out.println("I am a tiger. I sound very loud");
    }
}
class Turtle extends Animals{
    void sound() {
        System.out.println("I am a turtle. I sound less");
    }
}
class Demo {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.sound();
        t1.walk();
        Turtle tu1 = new Turtle();
        tu1.sound();
        tu1.walk();
    }
}
