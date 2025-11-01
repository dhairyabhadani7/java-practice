package JavaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Department{
    private String name;
    private List<Employee> employees;

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }
    public String getName() {
        return name;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
   

    
}

public class FlatMapExample {
    public static void main(String[] args) {
        // Creating Employees
        Employee e1 = new Employee(101, "Dhairya", 90000, "IT");
        Employee e2 = new Employee(102, "Abhishek", 85000, "IT");
        Employee e3 = new Employee(103, "Riya", 60000, "HR");
        Employee e4 = new Employee(104, "Prabal", 75000, "Finance");
        Employee e5 = new Employee(105, "Kuchi", 80000, "Finance");

        Department itDept=new Department("IT", Arrays.asList(e1,e2));
        Department hrDept=new Department("HR", Arrays.asList(e3));
        Department financeDept=new Department("Finance", Arrays.asList(e4,e5));

        List<Department> departments=Arrays.asList(itDept,hrDept,financeDept);

        //  Using flatMap() to flatten all employees into one list
        List<String> allEmployeeNames=departments.stream().
                    flatMap(dept->dept.getEmployees().stream()).
                    map(Employee::getName).collect(Collectors.toList());
        System.out.println("All Employees: " + allEmployeeNames);            

    }
}
