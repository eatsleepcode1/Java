Level 1
/*Write an if-else statement for the following:

If userTickets is equal to 7, execute awardPoints = 1. Else, execute awardPoints = userTickets.

Ex: If userTickets is 3, then awardPoints = 3. */

import java.util.Scanner;

public class TicketCounter {
   public static void main (String [] args) {
      int awardPoints;
      int userTickets;
   
      Scanner scnr = new Scanner(System.in);
      userTickets = scnr.nextInt(); // Program will be tested with values: 5, 6, 7, 8.
   
      /* Your code goes here */
     if(userTickets == 7){
         awardPoints = 1;
         }
      else{
         awardPoints = userTickets;
         }
     
      System.out.println(awardPoints);
   }
}
/*Write an if-else statement for the following:
If userTickets is not equal to 7, execute awardPoints = 10. Else, execute awardPoints = userTickets.
Ex: If userTickets is 14, then awardPoints = 10. */
import java.util.Scanner;

public class TicketCounter {
   public static void main (String [] args) {
      int awardPoints;
      int userTickets;
   
      Scanner scnr = new Scanner(System.in);
      userTickets = scnr.nextInt(); // Program will be tested with values: 5, 6, 7, 8.
   
      /* Your code goes here */
     if(userTickets !=7){
        awardPoints = 10;
        }
      else{
         awardPoints = userTickets;
         }  
   
      System.out.println(awardPoints);
   }
}
Level 2
/*Write an if-else statement for the following:
If numDifference is equal to -16, execute totalDifference = -25. Else, execute totalDifference = numDifference. */

import java.util.Scanner;

public class NumberDifference {
   public static void main (String [] args) {
      int totalDifference;
      int numDifference;
   
      Scanner scnr = new Scanner(System.in);
      numDifference = scnr.nextInt(); // Program will be tested with values: -14, -15, -16, -17.
      
      /* Your code goes here */
      if(numDifference == -16){
         totalDifference = -25;
         }
      else{
         totalDifference = numDifference;
         }
      
      
      System.out.println(totalDifference);
   }
} 
/*Write an if-else statement for the following:
If numDifference is not equal to -16, execute totalDifference = -10. Else, execute totalDifference = numDifference. */

import java.util.Scanner;

public class NumberDifference {
   public static void main (String [] args) {
      int totalDifference;
      int numDifference;
   
      Scanner scnr = new Scanner(System.in);
      numDifference = scnr.nextInt(); // Program will be tested with values: -14, -15, -16, -17.
      
      /* Your code goes here */
     if(numDifference != -16){
         totalDifference = -10;
         }
      else{
         totalDifference = numDifference;
         }
      
      System.out.println(totalDifference);
   }
}
