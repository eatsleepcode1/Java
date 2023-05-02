/*A user inputs the name of a shape (square or triangle). The program outputs the shape using asterisks. For input square, the output is:

***
* *
***

If the input is triangle, the output is:

  *
 * *
*****
*/
import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userShape;
      
      userShape = scnr.next();      
      
      if (userShape.equals("square")){
         System.out.println("***");
         System.out.println("* *");
         System.out.println("***");         
      }
      
      else if (userShape.equals("triangle")){
         System.out.println("  *");
         System.out.println(" * *");
         System.out.println("*****");
      }
   }
}
