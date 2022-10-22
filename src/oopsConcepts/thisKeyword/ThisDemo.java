package oopsConcepts.thisKeyword;

public class ThisDemo {
    int i;
    void change(int i){
        this.i = i;
    }
    void display(){
        System.out.println("The value of i is : " + i);
    }
}
class Test{
    public static void main(String[] args) {
        ThisDemo t1 = new ThisDemo();
        ThisDemo t2 = new ThisDemo();
        t2.change(20);
        t2.display();
        t1.change(10);
        t1.display();
    }
}
