package StringBufferAndBuilder;

public class BufferBuilderEfficiency {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("EPCET");
        for (int i=1; i<100000; i++){
            sbf.append(" College");
        }
        System.out.println("Time taken by SBF : " + (System.currentTimeMillis()-startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder("EPCET");
        for (int i=1; i<100000; i++){
            sbl.append(" College");
        }
        System.out.println("Time taken by SBL : " + (System.currentTimeMillis()-startTime) + "ms");
    }
}
