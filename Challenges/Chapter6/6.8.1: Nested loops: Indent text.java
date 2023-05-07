/*Print numbers 0, 1, 2, ..., userNum as shown, with each number indented by that number of spaces. For each printed line, print the leading spaces, 
then the number, and then a newline. Hint: Use i and j as loop variables (initialize i and j explicitly). 
Note: Avoid any other spaces like spaces after the printed number. Ex: userNum = 3 prints:
0
 1
  2
   3 */
import java.util.Scanner;
public class NestedLoop {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int i;
      int j;

      userNum = scnr.nextInt();

      /* Your solution goes here  */
      for (i = 0; i <= userNum; ++i) {
        System.out.println(i);
     for (j = 0; j <= i; ++j) {
        if (i == userNum) {
           System.out.print("");
        }
        else {
           System.out.print(" ");
           }
        }
      }
   }
}
