package JavaPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
     // Created HashMap of Account number and Customer
    Map<Integer, Customer> customerMap = new HashMap<>();

    //Add customers
    customerMap.put(101,new Customer("Dhairya",27));
    customerMap.put(102,new Customer("Prabal",28));
    customerMap.put(103,new Customer("Abhishek",26));
    customerMap.put(104,new Customer("Kuchi",29));

    //Display all customers
    for(Map.Entry<Integer,Customer> entry: customerMap.entrySet()){
        System.out.println("Account number: "+ entry.getKey());
        entry.getValue().displayCustomers();
    }
    Customer cus=customerMap.get(102);
    if(cus!=null){
        System.out.println("The account number is present: " );
        customerMap.get(102).displayCustomers();
    }
    else{
        System.out.println("This account number is not present");
    }
    //Update customer details
    Customer c= customerMap.get(104);
    if(c!=null){
        c.setAge(30);
    }

    //Remove one customer 
    customerMap.remove(103);
    System.out.println("--- Updated Customers ---");
    for (Map.Entry<Integer, Customer> entry : customerMap.entrySet()) {
        System.out.println("Account Number: " + entry.getKey());
            entry.getValue().displayCustomers();
    }
         if (customerMap.containsKey(101)) {
            System.out.println("Account 101 exists in the system!");
        }

        // Check if a specific customer exists (by value)
        if (customerMap.containsValue(c)) {
            System.out.println("Customer with age 30 exists!");
        }

        // Print total customers
        System.out.println("Total customers: " + customerMap.size());
   }

}
