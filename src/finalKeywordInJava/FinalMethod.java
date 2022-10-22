package finalKeywordInJava;

public class FinalMethod {
    final void data(){
        System.out.println("College Name: EPCET");
    }
}
class College extends FinalMethod{
    // Can't override a final method
//    void data(){
//        System.out.println("College Name: EWIT");
//    }
}
