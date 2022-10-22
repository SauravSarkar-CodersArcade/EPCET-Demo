package oopsConcepts.abstraction;

public interface Animal {
    void name();
    void colour();
}
class Lion implements Animal{
    public void name() {
        System.out.println("Name: Lion");
    }
    public void colour() {
        System.out.println("Colour: Brownish Yellow");
    }
}
class Panda implements Animal{
    public void name() {
        System.out.println("Name: Panda");
    }
    public void colour() {
        System.out.println("Colour: Black & White");
    }
}
class InterfaceTest{
    public static void main(String[] args) {
        Lion l = new Lion();
        l.name();
        l.colour();
        Panda p = new Panda();
        p.name();
        p.colour();
    }
}
