package exceptionHandling;
// throw keyword is used to create user-defined exceptions
public class E2 {
    public static void checkAge(int age){
        if (age < 18){
            throw new RuntimeException("Access Denied - Age is less than 18");
        }
        else {
            System.out.println("Access Granted - You are eligible");
        }
    }
    public static void main(String[] args) {
        checkAge(18);
    }
}
