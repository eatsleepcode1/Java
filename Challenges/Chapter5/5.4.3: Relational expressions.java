Level 1
/*Write an expression that will cause the following code to print "Foot or less" if the value of numInches is less than or equal to 12. */
import java.util.Scanner;

public class Relational {
   public static void main (String [] args) {
      int numInches = 0;
      
      Scanner input = new Scanner(System.in);
      numInches = input.nextInt(); // Program will be tested with values: 10, 11, 12, 13, 14.
      
      if (/* Your code goes here */numInches <= 12) {
         System.out.println("Foot or less");
      }
      else {
         System.out.println("More than a foot");
      }
   }
}
Level 2
/*Write an expression that will cause the following code to print "greater than or equal to -10" if the value of userNum is greater than or equal to -10. */
import java.util.Scanner;

public class Relational {
   public static void main (String [] args) {
      int userNum = 0;
      
      Scanner input = new Scanner(System.in);
      userNum = input.nextInt(); // Program will be tested with values: -9, -10, -11, -12.
      
      if (/* Your code goes here */userNum >= -10) {
         System.out.println("greater than or equal to -10");
      }
      else {
         System.out.println("less than -10");
      }
   }
}
Level 3
/*Complete the expression so that 
userPoints is assigned with 0 if userItems is greater than 20 (second branch). Otherwise, userPoints is assigned with 10 (first branch). */
public static void main (String [] args) {
      int userItems = 0;
      int userPoints = 0;
      
      Scanner input = new Scanner(System.in);
      userItems = input.nextInt(); // Program will be tested with values: 15, 19, 20, 21, 25, 30
      
      if (/* Your code goes here */userItems <= 20) {
         userPoints = 10;
      }
      else {
         userPoints = 0;
      }
      System.out.println(userPoints);
   }
}
