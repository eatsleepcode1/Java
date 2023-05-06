/*Iterating through ArrayLists
The program below allows a user to enter 8 numbers, then prints the average of those 8 numbers. 
The first loop uses the add() method to add each user-specified number to the ArrayList userNums. After adding the numbers to userNums, 
the size() method can be used to determine the number of elements in userNums. Thus, size() is used in the second for loop to calculate the sum, 
and in the statement that computes the average.
With an ArrayList and loops, the program could easily be changed to support say 100 numbers; the code would be the same, 
and only the value of NUM_ELEMENTS would be changed to 100. */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAverage {
   public static void main(String[] args) {
      final int NUM_ELEMENTS = 8;
      Scanner scnr = new Scanner(System.in);
      ArrayList<Double> userNums = new ArrayList<Double>(); // User numbers
      Double sumVal;
      Double averageVal; 
      int i; 
      
      // Get user numbers and add to userNums
      System.out.println("Enter " + NUM_ELEMENTS + " numbers...");
      for (i = 0; i < NUM_ELEMENTS; ++i) {
         System.out.print("Number " + (i + 1) + ": ");
         userNums.add(scnr.nextDouble());
      }
      
      // Determine average value
      sumVal = 0.0;
      for (i = 0; i < userNums.size(); ++i) {
         sumVal = sumVal + userNums.get(i); // Calculate sum of all numbers
      }
      averageVal = sumVal / userNums.size(); // Calculate average 
      
      System.out.println("Average: " + averageVal);
   }
}
