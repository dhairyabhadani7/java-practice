package JavaPractice;

public class CompanyMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(0, "Dhairya", 75000);
        Manager m1=new Manager(1, "Prabal", 80000, 15000);

        e1.displayEmployeeDetails();
        m1.displayEmployeeDetails();

        System.out.println("Manager total salary: "+ m1.getTotalSalary());
    }
}
