/*Complete a program that creates an object of the Count class, takes three integers as input: low, high, and x, and then calls the countMultiples() method. 
The countMultiples() method then returns the number of multiples of x between low and high inclusively.
Ex: If the input is:
1 10 2
countMutiples() returns and the program output is:
5
Hint: Use the % operator to determine if a number is a multiple of x. Use a for loop to test each number between low and high.
Note: Your program must define the method:
public int countMultiples(int low, int high, int x)*/
import java.util.Scanner;

public class Count {
   
   public int countMultiples(int low, int high, int x) {
       /* Type your code here. */
         int count = 0;
         int i; //defining integer variables that hold value

         for(i = low; i <= high; i++) {//defining loop that iterates value between low and high  
           if(i % x == 0) {//defining if block that uses % operator to check value
               count++; //incrementing counter value
           }
       }
         return count; //return counter value
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      /* Type your code here. */
      int low;
      int high;
      int x;
      int count = 0;
       
      low = scnr.nextInt(); //input value

      high = scnr.nextInt();//input value

      x = scnr.nextInt();//input value
      
      int i; //defining integer variables that hold value

         for(i = low; i <= high; i++) {//defining loop that iterates value between low and high  
           if(i % x == 0) {//defining if block that uses % operator to check value
               count++; //incrementing counter value
           }
       }
      System.out.println(count); //calling method and print its value
   }
}

