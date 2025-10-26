package JavaPractice;

public class Customer {
    private String name;
    private int age;

    
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void displayCustomers(){
        System.out.println("name and age of a customer is "+this.name+" and "+ this.age+" respectively.");
        System.out.println("------------------------------------------------------------------------");
    }
    
}
