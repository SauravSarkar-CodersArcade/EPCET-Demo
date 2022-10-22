package Association.Aggregation;

public class Employee {
    String name;
    String emailId;
    int salary;
    Address address;
    public Employee(String name, String emailId, int salary, Address address){
        this.name = name;
        this.emailId = emailId;
        this.salary = salary;
        this.address = address;
    }
    void employeeInfo(){
        System.out.println("Employee Information: ");
        System.out.println("Name: " + this.name);
        System.out.println("Email Id: " + this.emailId);
        System.out.println("Salary: " + this.salary);
        System.out.println("City: " + this.address.city);
        System.out.println("State: " + this.address.state);
        System.out.println("Country: " + this.address.country);
        System.out.println();
    }
}
class EmployeeInfo{
    public static void main(String[] args) {
        Address address1 = new Address("Bangalore", "Karnataka", "India");
        Address address2 = new Address("Pune", "Maharashtra", "India");
        Employee e1 = new Employee("Sanjay", "sanjay007@gmail.com", 30000, address1);
        Employee e2 = new Employee("Gayatri", "gayu007@gmail.com", 35000, address2);
        e1.employeeInfo();
        e2.employeeInfo();

    }
}
