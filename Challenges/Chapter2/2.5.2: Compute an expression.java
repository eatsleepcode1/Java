/*Write a statement that assigns finalResult with the sum of num1 and num2, divided by 3. Ex: If num1 is 4 and num2 is 5, finalResult is 3.
 **/
 
import java.util.Scanner;

public class ComputingFinalResult {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int finalResult;

      num1 = scnr.nextInt();
      num2 = scnr.nextInt();

      /* Your solution goes here  */

      System.out.print("Final result: ");
      System.out.println(finalResult);
   }
}
Solution: finalResult = (num1 + num2) / 3; 
