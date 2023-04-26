Level 1
/*If integer dimensionsNumber is 1, output "One-dimensional space". Otherwise, output "Not a one-dimensional space". End with a newline.
Ex: If the input is 1, then the output is:
One-dimensional space */

import java.util.Scanner;

public class IfElse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int dimensionsNumber;
      
      dimensionsNumber = scnr.nextInt();
      
      /* Your code goes here */
      if(dimensionsNumber == 1){
         System.out.println("One-dimensional space");
         }
      else{
         System.out.println("Not a one-dimensional space");
         }
   }
}
Level 2
/*If integer numMusicians is:
    2, output "Duo".
    1, output "Solo".
Otherwise, output "Another number of musicians". End with a newline.
Ex: If the input is 2, then the output is:
Duo */
import java.util.Scanner;

public class MultIfElse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numMusicians;
      
      numMusicians = scnr.nextInt();
      
      /* Your code goes here */
      if(numMusicians == 2){
         System.out.println("Duo");
         }
      else if(numMusicians == 1){
         System.out.println("Solo");
         }
      else{
         System.out.println("Another number of musicians");
         }
   }
}
Level 3
/*If integer cardDeckSize is:
    48, output "Pinochle".
    32, output "Piquet".
    36, output "Short deck".
Otherwise, output "Another deck type". End with a newline.
Ex: If the input is 48, then the output is: 
Pinochle */
import java.util.Scanner;

public class MultIfElse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int cardDeckSize;
      
      cardDeckSize = scnr.nextInt();
      
      /* Your code goes here */
      if(cardDeckSize == 48){
         System.out.println("Pinochle");
         }
      else if(cardDeckSize == 32){
         System.out.println("Piquet");
         }
      else if(cardDeckSize == 36){
         System.out.println("Short deck");
         }
      else{
         System.out.println("Another deck type");
         }
   }
}
