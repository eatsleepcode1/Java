/*Given a list of integers, output those integers separated by a comma and space, except for the last which should be followed by a period (and newline). 
The first integer indicates how many integers are in the subsequent list. If the input is 4 1 7 3 5, the output should be: 1, 7, 3, 5.
Hints:
    Read in the first integer as numInts, followed by a for loop that loops numInts times.
    Decide whether to print the comma and space AFTER printing the current integer, or BEFORE. 
    For each possibility, figure out how you'll handle the special cases of the first and last items, 
    and then decide whether after or before is the best approach.
    You can print the period and newline after the above for loop.*/
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numInts;
      int currInt;
      int i;

      numInts = scnr.nextInt();
      for (i = 0; i < numInts; ++i) {
         if (i > 0) { // All but first int get preceded by comma and space.
            System.out.print(", ");
         }
         currInt = scnr.nextInt();;
         System.out.print(currInt);
      }
      System.out.println(".");
            
   }
}

/* NOTES

* Doing something special for the first and/or last items in a loop is a common pattern. Such items can be found
  using an if statement that checks the index. 
  
* Doing something just after a loop (in this case, adding a period) is also a common pattern. 

* The programmer might have considered outputting the comma and space just AFTER printing an integer instead of before,
  but there's no way to remove those for the last item. Thus, printing the comma and space BEFORE is preferred,
  but requires a check for the first item. 
*/ 
