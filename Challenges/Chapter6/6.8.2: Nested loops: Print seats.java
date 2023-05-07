/*Given numRows and numColumns, print a list of all seats in a theater. Rows are numbered, columns lettered, as in 1A or 3E. 
Print a space after each seat, including after the last. Use separate print statements to print the row and column. 
Ex: numRows = 2 and numColumns = 3 prints:
1A 1B 1C 2A 2B 2C  */
import java.util.Scanner;
public class NestedLoops {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      int currentColumn;
      char currentColumnLetter;

      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();

      /* Your solution goes here  */
    currentRow = 0; // Must be intialized to 0 or a "2" will print before "1"
    while (currentRow < numRows) { // Intialized the loop
    currentRow++; // increments the currentRow
    currentColumnLetter = 'A'; // Sets the first column to char 'A'
    currentColumn = 1; // Define to intialize inner loop
    while (currentColumn <= numColumns) { // Will initial for any positive input 1 +
       System.out.print(currentRow); // Asked specifically for 2 printouts
       System.out.print(currentColumnLetter + " "); // 2nd printout with space at end.
       currentColumnLetter++; // increments the Letter
       currentColumn++; // increments the column
        }
    }
      System.out.println("");
   }
}
