package JavaPractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
     public static void main(String[] args) {
          Employee emp = new Employee(101, "Dhairya", 100000, "IT");

          try (
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
          ) {
            out.writeObject(emp);
            System.out.println("✅ Employee object has been serialized and saved to employee.ser");
            
          } catch (IOException e) {
            e.printStackTrace();
          }
     }    
}
