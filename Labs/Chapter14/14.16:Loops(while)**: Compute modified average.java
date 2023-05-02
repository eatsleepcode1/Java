/*Compute the average of a list of user-entered integers representing rolls of two dice. The list ends when 0 is entered. 
Integers must be in the range 2 to 12 (inclusive); integers outside the range don't contribute to the average. 
Output the average, and the number of valid and invalid integers (excluding the ending 0). If only 0 is entered, output 0. 
The output may be a floating-point value. Ex: If the user enters 8 12 13 0, the output is:
Average: 10
Valid: 2
Invalid: 1
Hints:
    Use a while loop with expression (userInt != 0).
    Read the user's input into userInt before the loop, and also at the end of the loop body.
    In the loop body, use an if-else to distinguish integers in the range and integers outside the range.
    For integers in the range, keep track of the sum, and number of integers. For integers outside the range, just keep track of the number.
    Use a cast to get a floating-point output: (double) sum / num .
    Whenever dividing, be sure to handle the case of the denominator being 0. */
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int validSum = 0;
      int validNum = 0;
      int invalidNum = 0;
      int userInt = 0;
      double averageNum = 0.0;
      
      userInt = scnr.nextInt();
      while (userInt != 0) {
         if ((userInt >= 2) && (userInt <= 12)) { // Valid
            validSum += userInt;
            validNum += 1;
         }
         else if (userInt != 0) { // Invalid
            invalidNum += 1;
         }
         else { // 0: Done
            // Do nothing. Looping will end. 
         }
         userInt = scnr.nextInt();
      }
      
      if (validNum > 0) { // Avoid dividing by 0
         averageNum = (double) validSum / validNum;
      }
         
      
      System.out.println("Average: " + averageNum);
      System.out.println("Valid: " + validNum);
      System.out.println("Invalid: " + invalidNum);

   }
}

/* NOTES: 

* Getting input before a while loop and at the end of a loop is a common pattern when the number of input values is unknown

* A while loop is usually preferred when the number of iterations is not known beforehand

* A common error is to forget to get the next input, yielding an infinite loop

* Division by 0 is undefined, yielding a runtime error. Thus, an if statement checks if validNum > 0.

*/
