/*Complete the do-while loop to output from 0 to the value of countLimit using printVal. Assume the user will only input a positive number. 
For example, if countLimit is 5 the expected output will be
0 1 2 3 4 5 */
public class CountToLimit {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int countLimit;
      int printVal;

      // Get user input
      countLimit = scnr.nextInt();

      printVal = 0;
      do {
         System.out.print(printVal + " ");
         printVal = printVal + 1;
      } while (/* Your solution goes here */printVal <= countLimit);
      System.out.println("");
   }
}
