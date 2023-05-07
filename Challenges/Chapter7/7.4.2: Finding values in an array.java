/*Assign numMatches with the number of elements in userValues that equal matchValue. userValues has NUM_VALS elements.
Ex: For inputs 2 2 1 2 2, where the first 2 is matchValue and 2 1 2 2 are the elements in userValues, numMatches is 3.

Your code will be tested with the following values:
2 2 1 2 2, where the first 2 is matchValue and 2 1 2 2 are the elements in userValues (as in the example above).
0 0 0 0 0, where the first 0 is matchValue and 0 0 0 0 are the elements in userValues.
10 20 50 70 100, where 10 is matchValue and 20 50 70 100 are the elements in userValues. */
import java.util.Scanner;

public class FindMatchValue {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);

      final int NUM_VALS = 4;
      int[] userValues = new int[NUM_VALS];
      int i;
      int matchValue;
      int numMatches; // Assign numMatches with 0 before your for loop

      matchValue = scnr.nextInt();
      for (i = 0; i < userValues.length; ++i) {
         userValues[i] = scnr.nextInt();
      }

      /* Your solution goes here  */
      numMatches = 0;
      for(i = 0; i < userValues.length; ++i){
         if(userValues[i] == matchValue){
            ++numMatches;
            }
         }
      System.out.println("matchValue: " + matchValue + ", numMatches: " + numMatches);
   }
}
