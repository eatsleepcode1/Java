/*Type two statements that use nextInt() to print 2 random integers between (and including) 100 and 149. End with a newline. Ex:
112
102
Note: For this activity, using one statement may yield different output (due to the interpreter calling randGen.nextInt() in a different order). 
Use two statements for this activity.  */

import java.util.Scanner;
import java.util.Random;

public class RandomGenerateNumbers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int seedVal;

      seedVal = scnr.nextInt();
      randGen.setSeed(seedVal);

      /* Your solution goes here  */

   }
}
 /* Your solution goes here  */
System.out.println(randGen.nextInt(150 - 100) + 100);
System.out.println(randGen.nextInt(150 - 100) + 100);
