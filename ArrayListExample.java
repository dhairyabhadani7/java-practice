package JavaPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Integers
        List<Integer> numbers = new ArrayList<>();

        //Adding elements to a list
        numbers.add(1);
        numbers.add(34);
        numbers.add(-1);
        numbers.add(54);
 
        // Printing array elements
        System.out.println("ArrayList elements: " + numbers);

        // Fetching the arraylist elements by index
        System.out.println("First element: " + numbers.get(0));

        // Updating the ArrayList elements by index
        numbers.set(2, -23);

        // Printing the ArrayList after updating the element
        System.out.println("After update: " + numbers);

        // Removing the ArrayList element by index
        numbers.remove(2);

        // Printing the ArrayList after deleting the element

        System.out.println("After deletion:  " + numbers);

        // Printing the size of an ArrayList
        System.out.println("Size of ArrayList " + numbers.size());

        // Printing the ArrayList elements individually using for each loop
        for(int i:numbers){
            System.out.println(i);
        }

        // Checking if element is present in ArrayList
        if(numbers.contains(34)){
             System.out.println("34 is present in the list!");
        }
        // Removing all elements from ArrayList
         numbers.clear();
        System.out.println("After clearing: " + numbers);
       
        //Create an ArrayList of Employee
         List<Employee> employees = new ArrayList<>();

        // Add Employee objects
         employees.add(new Employee(1, "Dhairya", 75000));
         employees.add(new Employee(2, "Prabal", 70000));
         employees.add(new Employee(3, "Abhishek", 80000));
         employees.add(new Employee(4, "Kuchi", 175000));
         
        // Display all employees
         
         for(Employee emp:employees){
            emp.displayEmployeeDetails();
         }
         
        // Update one employee's salary
         employees.get(3).setSalary(200000);

        // Remove one employee
         employees.remove(2);
         
        // Display updated list
        System.out.println("After update and removal:");
        for(Employee emp: employees)
        {
            emp.displayEmployeeDetails();
        }

        for(Employee emp:employees){
            if(emp.getId()==2){
                System.out.println("employee ID 2 is present and Employee name is "+ emp.getName());
                break;
            }
        }
    }
}
