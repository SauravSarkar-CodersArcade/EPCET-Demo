package StringBufferAndBuilder;

public class StringBuilderExample {
    public void stringAppend(){
        StringBuilder sbf = new StringBuilder("EPCET");
        System.out.println("Old String : " + sbf); // EPCET
        sbf.append(" College");
        System.out.println("New String: " + sbf); // EPCET College
    }
    public void stringInsert(){
        StringBuilder sbf = new StringBuilder("JA");  // AV (1) JAVA
        System.out.println("Before Inserting: " + sbf); // JA
        sbf.insert(1, "AV");
        System.out.println("After Inserting: " + sbf); // JAVA
    }
    public void stringReverse(){
        StringBuilder sbf = new StringBuilder("TECPE");
        System.out.println("Before Reversing: " + sbf); //TECPE
        sbf.reverse();
        System.out.println("After Reversing: " + sbf);//EPCET
    }
    public static void main(String[] args) {
        StringBuilderExample builderExample = new StringBuilderExample();
        builderExample.stringAppend();
        builderExample.stringInsert();
        builderExample.stringReverse();
    }
}
