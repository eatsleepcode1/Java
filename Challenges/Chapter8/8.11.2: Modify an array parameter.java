/*Write a method swapArrayEnds() that swaps the first and last elements of its array parameter. 
Ex: sortArray = {10, 20, 30, 40} becomes {40, 20, 30, 10}. The array's size may differ from 4. */
import java.util.Scanner;

public class ModifyArray {

   /* Display array values */
   public void displayValues(int [] arrayVals) {
      int i;

      for (i = 0; i < arrayVals.length; ++i) {
         System.out.print(arrayVals[i] + " ");
      }
      System.out.println("");
   }

   /* Your solution goes here  */

   public static void main (String [] args) {
      int numElem = 4;
      int[] sortedArray = new int[numElem];
      ModifyArray numInverter = new ModifyArray();

      // Add values to the array
      sortedArray[0] = 10;
      sortedArray[1] = 20;
      sortedArray[2] = 30;
      sortedArray[3] = 40;

      numInverter.swapArrayEnds(sortedArray);
      numInverter.displayValues(sortedArray);
   }
}
/* Your solution goes here  */
 public static void swapArrayEnds(int[] sortArray){
       int tempVal;
      
      tempVal = sortArray[0]; 
      sortArray[0] = sortArray[sortArray.length-1]; 
      sortArray[sortArray.length-1] = tempVal; 
      return;
      }
