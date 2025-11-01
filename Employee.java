package JavaPractice;

import java.io.Serializable;

public class Employee implements Serializable{
    private static final long serialVersionUID = 1L; // recommended

    
        private int id;
        private String name;
        private double salary;
        private String Department;

          public Employee(int id, String name, double salary){
            this.id=id;
            this.name=name;
            this.salary=salary;
            this.Department="General";
        }

        public Employee(int id, String name, double salary, String Department){
            this.id=id;
            this.name=name;
            this.salary=salary;
            this.Department=Department;
        }

        public String getDepartment() {
            return Department;
        }
        public void setDepartment(String department) {
            Department = department;
        }
        public int getId(){
            return id;
        }
        public String getName() {
            return name;
        }
        public double getSalary() {
            return salary;
        }
        public void setId(int id){
            this.id=id;
        }
        public void setName(String name) {  
            this.name = name;   
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }
        public void displayEmployeeDetails(){
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Salary: " + salary);
            System.out.println("Department: "+Department);
            System.out.println("------------------------");
            
        }
        
    }

