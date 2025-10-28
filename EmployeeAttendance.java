package JavaPractice;

import java.lang.classfile.attribute.SourceIDAttribute;
import java.util.HashSet;
import java.util.Set;

public class EmployeeAttendance {
    public static void main(String[] args) {
        //Created Integer HashSet 
        Set<Integer> checkedInEmployees = new HashSet<>();
        checkedInEmployees.add(101);
        checkedInEmployees.add(102);
        checkedInEmployees.add(103);
        checkedInEmployees.add(104);
        checkedInEmployees.add(105);
        checkedInEmployees.add(101); //Duplicate entry ignored
        // Display all the employees who checked in
        System.out.println("Checked in employees"+checkedInEmployees);

        // Check if specific employee is checked in
        int searchId=102;
        if(checkedInEmployees.contains(searchId)){
            System.out.println("Employee ID "+searchId+" has checked in");
        }
        else{
              System.out.println("Employee ID "+searchId+" has not checked in");
        }
        //One employee leaves early so remove from set 
        checkedInEmployees.remove(103);
        System.out.println("After employee 103 left "+checkedInEmployees);

        // show total numbers of employees present
        System.out.println("Total numbers of employees checked in "+checkedInEmployees.size());

        //clear at the end of the day
        checkedInEmployees.clear();
        System.out.println("End of the day, attendance cleared: " + checkedInEmployees);
    }
}
