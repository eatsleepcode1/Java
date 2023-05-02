/*Airport runways are numbered using a 2-digit number, like 09. The meaning generally is that planes taking off or landing on that runway will be facing 
09 decadegrees or 90 degrees rotated right from north, namely facing east. Given a runway number (integer), 
output the degrees followed by the closest direction indication (north, northeast, east, southeast, south, southwest, west, or northwest). 
If the input is 03, the output is: 30 degrees (northeast).
Hints:
    First just read the input number, multiply by 10 to yield runwayDeg.
    Next, create an if-else statement to compare runwayDeg's value with ranges for each direction. 
    For north, the value should be within -22.5 and +22.5. For northeast, the value should be between 45 - 22.5 and 45 + 22.5. And so on.
    Based on the range in which the value falls, update a string variable with the direction. 
    Then after the if-else, have a single output statement that outputs "270 degrees (north)" or whatever value and direction are correct.
    Don't forget that ranges use &&. An expression detecting a value x is between 1 and 10 is (x > 1) && (x < 10).
    Because the input is an integer which is multiplied by 10 to yield runwayDeg, the comparisons with floating-point values like 22.5 will never 
    result in equality. Hence, the ranges don't have to account for such quality. */
import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int runwayNum;
      int runwayDeg;
      String runwayDirection = "err";

      runwayNum = scnr.nextInt();
      
      runwayDeg = runwayNum * 10;
      
      // Determine closest direction. Ranges are heading +/- 22.5.
      
      if ((runwayDeg > 0 - 22.5) && (runwayDeg < 0 + 22.5)) {
         runwayDirection = "north";
      }
      else if ((runwayDeg > 45 - 22.5) && (runwayDeg < 45 + 22.5)) {
         runwayDirection = "northeast";
      }
      else if ((runwayDeg > 90 - 22.5) && (runwayDeg < 90 + 22.5)) {
         runwayDirection = "east";
      }
      else if ((runwayDeg > 135 - 22.5) && (runwayDeg < 135 + 22.5)) {
         runwayDirection = "southeast";
      }
      else if ((runwayDeg > 180 - 22.5) && (runwayDeg < 180 + 22.5)) {
         runwayDirection = "south";
      }
      else if ((runwayDeg > 225 - 22.5) && (runwayDeg < 225 + 22.5)) {
         runwayDirection = "southwest";
      }
      else if ((runwayDeg > 270 - 22.5) && (runwayDeg < 270 + 22.5)) {
         runwayDirection = "west";
      }
      else if ((runwayDeg > 315 - 22.5) && (runwayDeg < 315 + 22.5)) {
         runwayDirection = "northwest";
      }
      
      System.out.println(runwayDeg + " degrees (" + runwayDirection + ")");
   }
}

/* NOTES: 

* Breaking a problem into sub-problems is common. Here, the first problem is converting the two-digit number to 
  degrees (by multiplying by 10) and outputing that item. The second is determining the direction, done using the if-else.
  
* Detecting if a value is in a range is common. The pattern is (x > 1) && (x < 10) to detect a value between 1 and 10.

* The program leaves the - 22.5 and + 22.5 to be clear, rather than doing the calculation. 

* Having one output statement at the end is cleaner than having output statements on every branch. Better to update
  a string in each branch, and then output that string at the end. 
  
* The comparisons of the integer and floating-point value is allowed. Note that integer runwayDegrees will never 
  equal any of the range values, which always end with 0.5. 

*/
