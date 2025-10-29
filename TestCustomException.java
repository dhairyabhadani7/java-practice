package JavaPractice;

public class TestCustomException {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Dhairya", 75000);
        EmployeeManager manager = new EmployeeManager();

        try { 
               manager.updateSalary(emp1, 90000);
               manager.updateSalary(emp1, -20000);
              
        } catch (InvalidSalaryException e) {
            System.out.println("Error: "+e.getMessage());
        }
          System.out.println("Program continues normally...");
    }
}
