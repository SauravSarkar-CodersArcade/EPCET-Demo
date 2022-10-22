package oopsConcepts.basicOOPs;
// this refers to the current class instance variable/object
public class Students {
    // Attributes : name, email, rollNo : 8822185799 Saurav Sarkar
    static {
        System.out.println("Welcome");
    }
    String name;
    String email;
    int rollNo;
    static String college = "EPCET";
    public Students(String name, String email, int rollNo){
        this.name = name;
        this.email = email;
        this.rollNo = rollNo;
    }
    public void studentDetails(){
        System.out.println("The student details are: ");
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Roll Number: " + this.rollNo);
        System.out.println("College: " + college);
        System.out.println();
    }
}
class StudentInfo{
    public static void main(String[] args) {
        Students s1 = new Students("Gautam", "gautam123@gmail.com", 100);
        Students s2 = new Students("Sanjay", "sanjay007@gmail.com", 101);
        s1.studentDetails();
        s2.studentDetails();
    }
}
