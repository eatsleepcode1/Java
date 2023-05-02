/*Rideshare companies like Uber or Lyft track the x,y coordinates of drivers and customers on a map. 
If a customer requests a ride, the company's app estimates the minutes until the nearest driver can arrive. 
Write a method that, given the x and y coordinates of a customer and the three nearest drivers, returns the estimated pickup time. 
Assume drivers can only drive in the x or y directions (not diagonal), and each mile takes 2 minutes to drive. All values are integers.
Hints:
    Break the problem into three parts. In the first part, compute the three distances.
    In the second part, determine the minimum distance. In the third part, compute and return the time.
    Don't forget to use absolute value when computing the x distance, and again for the y distance, because direction doesn't matter. 
    You may wish to just write a small absolute value method.*/
import java.util.Scanner; 

public class LabProgram {
   public static int absVal(int a) { 
      if (a < 0) { 
         return -a; 
      } 
      else { 
         return a; 
      }
   }
   
   // All x, y, coordinates are in miles from the origin 0, 0. 
   public static int pickupMinutes(int userX, int userY, int d1X, int d1Y, int d2X, int d2Y, int d3X, int d3Y) { 
      int dist1;
      int dist2;
      int dist3;
      int minDist;
      
      // Compute distances
      dist1 = absVal(userX - d1X) + absVal(userY - d1Y);
      dist2 = absVal(userX - d2X) + absVal(userY - d2Y);
      dist3 = absVal(userX - d3X) + absVal(userY - d3Y);
      
      // Determine minimum distance
      minDist = dist1;
      if (dist2 < minDist) {
         minDist = dist2;
      }
      if (dist3 < minDist) {
         minDist = dist3;
      }
      
      // Calculate and return time (2 min per mile)
      return 2 * minDist;
   } 
   
   /* NOTES

   * Breaking the problem into three parts greatly simplifies the logic.
   
   * Computing the minimum (or maximum) of a few variables is a common pattern. Note the use of several if statements. 
     An if-else statement would be wrong. 
     
   * A programmer almost certainly will use copy-paste in this code. Programmers should be VERY alert to ensure to change
     all variables appropriately. A common error is forget to change a variable, like d1X instead of d2X. 
   
   */ 
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int userX, userY; 
      int d1X, d1Y; 
      int d2X, d2Y; 
      int d3X, d3Y; 
      
      userX = scnr.nextInt(); 
      userY = scnr.nextInt(); 
      d1X = scnr.nextInt(); 
      d1Y = scnr.nextInt(); 
      d2X = scnr.nextInt(); 
      d2Y = scnr.nextInt(); 
      d3X = scnr.nextInt(); 
      d3Y = scnr.nextInt(); 
      
      System.out.println(pickupMinutes(userX, userY, d1X, d1Y, d2X, d2Y, d3X, d3Y)); 
   }
}
