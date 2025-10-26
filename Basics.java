package JavaPractice;


class SimpleMethods{
   static int addNumbers(int a, int b){
    return a+b;
}

   static int calculate(int a, int b, String operator){
       if(operator.equals("+")){
        return a+b;
       }
       else if(operator.equals("-")){
        return a-b;
       }
       else if(operator.equals("*")){
        return a*b;
       }
       else{
        return a/b;
       }
     }

   }
public class Basics {
    public static void main(String[] args) {
        int age=27;
        double salary =75000.0;

        String name="Dhairya";

        boolean isLearning =true;

        System.out.println(age);
        System.out.println(salary);
        System.out.println(name);
        System.out.println(isLearning);
          
        int marks=85;
        if(marks>=90){
            System.out.println("Grade: A+");
        }
        else if(marks>=75){
            System.out.println("Grade: A");
        }
        else if(marks>=60){
            System.out.println("Grade: B");
        }
        else{
            System.out.println("Grade: C");
        }

        for(int i=1;i<=5;i++){
            System.out.println("Iteration "+i);
        }

        int j=1;
        while (j<=5) {
            System.out.println("While loop: "+j);
            j++;
        }
        int sum = SimpleMethods.addNumbers(4,10);
        System.out.println("Sum "+sum);

        int a=10;
        int b=5;
        System.out.println("Before Swap a: "+a+" b: "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap a: "+a+" b: "+b);

        int number = 17;
        // Print whether the number is prime or not
        int cnt=0;
        for(int i=1;i*i<=number;i++){
            if(number%i==0){
                cnt++;
                if(number/i!=i){
                    cnt++;
                }
            }
        }
        if(cnt==2)
          System.out.println("Number is Prime.");
        else
          System.out.println("Number is not prime.");


         // Print whether the number is even or odd
          if(number%2==0){
            System.out.println("Number is even");
          }
          else{
            System.out.println("Number is odd");
          }

          int n = 10;

        // Use a for loop to calculate sum from 1 to n
        // Print the result
        int totalSum=0;
        for(int i=0;i<=n;i++){
         totalSum = totalSum +i;
        }
        System.out.println(totalSum);
       
        int num = 7;

       // Print multiplication table of num from 1 to 10 using a loop
        for(int i=1;i<=10;i++){
          System.out.println(num +" x "+ i+" = "+num*i);
        }

        // Create a method calculate(int a, int b, String operator)
        // Supports "+", "-", "*", "/" operators
        // Returns result and print inside main

        int result=SimpleMethods.calculate(20, 5, "/");
        System.out.println(result);

        
    }
}
