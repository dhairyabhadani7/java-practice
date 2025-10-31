package JavaPractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class StreamAPIExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Dhairya", 100000, "IT"));
        employees.add(new Employee(102, "Prabal", 90000, "Finance"));
        employees.add(new Employee(103, "Kuchi", 70000, "Finance"));
        employees.add(new Employee(104, "Reddy", 120000, "HR"));
        employees.add(new Employee(105, "Riya", 40000, "HR"));
        employees.add(new Employee(106, "Abhishek", 80000, "IT"));

        // Exercise 1 — Filter + Map + Collect
        // Print a list of employee names who work in IT department and earn more than ₹60,000, sorted by name.
        // Hint: 
        // Use  .filter(), .map(), .sorted(), and .collect(Collectors.toList()).
        
        List<String> employee= employees.stream().
        filter(emp->emp.getSalary()>60000).
        filter(emp->emp.getDepartment().equals("IT")).
        map(Employee::getName).
        sorted().
        collect(Collectors.toList());
        System.out.println("Employees that work in IT having salary more than 60000 are: "+employee);

        // Exercise 2 — forEach
        // Print all Finance department employees with their name and salary, using .forEach().
        // Hint:
        // Use .filter(emp -> emp.getDepartment().equals("Finance"))
        // then print inside forEach.

        employees.stream().
        filter(emp->emp.getDepartment().equals("Finance")).
        forEach(emp -> System.out.println(emp.getName() + " earns " +emp.getSalary()));

        // Exercise 3 — reduce()
        // Find the total salary paid to all employees.
        // Hint:
        // Use .map(Employee::getSalary).reduce(0.0, Double::sum);

        double totalSalary=employees.stream().map(Employee::getSalary).reduce(0.0,Double::sum);
        System.out.println(totalSalary);

        //Exercise 3 – Using map() and collect()
        // Get a list of all employee names in uppercase and print it.

        List<String> upperNames = employees.stream().map(emp -> emp.getName().toUpperCase()).collect(Collectors.toList());
        System.out.println(upperNames);

        //Find the Lowest-Paid Employee Using reduce()
        
        Employee lowestPaid=employees.stream().
        reduce((emp1 , emp2)->emp1.getSalary() < emp2.getSalary() ? emp1 : emp2).
        orElse(null);

         if (lowestPaid != null) {
         System.out.println("Lowest Paid Employee:");
         lowestPaid.displayEmployeeDetails();
          
         // Count of employees in IT department
         long count=employees.stream().filter(emp-> emp.getDepartment().equals("IT")).count();
         System.out.println(count);

         // All employees above 30K?
         Boolean isAll30K= employees.stream().allMatch(emp-> emp.getSalary()>30000);
         System.out.println(isAll30K);

         // Any HR?
         Boolean isAnyHR=employees.stream().anyMatch(emp->emp.getDepartment().equals("HR"));

         System.out.println(isAnyHR);

         //None Match

         Boolean noneMatch=employees.stream().noneMatch(emp->emp.getDepartment().equals("Sales"));
         System.out.println(noneMatch);
         
         //First IT employee
         Employee first=employees.stream().filter(emp->emp.getDepartment().equals("IT")).findFirst().orElse(null);

         if(first!=null){
           first.displayEmployeeDetails();
         }
         
         //AnyFinance employee
         Employee anyFinanceEmployee=employees.stream().filter(emp->emp.getDepartment().equals("Finance")).findAny().orElse(null);
         if(anyFinanceEmployee!=null){
            anyFinanceEmployee.displayEmployeeDetails();
         }

        Map<String, List<String>> departmentWiseEmployees=employees.stream().
                                                          filter(emp->emp.getSalary()>70000).
                                                          collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName, Collectors.toList())));
            
       System.out.println("--- Employees earning > 70,000 grouped by Department ---");
        departmentWiseEmployees.forEach((dept, names) -> System.out.println(dept + " : " + names));


    }
}
}
