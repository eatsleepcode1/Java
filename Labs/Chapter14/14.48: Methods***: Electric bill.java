/*Southern California's electric company uses a "three tier" cost structure for household electric bills. 
As of Jan 2017, for a given month, the first 232 kWh is $0.08291/kWh, the next 696 kWh is $0.16838/kWh, and any additional kWh is $0.23336/kWh. 
Write a method that takes a household month's kWh, and the cutoffs and prices for the tiers, and returns that month's electric cost.
If the input is:
1700.0  232  0.08291  696  0.16838  0.23336
the output is:
$316.58
Output the total value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f\n", yourValue);
Hints:
    Think carefully through the logic of calculating the various cost contributions of each tier. We recommend calculating tier 3 first, then tier 2.
    Declare a variable named remainingKWh. Initialize it with the monthKWh. Also declare monthCost, initialized with 0.0. 
    Declare tierKWh to use for computations.
    Start with an if statement if remainingKWh > (tier2Cutoff + tier1Cutoff). If yes, compute just the kWh that are part of tier 3, 
    which is remainingKWh - (tier2Cutoff + tier1Cutoff), and store in tierKWh. Multiply tierKWh by tier3Cost, and add that to the monthCost. 
    Then decrease remainingKWh by tierKWh.
    Repeat for tier2.
    For whatever is left in remainingKWh, multiply by tier1Cost.*/
import java.util.Scanner; 

public class LabProgram {
   public static double calculateMonthElectricCost(double monthKWh, double tier1Cutoff, double tier1Cost, 
                                                   double tier2Cutoff, double tier2Cost, double tier3Cost) {
      double remainingKWh;
      double monthCost = 0.0; 
      double tierKWh;
      
      // monthKWh can be considered as having 3 parts on a numberline: 1111122222222223333
      // (The number of 1's, 2's, and 3's above is arbitrary, for illustrative purposes only). 
      // The first branch below multiplies part 3 by tier3Cost
      // The second branch multiplies part 2 by tier2Cost
      // Finally, part 1 is muliplied by tier1Cost
      
      remainingKWh = monthKWh;
      
      if (remainingKWh > (tier2Cutoff + tier1Cutoff)) { // Calculate the tier 3 amount 
         tierKWh = remainingKWh - (tier2Cutoff + tier1Cutoff);
         monthCost += tierKWh * tier3Cost; // The difference is the 3333 part above
         remainingKWh -= tierKWh; // This gets rid of the 3333 part, leaving the 11111222222222 part
      }
      
      if (remainingKWh > tier1Cutoff) { // Calculate the tier 2 amount
         tierKWh = remainingKWh - tier1Cutoff;
         monthCost += tierKWh * tier2Cost; // The difference is the 2222222222 part
         remainingKWh -= tierKWh; // This gets rid of the 2222222222 part
      }
      
      monthCost += remainingKWh * tier1Cost; // The difference is the 11111 part above 
      
      return monthCost;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double monthKWh; 
      double tier1Cutoff, tier2Cutoff; // In kWh; 
      double tier1Cost, tier2Cost, tier3Cost; // In $ per kWh
      double monthCost; 
      
      monthKWh = scnr.nextDouble(); 
      tier1Cutoff = scnr.nextDouble(); 
      tier1Cost = scnr.nextDouble(); 
      tier2Cutoff = scnr.nextDouble(); 
      tier2Cost = scnr.nextDouble(); 
      tier3Cost = scnr.nextDouble(); 
      
      monthCost = calculateMonthElectricCost(monthKWh, tier1Cutoff, tier1Cost, tier2Cutoff, tier2Cost, tier3Cost); 
      System.out.printf("$%.2f\n", monthCost);
   }
}

/* NOTES

* An alternative approach uses an if-elseif-else approach. The branches detect if monthKWh is <= the tier1Cutoff, or
is between tier1 and tier2 cutoffs, or is greater than the tier2cutoff. Each branch then has a unique expression to 
calculate the cost. We prefer the above approach, since it has just one calculation for each tier's cost. 

* The logic requires some getting used to. Each branch is just calculating that tier's contribution. Once that tier
is included in the cost, the kWh for that tier are thrown away from remainingKWh, leaving just the amount of kWh
in the lower tiers. Note that if the original kWh are less than tier2Cutoff, then the tier 3 branch won't execute. 
Likewise for the tier 2 branch.

* One should manually trace this code for values that include each tier, to make sure the logic is correct. 
Ex: For a small kWh, the first if branch won't execute, nor will the second. Only monthCost += remainingKWh * tier1Cost 
will execute. 

*/
