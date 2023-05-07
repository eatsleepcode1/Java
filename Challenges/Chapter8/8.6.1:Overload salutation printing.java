/*Complete the second printSalutation() method to print the following given personName "Holly" and customSalutation "Welcome":
Welcome, Holly */
import java.util.Scanner;

public class MultipleSalutations {
   public void printSalutation(String personName) {
      System.out.println("Hello, " + personName);
   }

   /* Your solution goes here  */

   public static void main (String [] args) {
      MultipleSalutations nameTag = new MultipleSalutations();

      nameTag.printSalutation("Sanjiv");
      nameTag.printSalutation("Holly", "Welcome");
   }
}
/* Your solution goes here  */
public void printSalutation(String personName,String customSalutation){
      System.out.println(customSalutation + ", " + personName);
      }
