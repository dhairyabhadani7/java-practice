package JavaPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.smartcardio.CommandAPDU;

public class EmployeeAnalytics {
    public static void main(String[] args) {
         List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Dhairya", 100000, "IT"));
        employees.add(new Employee(102, "Prabal", 90000, "Finance"));
        employees.add(new Employee(103, "Kuchi", 70000, "Finance"));
        employees.add(new Employee(104, "Reddy", 120000, "HR"));
        employees.add(new Employee(105, "Riya", 40000, "HR"));
        employees.add(new Employee(106, "Abhishek", 80000, "IT"));

        //group employee by department
        Map<String, List<Employee>> groupDept=employees.stream().
        collect(Collectors.groupingBy(Employee::getDepartment));

        groupDept.forEach((dept,emp)->{
            System.out.println("Department: "+dept);
            System.out.println("-------------------------");
            emp.forEach(e->System.out.println(e.getName()+" : "+e.getSalary()));
            System.out.println("-------------------------");
    });
        // count of employee per department
        Map<String, Long> employeeCount=employees.stream().
        collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println("\nEmployee count per department:");
        employeeCount.forEach((dept, count)->{
            System.out.println(dept+" : "+ count);
        } );
       
        // Average salary per department

        Map<String, Double> averageSalary = employees.stream().
        collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
          
        System.out.println("\nAverage salary per department:");
        averageSalary.forEach((dept,avg)->{
            System.out.println(dept+" : "+avg);
        });
        
        //Highest paid employee in each department
        Map<String, Optional<Employee>> highestPaid=employees.stream().
        collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        
        System.out.println("\nHighest paid employee per department:");
        highestPaid.forEach((dept,emp)->{
            System.out.println(dept+ " -> "+emp.get().getName()+"("+emp.get().getSalary()+")");
        });
          //Lowest paid employee in each department

        Map<String, Optional<Employee>> lowestPaid = employees.stream().
        collect(Collectors.groupingBy(Employee::getDepartment,Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));
        
         System.out.println("\nLowest paid employee per department:");
        lowestPaid.forEach((dept,emp)->{
            System.out.println(dept+ " -> "+emp.get().getName()+"("+emp.get().getSalary()+")");
        });

    }
}
