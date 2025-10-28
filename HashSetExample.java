package JavaPractice;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //Created a string HashSet
        Set<String> names = new HashSet<>();
        // Add names to HashSet
        names.add("Dhairya");
        names.add("Prabal");
        names.add("Abhishek");
        names.add("Kuchi");
        names.add("Dhairya");

        // Print the names
        System.out.println(names);

        System.out.println("--------------------------");

        // Print the names individually
        for(String s:names){
            System.out.println(s);
        }

        System.out.println("------------------------------");

        System.out.println("Checking if dhairya is present");

        // check if the name is present 
        if(names.contains("Dhairya")){
            System.out.println("Dhairya is already present.");
        }

        System.out.println("-------------------------------");
        
         names.remove("Abhishek");

         // After remove names 
         System.out.println(names);

         System.out.println("---------------------------");

         System.out.println("Size of hashSet: "+names.size());

    }
}
