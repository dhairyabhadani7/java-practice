package JavaPractice;

import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Array initialization and printing of an array
        int[] arr= {1,23,4,62,13};
        System.out.println("Array Length: "+arr.length);
        for(int i:arr){
            System.out.println(i);
        }

        //Array Initialization, take array input and print the array index and array elements
         System.out.println("Enter the size of an array: ");
         int size=sc.nextInt();
        int[] userArray=new int[size];
         for(int i=0;i<userArray.length;i++){
             userArray[i]=sc.nextInt();
         }

         for(int j=0;j<userArray.length;j++){
            System.out.println("Array index: "+ j+ " Array element: "+ userArray[j]);
         } 

         //Find the largest and smallest element in an array

         int[] nums={1,-656,8,-23,7,34};
         int largest=Integer.MIN_VALUE;
         int smallest = Integer.MAX_VALUE;
            if(nums.length<=1){
                System.out.println("We can't find largest element due to insufficient number of elements");
            }
         for(int i=0;i<nums.length;i++){
            if(largest<nums[i])
                largest=nums[i];
            if(smallest>nums[i])
                smallest=nums[i];
         }
         System.out.println("Largest element: "+largest+" \nSmallest element: "+smallest);

         //Calculate sum of elements in an array and its average

         int[] array={1,2,-3,-4,5};

         float sum=0;
         float avg;
         for(int i=0;i<array.length;i++){
             sum=sum+array[i];
         }
         avg=sum/(array.length);
         System.out.println("Sum is: "+sum+" Average is: "+avg);
         sc.close();
    }
}
