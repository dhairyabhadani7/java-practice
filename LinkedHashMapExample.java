package JavaPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
         // Create LinkedHashMap to store employee ID and Employee object
        Map<Integer, Employee> employeeMap = new LinkedHashMap<>();
        
        //Add employees (in insertion order)
        employeeMap.put(101, new Employee(101, "Dhairya", 70000));
        employeeMap.put(102, new Employee(102, "Prabal", 75000));
        employeeMap.put(103, new Employee(103, "Abhishek", 80000));
        employeeMap.put(104, new Employee(104, "Kuchi", 300000));

        //Display employee details (in insertion order)

        for(Map.Entry<Integer,Employee> entry: employeeMap.entrySet()){
            System.out.println("Key: "+ entry.getKey());
            entry.getValue().displayEmployeeDetails();
        }

        //Accessing a specific employee
         System.out.println("\nAccessing Employee with ID 102:");
         employeeMap.get(102).displayEmployeeDetails();

         //Remove employee
         employeeMap.remove(103);

         //Display updated map
         System.out.println("Updated Map: ");
         for(Map.Entry<Integer,Employee> entry: employeeMap.entrySet()){
            System.out.println("Key: "+ entry.getKey());
            entry.getValue().displayEmployeeDetails();
        }

    }
}
