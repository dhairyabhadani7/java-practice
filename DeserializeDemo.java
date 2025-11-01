package JavaPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        try (
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
        ) {
            Employee emp= (Employee)in.readObject();
            System.out.println("Deserialization complete:");
            emp.displayEmployeeDetails();
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Run SerializeDemo first.");
        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
