/*Assign isTeenager with true if kidAge is 13 to 19 inclusive. Otherwise, assign isTeenager with false. */
import java.util.Scanner;

public class TeenagerDetector {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      boolean isTeenager;
      int kidAge;

      kidAge = scnr.nextInt();

      /* Your solution goes here  */
     isTeenager = ((kidAge >= 13)&&(kidAge <= 19));

      if (isTeenager) {
         System.out.println("Teen");
      }
      else {
         System.out.println("Not teen");
      }
   }
}
