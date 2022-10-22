package finalKeywordInJava;

public class FinalVariable {
    final int parameter = 100;
    final int value; // final variables are initialized inside the constructor
    static final int number;
    static {
        System.out.println("Hello");
    }
    {
        System.out.println("EPCET");
    }
    static {
        number = 90;
    }
    FinalVariable(){
        value = 10;
        System.out.println("The value is: " + value);
    }
//    void change(){
//        parameter = 200; Cannot change the value of final variable
//    }
public static void main(String[] args) {
    new FinalVariable();
    System.out.println(number);
}
static {
    System.out.println("Hi");
}
}

