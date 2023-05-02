/*12 values have been input into array yearlyValues. Output all 12 elements, with 4 per line. If the elements are 10 20 30 40 50 60 70 80 90 100 110 120, 
the output is:
10 20 30 40
50 60 70 80
90 100 110 120
Hints:
    Use a for loop with increment i += 4, rather than ++i.
    Inside the for loop, just print all four elements using four print statements. An inner loop could be used, but isn't necessary.*/
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] yearlyValues = new int[12];
      int i;
      int userNum;
      
      // Get array values
      for (i = 0; i < 12; ++i) {
         yearlyValues[i] = scnr.nextInt();
      }
      
      // Output values, four per line
      for (i = 0; i < 12; i += 4) {
         System.out.print(yearlyValues[i] + " ");
         System.out.print(yearlyValues[i + 1] + " ");
         System.out.print(yearlyValues[i + 2] + " ");
         System.out.println(yearlyValues[i + 3]);
      }
   }
}

      /* NOTES
   
      * Because the number of elements and number per line are fixed at 12 and 4, this straightforward approach was possible. 
        If those numbers could vary, nested loops would likely be needed. 
      
      * Care should always be taken to be sure no statement accesses an invalid vector element. Here, the lowest element
        will be when i = 0, element i (0). The highest will be when i = 8, element i + 3 (11). Both are valid. 
        
      * An alternative approach increments by 1, and uses an if-else in the loop body that checks if a space or newline should be output.
      
      */
