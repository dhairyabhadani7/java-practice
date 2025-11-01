package JavaPractice;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Dhairya", "Prabal", "Kuchi", "Abhishek", "Riya");

        System.out.println("Sequential Stream:");
        names.stream().forEach(name -> {
            System.out.println(Thread.currentThread().getName() + " -> " + name);
        });

        System.out.println("\nParallel Stream:");
        names.parallelStream().forEach(name -> {
            System.out.println(Thread.currentThread().getName() + " -> " + name);
        });
    }
}
