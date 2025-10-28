package JavaPractice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        //Created a Integer and Employee TreeMap
        Map<Integer, Employee> employeeTree = new TreeMap<>();
        
        //Adding employees details
        employeeTree.put(101, new Employee(101, "Dhairya", 70000));
        employeeTree.put(104, new Employee(104, "Kuchi", 300000));
        employeeTree.put(102, new Employee(102, "Prabal", 75000));
        employeeTree.put(103, new Employee(103, "Abhishek", 800000));

        // Display employee details(in sorted order)

        for(Map.Entry<Integer,Employee> entry : employeeTree.entrySet()){
            System.out.println("Key: "+entry.getKey());
            entry.getValue().displayEmployeeDetails();
        }

        // First and Last Key
       System.out.println("First Key: "+((TreeMap<Integer,Employee>) employeeTree).firstKey());
       System.out.println("Last Key: "+((TreeMap<Integer,Employee>) employeeTree).lastKey());
       System.out.println("-----------------------------------------");
         
       //Remove one employee
       employeeTree.remove(103);

       //Updated TreeMap
       for(Employee emp: employeeTree.values()){
         emp.displayEmployeeDetails();
       }
    }
}
