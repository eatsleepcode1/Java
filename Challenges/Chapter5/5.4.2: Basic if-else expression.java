Level 1
/*Write an expression that will cause the following code to print "less than 20" if the value of userAge is less than 20. */
import java.util.Scanner;

public class AgeChecker {
   public static void main (String [] args) {
      int userAge;

      Scanner scnr = new Scanner(System.in);
      userAge = scnr.nextInt(); // Program will be tested with values: 18, 19, 20, 21.

      if (/* Your code goes here */userAge < 20) {
         System.out.println("less than 20");
      }
      else {
         System.out.println("20 or more");
      }
   }
}
Level 2
/*Write an expression that will cause the following code to print "less than -15" if the value of userNum is less than -15. */
import java.util.Scanner;

public class NumberChecker {
   public static void main (String [] args) {
      int userNum;

      Scanner scnr = new Scanner(System.in);
      userNum = scnr.nextInt(); // Program will be tested with values: -14, -15, -16, -17.

      if (/* Your code goes here */userNum < -15) {
         System.out.println("less than -15");
      }
      else {
         System.out.println("-15 or more");
      }
   }
}
Level 3
/*Write an expression that will cause the following code to print "I am an adult" if the value of userAge is greater than 19 */
import java.util.Scanner;

public class AgeChecker {
   public static void main (String [] args) {
      int userAge;

      Scanner scnr = new Scanner(System.in);
      userAge = scnr.nextInt(); // Program will be tested with values: 18, 19, 20, 21.

      if (/* Your code goes here */userAge <= 19) {
         System.out.println("I am a teenager");
      }
      else {
         System.out.println("I am an adult");
      }
   }
}
