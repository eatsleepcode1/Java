/*The following program simulates a vending machine panel. The program gets an integer that represents the user's selected item, 
and then outputs a dispensing message. Only 8 items are for purchase. Ex: The input 2 results in the message "Dispensing item 2".
Arrange the following lines to handle two exceptions. If the user enters an item number that is not for purchase, 
the program throws an Exception with the message "Try again", outputs the exception message, and then tries again. 
If the user enters a non-integer input, the program throws an InputMismatchException, outputs "Fatal error", and then exits.
Not all lines are used in the solution. */
import java.util.Scanner;
import java.util.InputMismatchException;

public class VendingMachine {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       int itemNumber = 0;
       boolean askForInput = true;
     
       while (askForInput) {
           try {
               itemNumber = scnr.nextInt();
               System.out.print("Select an item (1-8): ");
               if ((itemNumber <= 0) || (itemNumber > 8)) {
                   throw new Exception("Try again");
               }
             
               System.out.println("Dispensing item " + item);
               askForInput = false;  
              }    
               catch (InputMismatchException e) {
               askForInput = false;
               System.out.println("Fatal error");
               } 
              catch (Exception e) {
              System.out.println(e.getMessage());

           }

       }

   }

}
