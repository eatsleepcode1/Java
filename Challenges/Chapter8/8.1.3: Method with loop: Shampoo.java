/*Write a method printShampooInstructions(), with int parameter numCycles, and void return type. If numCycles is less than 1, print "Too few.". 
If more than 4, print "Too many.". Else, print "N: Lather and rinse." numCycles times, where N is the cycle number, followed by "Done.". 
End with a newline. Example output for numCycles = 2:

1: Lather and rinse.
2: Lather and rinse.
Done. */
import java.util.Scanner;

public class ShampooBottle {

   /* Your solution goes here  */

   public static void main (String [] args) {
      ShampooBottle trialSize = new ShampooBottle();
      trialSize.printShampooInstructions(2);
   }
}
 /* Your solution goes here  */
 public void printShampooInstructions(int numCycles){
      if(numCycles < 1){
         System.out.println("Too few.");
         }
      else if(numCycles > 4){
         System.out.println("Too many.");
         }
      else{
         for(int i = 1; i <= numCycles; i++){
         System.out.println(i + ":" + " Lather and rinse.");
         }
         System.out.println("Done.");
            }
      }
   
