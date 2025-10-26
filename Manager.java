package JavaPractice;

public class Manager extends Employee {
    private double bonus;

    public Manager(int id, String name, double salary, double bonus){
        super(id, name, salary);
        this.bonus=bonus;
    }

    public void displayEmployeeDetails(){
        super.displayEmployeeDetails();
        System.out.println("Bonus: "+this.bonus);
        System.out.println("-----------------------------------------------");
    }

    public double getTotalSalary(){
        return getSalary()+bonus;
    }

}
