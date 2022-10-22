package ThreadsInJava;

public class MultiThreadDemo {
    public static void main(String[] args) {
        MultiThread t1 = new MultiThread();
        MultiThread t2 = new MultiThread();
        MultiThread t3 = new MultiThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
