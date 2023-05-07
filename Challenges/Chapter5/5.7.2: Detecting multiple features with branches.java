//Level 1
/*Given integer yearMade, write multiple if statements:

If yearMade is after 1952, output "Probably can carry several people."
If yearMade is 1961 or earlier, output "Probably only has a few safety features."
If yearMade is after 1995, output "Probably has traction control."
End with a newline.

Ex: If the input is 1963, then the output is:

Probably can carry several people. */
import java.util.Scanner;

public class Vehicle {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int yearMade;
      
      yearMade = scnr.nextInt();

      /* Your code goes here */
      if (yearMade > 1952){
         System.out.println("Probably can carry several people.");
         }
      if (yearMade <= 1961){
         System.out.println("Probably only has a few safety features.");
         }
      if (yearMade > 1995){
         System.out.println("Probably has traction control.");
         }
   }
}
//Level 2
/*Given integers numScore1 and numScore2, output "numScore1 is negative." if numScore1 is less than 0. End with a newline.

Assign numScore2 with 10 if numScore2 is less than 40. Otherwise, output "numScore2 is greater than or equal to 40." End with a newline.

Ex: If the input is -10 55, then the output is:

numScore1 is negative.
numScore2 is greater than or equal to 40.
numScore2 is 55. */
import java.util.Scanner;

public class NumberConditions {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numScore1;
      int numScore2;
      
      numScore1 = scnr.nextInt();
      numScore2 = scnr.nextInt();

      /* Your code goes here */
     if(numScore1 < 0){
         System.out.println("numScore1 is negative.");
         }
      if (numScore2 < 40){
         numScore2 = 10;
         }
      else{
         System.out.println("numScore2 is greater than or equal to 40.");
         }

     
      System.out.println("numScore2 is " + numScore2 + ".");
   }
}
//Level 3
/*Integers numDonuts and dollarAmount are read from input. A donut costs 3 dollars.

If numDonuts is less than 3, output "Please purchase at least 3."
If numDonuts is greater than or equal to 3, then declare and initialize int variable totalCost with the product of numDonuts and 3.
If totalCost is less than or equal to dollarAmount, output "Approved transaction."
Otherwise, output "Not all donuts purchased."
If numDonuts is greater than 29, output "Restocking soon." Otherwise, output "Item still in stock."
End with a newline.

Ex: If the input is 16 83, then the output is:

Approved transaction.
Item still in stock. */
import java.util.Scanner;

public class DonutShop {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numDonuts;
      int dollarAmount;
      
      numDonuts = scnr.nextInt();
      dollarAmount = scnr.nextInt();

      /* Your code goes here */
      if(numDonuts <= 3){
         System.out.println("Please purchase at least 3.");
         }
      if(numDonuts >= 3){
         int totalCost = numDonuts * 3;
         if(totalCost <= dollarAmount){
            System.out.println("Approved transaction.");
            }
         else{
            System.out.println("Not all donuts purchased.");
            }
      }
      if(numDonuts > 29){
         System.out.println("Restocking soon.");
         }
      else{
         System.out.println("Item still in stock.");
         }
   }
}
