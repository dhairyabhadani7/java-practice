package JavaPractice;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassExample {
    public static void main(String[] args) {

        //Autoboxing
        Integer salary=75000;
        Double bonusPercentage=12.5;
        Boolean isActive=true;

        System.out.println("Salary: " +salary);
        System.out.println("Bonus percentage: " +bonusPercentage);
        System.out.println("Active status: " +isActive);
        
        //Unboxing
        int newSalary = salary;

        System.out.println("actual salary after unboxing "+ newSalary);

        List<Integer> ratings= new ArrayList<>();
        ratings.add(5);
        ratings.add(3);
        ratings.add(3);
        ratings.add(4);
        ratings.add(5);

        System.out.println("Employee ratings : "+ratings);
         

        Employee emp = new Employee(101, "Dhairya", 790000);
        emp.displayEmployeeDetails();
        System.out.println("Employee Performance Rating: " + ratings.get(0));
    }
}
