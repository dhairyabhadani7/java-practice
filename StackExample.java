package JavaPractice;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        
        // Created an Integer Stack

        Stack<Integer> stack = new Stack<>();
        // Added elements in Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Iterated the stack elements

        for(Integer i: stack){
          System.out.println("Stack elements are: "+i);
        }

        // Removed the top element 
        int removedElement=stack.pop();
        System.out.println("Removed element "+ removedElement);

        // Top element now
        System.out.println("The top element now: "+ stack.peek());

        // size of a Stack
        System.out.println("Size of Stack: "+stack.size());
        
        System.out.println("--------------------------------------------");

        // Created a Employee Stack
        Stack<Employee> employees=new Stack<>();
         
        //Added employee details in Stack
        employees.push(new Employee(1, "Dhairya", 75000));
        employees.push(new Employee(2, "Prabal", 70000));
        employees.push(new Employee(3, "Abhishek", 85000));
        employees.push(new Employee(4, "Kuchi", 175000));
         
        // Iterated the stack
        System.out.println("employee details are:");
        for(Employee emp: employees){
            emp.displayEmployeeDetails();
        }
         
        // The top employee removed
    
        System.out.println("The top Employee removed: ");
        employees.pop().displayEmployeeDetails();;
        

        // Top employee
        System.out.println("the top employee now: ");
        employees.peek().displayEmployeeDetails();

        //Size of a Stack

        System.out.println("Size of a stack: "+ employees.size());





    }
}
