package JavaPractice;

public class EmployeeManager {
    public void updateSalary(Employee employee, double newSalary) throws InvalidSalaryException {
       if(newSalary<0){
        throw new InvalidSalaryException("Salary cannot be negative: "+employee.getName());
       }
       employee.setSalary(newSalary);
       System.out.println("The updated salary for: "+ employee.getName() +":"+ newSalary);
    }
}
