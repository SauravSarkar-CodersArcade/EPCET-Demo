package finalKeywordInJava;
// Intellisense
public class FinalParameter {
    int square(final int x){
        //x = 10; //can't change final parameter value
        return x*x;
    }
    public static void main(String[] args) {
        System.out.println(new FinalParameter().square(5));
    }
}
