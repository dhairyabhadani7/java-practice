package JavaPractice;

public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        // Autoboxing
        int salary = 80000;
        Integer boxedSalary = salary; // primitive to wrapper
        System.out.println("Autoboxed Salary (Integer): " + boxedSalary);

        // Unboxing
        Double bonusPercentage = 12.5;
        double bonus = bonusPercentage; // wrapper to primitive
        System.out.println("Unboxed Bonus Percentage: " + bonus);

        // Example in expression
        Integer a = 10, b = 20;
        Integer result = a + b; // auto-unboxing + arithmetic + autoboxing
        System.out.println("Result after arithmetic: " + result);

        // Beware of nulls
        Integer x = null;
        try {
            int unsafe = x; // Unboxing null
        } catch (NullPointerException e) {
            System.out.println(" Cannot unbox null value!");
        }
    }
}
