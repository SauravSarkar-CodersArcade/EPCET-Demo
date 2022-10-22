package constructor;

public class ConstructorExample {
    int x;
    int y;
    public ConstructorExample(){
       x = 10;
       y = 20;
    }
    public ConstructorExample(int a, int b){
        x = a;
        y = b;
    }
    public ConstructorExample(double a, double b){
        x = (int) a;
        y = (int) b;
    }
}
// TSA Cuboid ?
class Constructor{
    public static void main(String[] args) {
        // ClassName obj = new ClassName();
        ConstructorExample obj1 = new ConstructorExample();
        ConstructorExample obj2 = new ConstructorExample(1,2);
        ConstructorExample obj3 = new ConstructorExample(1.2, 3.4);
        System.out.println(obj1.x + " " + obj1.y);
        System.out.println(obj2.x + " " + obj2.y);
        System.out.println(obj3.x + " " + obj3.y);
    }
}
