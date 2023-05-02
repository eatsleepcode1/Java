/*An airline describes airfare as follows. A normal ticket's base cost is $300. Persons aged 60 or over have a base cost of $290. 
Children 2 or under have $0 base cost. A carry-on bag costs $10. A first checked bag is free, second is $25, and each additional is $50. 
Given inputs of age, carry-on (0 or 1), and checked bags (0 or greater), compute the total airfare.
Hints:
    First use an if-else statements to assign airFare with the base cost
    Use another if statement to update airFare for a carryOn
    Finally, use another if-else statement to update airFare for checked bags
    Think carefully about what expression correctly calculates checked bag cost when bags are 3 or more*/
import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int passengerAge;
      int carryOns;
      int checkedBags; 
      int airFare; 
      
      passengerAge = scnr.nextInt();
      carryOns = scnr.nextInt();
      checkedBags = scnr.nextInt();

      if (passengerAge >= 60) {
         airFare = 290; // Senior
      }
      else if (passengerAge <= 2) {
         airFare = 0; // Lap child
      }
      else {    // Regular: 2 < age < 60
         airFare = 300;
      }
   
      if (carryOns > 0) {
         airFare += 10;
      }
   
      if (checkedBags == 2) {
         airFare += 25;
      }
      else if (checkedBags >= 3) {
         airFare += 25 + (checkedBags - 2) * 50; // 2nd bag is $25. Each bag beyond 2nd is $50 
      }
      // Note: 0 or 1 bags is $0, so no adjustment to airfare
   
      System.out.println(airFare);
   }
}

/* NOTES
* Notice the careful use of distinct if-else statements. Each has a particular role.

* Updating a single value (airFare) is a common pattern. An alternative approach uses variables for baseCost, carryOnCost,
     and checkedBagCost. Each if-else assigns one of those variables. Then a final equation assigns 
     airFare = baseCost + carryOnCost + checkedBagCost

*/
