package JavaPractice;

 class Box<T>{
    private T item;

    public Box() {
    }

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
    
}

public class GenericExample {
    public static void main(String[] args) {
        Box<Integer> intBox= new Box<>();
        intBox.setItem(23);
        System.out.println("Integer Box contains: " + intBox.getItem());

         Box<String> strBox = new Box<>();
        strBox.setItem("Dhairya");
        System.out.println("String Box contains: " + strBox.getItem());

        Box<Employee> empBox = new Box<>();
        empBox.setItem(new Employee(101, "Dhairya", 75000));
        System.out.println("Employee Box contains:");
        empBox.getItem().displayEmployeeDetails();
    }
}
