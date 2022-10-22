package oopsConcepts.inheritance.multiple;
interface Browser1{
    void browser1();
}
interface Browser2{
    void browser2();
}
interface Browser3{
    void browser3();
}
public class Browsers implements Browser1, Browser2, Browser3 {
    public void browser1() {
        System.out.println("Google Chrome");
    }
    public void browser2() {
        System.out.println("Mozilla firefox");
    }
    public void browser3() {
        System.out.println("Brave Browser");
    }
}

class MIExample extends Browsers{
    public static void main(String[] args) {
        MIExample mi = new MIExample();
        mi.browser1();
        mi.browser2();
        mi.browser3();
    }
}
