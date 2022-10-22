package InnerClasses;

public class Outer {
    private int value = 10;
    class Inner {
        void display(){
            System.out.println("Value is: " + value);
        }
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        // OuterClass.InnerClass inner_object = outer_object.new InnerClass();
        Outer.Inner in = out.new Inner();
        in.display();
    }
}
