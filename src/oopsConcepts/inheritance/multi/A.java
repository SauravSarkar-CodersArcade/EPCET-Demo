package oopsConcepts.inheritance.multi;

public class A {
    void methodA(){
        System.out.println("Method of class A");
    }
}
class B extends A{
    void methodB(){
        System.out.println("Method of CLass B");
    }
}
class C extends B{
    void methodC(){
        System.out.println("Method of Class C");
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println("------------------------------------");
        a.methodA();
        System.out.println("------------------------------------");
        B b = new B();
        b.methodA();
        b.methodB();
        System.out.println("------------------------------------");
        C c = new C();
        c.methodA();
        c.methodB();
        c.methodC();
        System.out.println("------------------------------------");
    }
}
