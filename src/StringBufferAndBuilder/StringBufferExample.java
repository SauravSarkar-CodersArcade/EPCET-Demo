package StringBufferAndBuilder;

public class StringBufferExample {
    public void stringAppend(){
        StringBuffer sbf = new StringBuffer("EPCET");
        System.out.println("Old String : " + sbf); // EPCET
        sbf.append(" College");
        System.out.println("New String: " + sbf); // EPCET College
    }
    public void stringInsert(){
        StringBuffer sbf = new StringBuffer("JA");  // AV (1) JAVA
        System.out.println("Before Inserting: " + sbf); // JA
        sbf.insert(1, "AV");
        System.out.println("After Inserting: " + sbf); // JAVA
     }
     public void stringReverse(){
         StringBuffer sbf = new StringBuffer("TECPE");
         System.out.println("Before Reversing: " + sbf); //TECPE
         sbf.reverse();
         System.out.println("After Reversing: " + sbf);//EPCET
     }
    public static void main(String[] args) {
        StringBufferExample bufferExample = new StringBufferExample();
        bufferExample.stringAppend();
        bufferExample.stringInsert();
        bufferExample.stringReverse();
    }
}
