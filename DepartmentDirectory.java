package JavaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentDirectory {
    public static void main(String[] args) {
        

    // Created HashMap of Departmentname as key and List of employees as value

    Map<String, List<Employee>> company = new HashMap<>();
    // Dev Team
    List<Employee> devTeam=new ArrayList<>();
    devTeam.add(new Employee(101,"Dhairya",75000));
    devTeam.add(new Employee(102,"Prabal",70000));
    // HR Team
    List<Employee> hrTeam = new ArrayList<>();
    hrTeam.add(new Employee(103, "Abhishek", 89000));
    // Finance Team
    List<Employee> financeTeam = new ArrayList<>();
    financeTeam.add(new Employee(104, "Kuchi", 190000));

    //Add List to map
    company.put("Development", devTeam);
    company.put("HR", hrTeam);
    company.put("Finance", financeTeam);

    //Displaying all departments and employees
     System.out.println("--- Company Department Directory ---");
    for(Map.Entry<String, List<Employee>> entry: company.entrySet()){
        System.out.println("Department: "+entry.getKey());
        for(Employee emp: entry.getValue()){
            emp.displayEmployeeDetails();
        }
    }
     
     
     //Add a new employee to the existing department
     company.get("HR").add(new Employee(105, "Riya", 95000));
     

    // Remove an employee from finance department
    company.get("Finance").remove(0);

    //Display updated data 
     System.out.println("--- Updated Company Department Directory ---");
    for(Map.Entry<String, List<Employee>> entry: company.entrySet()){
        System.out.println("Department: "+entry.getKey());
        System.out.println("----------------------------");
        for(Employee emp: entry.getValue()){
            emp.displayEmployeeDetails();
        }
    }
     // Check if a department exists
        if (company.containsKey("Development")) {
            System.out.println("\nDevelopment department exists!");
        }

        // Print total number of departments
        System.out.println("\nTotal Departments: " + company.size());

    }
}
