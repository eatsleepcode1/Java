/*Find and fix the error in the if-else statement. */
import java.util.Scanner;

public class NumberChecker {
   public static void main (String [] args) {
      int userNum;
      
      Scanner input = new Scanner(System.in);
      userNum = input.nextInt();    // Program will be tested with values: 0, 1, 2, 3.

      if (userNum = 2) {
         System.out.println("Num is greater or equal to two");
      }
      else {
         System.out.println("Num is less than two");
      }

   }
}
/*Your solution here*/
if (userNum >= 2) {
         System.out.println("Num is greater or equal to two");
      }
