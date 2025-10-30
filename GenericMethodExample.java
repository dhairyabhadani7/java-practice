package JavaPractice;

public class GenericMethodExample {

    public static <T> void displayItem(T item){
         System.out.println("Item: "+item);
    }

    public static <T, V> void displayPair(T first, V second){
        System.out.println("First: "+ first +" & Second: "+ second);

    }
    public static void main(String[] args) {
        displayItem(123);

        displayItem("Dhairya");

        displayPair("Dhairya", 27);

        Employee emp = new Employee(101, "Dhairya", 70000);
        displayPair(emp.getName(), emp.getSalary());
    }
}
