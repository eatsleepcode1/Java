/*Driving is expensive. Write a method costForMilesGas() that takes miles driven and returns the cents, 
assuming 30 miles per gallon and a per gallon price of $4. Write a similar method costForMilesMaintenance() that assumes tires last 20,000 miles 
and cost $500, and that assumes $300 of service every 10,000 miles. Finally, write a method costForMiles() that takes miles driven, and calls those
two methods, returning total cents. Use final variables in the methods as appropriate, like MILES_PER_GAL, not hardcoded values in the method's statements.
Use only integer arithmetic throughout. If the input is 50, the output should be: 941 cents
Hints:
    Because you are only using integer arithmetic, do any divisions as late as possible, to reduce the impact of integer division ignoring fractions
    For gas, use an equation like this: centsGas = (milesDriven * CENTS_PER_GAL) / MILES_PER_GAL;
    For service, use an equation that starts like this: 
    centsMaintenance = ((milesDriven * TIRES_CENTS) / TIRES_MILES) + … (Finish by adding a similar expression for service.*/
import java.util.Scanner; 

public class LabProgram {
   public static int costForMilesGas(int milesDriven) { 
      int centsGas; 
      final int MILES_PER_GAL = 30; 
      final int CENTS_PER_GAL = 400; 
      
      centsGas = (milesDriven * CENTS_PER_GAL) / MILES_PER_GAL; 
      // Note: Important to do the division last, because integer division ignores fraction 
      
      return centsGas; 
   } 
   
   public static int costForMilesMaintenance(int milesDriven) { 
      int centsMaintenance;
      // $500 every 20,000 miles for tires
      // $300 every 10,000 miles for service
      final int TIRES_CENTS = 50000;
      final int TIRES_MILES = 20000;
      final int SERVICE_CENTS = 30000;
      final int SERVICE_MILES = 10000;
      
      centsMaintenance = ((milesDriven * TIRES_CENTS) / TIRES_MILES) + ((milesDriven * SERVICE_CENTS) / SERVICE_MILES);
      
      // Note: Important to do the division last, because integer division ignores fraction. 
      
      return centsMaintenance;
   } 
   
   public static int costForMiles(int milesDriven) { 
      return costForMilesGas(milesDriven) + costForMilesMaintenance(milesDriven);
   } 
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int milesDriven; 
      
      milesDriven = scnr.nextInt(); 
      
      System.out.println(costForMiles(milesDriven) + " cents"); 
   }
}

/* NOTES

* Integer division usually benefits from doing divisions as late as possible

* An alternative approach would be to use floating-point division, and then casting to integers. However, some programmers
  believe that money should never use floating-point. We aren't as convinced, but avoided using floating-point here anyways.
  
* Integer arithmetic with multiplications and late division *could* yield numbers that are too large for an int. 
  In that case, a long might be used, or double. 
  
* Breaking a problem down into parts, and writing a function for each part, is a common pattern. Best to test each function
  separately, before putting them all together into the final program. 

*/
