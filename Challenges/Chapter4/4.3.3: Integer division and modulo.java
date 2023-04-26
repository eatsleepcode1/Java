Level 1
/*Integer variables totalMinutes and mileTime are read from input. A person takes mileTime minutes to walk a mile, and has totalMinutes minutes available. 
Assign remainingMinutes with the remaining minutes after the person walks as many complete miles as possible.
Ex: If the input is 13 4, then the output is:
Remaining minutes: 1 */

import java.util.Scanner;
 
public class RemainingMinutes {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int totalMinutes;
      int mileTime;
      int remainingMinutes;
 
      totalMinutes = scnr.nextInt();
      mileTime = scnr.nextInt();
      
     /*Your code goes here */
      remainingMinutes = totalMinutes % mileTime;

      System.out.println("Remaining minutes: " + remainingMinutes);
   }
}
Level 2
/*Integer inputNum is read from input. Assume inputNum is greater than 1000 and less than 99999. Assign onesDigit with inputNum's ones place value.
Ex: If the input is 29684, then the output is:
The value in the ones place is: 4 */

import java.util.Scanner;
 
public class ValueFinder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputNum;
      int onesDigit;
 
      inputNum = scnr.nextInt();

      /* Your code goes here */
     onesDigit = inputNum % 10;

      System.out.println("The value in the ones place is: " + onesDigit);
   }
}
Level 3
/*Convert totalSeconds to hours, minutes, and seconds, finding the maximum number of hours, then minutes, then seconds.
Ex: If the input is 18091, then the output is:
Hours: 5
Minutes: 1
Seconds: 31
Note: An hour has 3600 seconds. A minute has 60 seconds. */
 import java.util.Scanner;
 
public class TimeConverter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int totalSeconds;
      int numHours;
      int numMinutes;
      int numSeconds;
 
      totalSeconds = scnr.nextInt();

      /* Your code goes here */
     
     
      System.out.println("Hours: " + numHours);
      System.out.println("Minutes: " + numMinutes);
      System.out.println("Seconds: " + numSeconds);
   }
}
