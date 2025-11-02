package JavaPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;

public class DateTimeExample {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now()); 
        System.out.println(LocalDate.of(1998,10,7)); //DOB
        System.out.println(LocalDate.now().plusWeeks(1)); //Next week
        System.out.println(LocalDate.now().minusMonths(1)); //Last month
        System.out.println(Period.between(LocalDate.of(1998,10,7), LocalDate.now())); //total years
    }
}
