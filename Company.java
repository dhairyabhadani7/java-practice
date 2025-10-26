package JavaPractice;

public class Company {
    public static void main(String[] args) {
        Employee e1= new Employee(1, "Dhairya", 75000);
        Employee e2= new Employee(2, "Prabal", 65000);
        Employee e3= new Employee(3, "Abhishek", 75000);
        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        e3.displayEmployeeDetails();
        e1.setSalary(100000);
        System.out.println("After increment:");
        e1.displayEmployeeDetails();
    }
}
