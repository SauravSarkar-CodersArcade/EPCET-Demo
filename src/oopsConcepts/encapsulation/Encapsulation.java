package oopsConcepts.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Sanjay");
        s1.setRollNo(100);
        s1.setAge(21);
        System.out.println("Student details: ");
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll Number: " + s1.getRollNo());
        System.out.println("Age: " + s1.getAge());
    }
}
