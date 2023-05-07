/*Complete method printPopcornTime(), with int parameter bagOunces, and void return type. If bagOunces is less than 3, print "Too small". 
If greater than 10, print "Too large". Otherwise, compute and print 6 * bagOunces followed by "seconds". End with a newline. 
Example output for ounces = 7:
42 seconds */
import java.util.Scanner;

public class PopcornTimer {
   public void printPopcornTime(int bagOunces) {

      /* Your solution goes here  */

   }

   public static void main (String [] args) {
      PopcornTimer popcornBag = new PopcornTimer();
      popcornBag.printPopcornTime(7);
   }
}
 /* Your solution goes here  */
 if (bagOunces < 3){
         System.out.println("Too small");
         }
      else if(bagOunces > 10){
         System.out.println("Too large");
         }
      else {
         bagOunces *= 6;
         System.out.println(bagOunces + " seconds");
         }
