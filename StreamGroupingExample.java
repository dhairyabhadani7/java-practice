package JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Dhairya", 100000, "IT"));
        employees.add(new Employee(102, "Prabal", 90000, "Finance"));
        employees.add(new Employee(103, "Kuchi", 70000, "Finance"));
        employees.add(new Employee(104, "Reddy", 120000, "HR"));
        employees.add(new Employee(105, "Riya", 40000, "HR"));
        employees.add(new Employee(106, "Abhishek", 80000, "IT"));

        Map<String,List<Employee>> deptGroup=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        deptGroup.forEach((dept,empList)->{
        System.out.println("\nDepartment: " + dept);
        empList.forEach(e->System.out.println(e.getName() + " - " + e.getSalary()));});

        Map<String, List<Employee>> groupByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(" Employees grouped by department:");
        System.out.println(groupByDept);
        Map<String, Long> countByDept = employees.stream().collect(Collectors.groupingBy((Employee::getDepartment),Collectors.counting()));

        System.out.println(" Number of employees in each department:");
        System.out.println(countByDept);
        Map<String, Double> avgSalaryByDept = employees.stream().collect(Collectors.groupingBy((Employee::getDepartment),Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(" Average salary in each department:");
        System.out.println(avgSalaryByDept);
    }
       
    }

