package JavaPractice;

import java.util.ArrayList;
import java.util.List;

class Repository<T>{
    private List<T> items = new ArrayList<>();
    
    public void addItem(T item){
        items.add(item);
    }
    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> getAllItems() {
        return items;
    }
}

// class Product{
//     private int id;
//     private String name;
//     private double price;

//     public Product(int id, String name, double price) {
//         this.id = id;
//         this.name = name;
//         this.price = price;
//     } 

//     public void displayProductsDetails(){
//         System.out.println("ID: "+id+" Name: "+name +" Price: "+price);
//     }

//     @Override
//     public String toString() {
//         return name + " (₹" + price + ")";
//     }

    
// }

public class GenericRepositoryExample {
    public static void main(String[] args) {
        Repository<Employee> employeeRepo = new Repository<>();
        employeeRepo.addItem(new Employee(101, "Dhairya", 70000));
        employeeRepo.addItem(new Employee(102, "Prabal", 75000));

        System.out.println("--- Employee Repository ---");
        for (Employee emp : employeeRepo.getAllItems()) {
            emp.displayEmployeeDetails();
        }
        
        // Repository<Product> productRepo = new Repository<>();
        // productRepo.addItem(new Product(1, "Laptop", 85000));
        // productRepo.addItem(new Product(2, "Smartphone", 40000));

        // System.out.println("\n--- Product Repository ---");
        // for (Product prod : productRepo.getAllItems()) {
        //     prod.displayProductsDetails();
        // }
    }
}
