/*Given positive integer numInsects, write a while loop that prints, then doubles, numInsects each iteration. Print values < 200. 
Follow each number with a space. After the loop, print a newline. Ex: If numInsects = 16, print:
16 32 64 128  */
import java.util.Scanner;

public class InsectGrowth {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numInsects;

      numInsects = scnr.nextInt(); // Must be >= 1

      /* Your solution goes here  */
      while (numInsects < 200) {
            System.out.print(numInsects + " ");
            numInsects = numInsects * 2;
            if (numInsects >= 200){ 
               } 
          } 
      System.out.println(); 
   }
}
