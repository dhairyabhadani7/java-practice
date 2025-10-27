package JavaPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.addFirst(5);   
        numbers.addLast(50); 
        System.out.println("LinkedList elements: "+numbers);

        numbers.remove(2);

        System.out.println("After removing number at index 2 "+numbers);

       System.out.println("First element: "+numbers.getFirst());
       System.out.println("Last element: "+numbers.getLast());
        
         // Iterate through LinkedList
        System.out.println("Iterating elements:");
        for (int num : numbers) {
            System.out.println(num);
        }
        List<Employee> employees = new LinkedList<>();

         employees.add(new Employee(1, "Dhairya", 75000));
         employees.add(new Employee(2, "Prabal", 70000));
         employees.add(new Employee(3, "Abhishek", 80000));
         employees.add(new Employee(4, "Kuchi", 175000));

          System.out.println("\n--- Employee List ---");
          for (Employee emp : employees) {
            emp.displayEmployeeDetails();
           }

            // Remove one employee
            employees.removeFirst();

           System.out.println("After removing first employee:");
           for (Employee emp : employees) {
              emp.displayEmployeeDetails();
           }
        
           

    }
}
