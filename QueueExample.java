package JavaPractice;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Integer Queue created 
        Queue<Integer> queue = new LinkedList<>();

        //Added integers elements
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        // Printed Integer Queue
        System.out.println("Queue elements: "+ queue);

        // Remove first element 
        System.out.println("Element removed from front: "+queue.remove());

        // Printed updated Queue

        System.out.println("After removing first element: "+ queue);

        // Checked the front element 

        System.out.println("Front element: "+ queue.peek());

        // Printed the size of a Queue

        System.out.println("Size of a Queue: "+queue.size());

        // Iterated Queue
        for(Integer i: queue){
            System.out.println(i);
        }
         // Created Employee Queue
        Queue<Employee> employees = new LinkedList<>();

        // Added employee details 

        employees.add(new Employee(1, "Dhairya", 75000));
        employees.add(new Employee(2, "Prabal", 70000));
        employees.add(new Employee(3, "Abhishek", 85000));
        employees.add(new Employee(4, "Kuchi", 175000));

        // Iterated Employee details

        for(Employee emp:employees){
            emp.displayEmployeeDetails();
        }

        //Removed employee from the front
        
         Employee removedEmp = employees.remove();
         System.out.println("Removed employee:");
         removedEmp.displayEmployeeDetails();
        

        // Iterated updated queue

         for(Employee emp:employees){
            emp.displayEmployeeDetails();

        }
        //  Checked the front employee
        employees.peek().displayEmployeeDetails();

    }
}
