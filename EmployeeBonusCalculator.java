package JavaPractice;

import java.util.List;

class FullTimeEmployee extends Employee{
    public FullTimeEmployee(int id, String name, double salary){
        super(id, name, salary);
    }
}

class PartTimeEmployee extends Employee{
    public PartTimeEmployee(int id, String name, double salary){
        super(id, name, salary);
    }
}

public class EmployeeBonusCalculator {
    
   public static <T extends Employee> void displayBonuses(List<T> employees){
    for(T emp: employees){
        double bonus = emp.getSalary()*0.1;
        System.out.println( emp.getName()+" get bonus of "+bonus);
    }
   }

    public static void main(String[] args) {
        List<FullTimeEmployee> fullTimers= List.of(
                new FullTimeEmployee(101, "Dhairya", 80000),
                new FullTimeEmployee(102, "Prabal", 90000)
        );

        List<PartTimeEmployee> partTimers = List.of(
                new PartTimeEmployee(201, "Abhishek", 40000),
                new PartTimeEmployee(202, "Kuchi", 50000)
        );
         System.out.println("Full-time Employees:");
        displayBonuses(fullTimers);

        System.out.println("\nPart-time Employees:");
        displayBonuses(partTimers);
    }
}
