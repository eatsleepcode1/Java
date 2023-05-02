/*24-hour time (also known in the U.S. as military time) is widely used around the world. Time is expressed as hours since midnight. 
The day starts at 00:00, and ends at 23:59. Write a program that converts am/pm time to 24-hour time. 
The input is two numbers and a string. If the input is 2 30 pm, the output should be 14:30. If the input is 12 01 am, the output should be 00:01.
Hints:
    Think of how each hour should be handled. 12 00 am -12 59 am becomes what? 8 00 am becomes what? 12 00 pm? 1 00 pm? 
    Group the hours into cases that should be handled similarly (e.g., 1 00 am to 11 00 am are handled the same).
    Declare variables for hoursAmPm, minAmPm, and hours24. Note that minutes for 24-hour time remain the same as for am/pm, so no extra variable is needed.
    Use an if-else statement to detect each case, and set the hours24 appropriately.
    When outputting hour24, check if the hour is 0-9 (just check for < 10). If so, output a "0". So 7 will be output as 07. 
    Do the same when outputting the minutes.  */
import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int hourAmPm;
      int minAmPm;
      String amPm;
      
      int hour24;
      
      hourAmPm = scnr.nextInt();
      minAmPm = scnr.nextInt();
      amPm = scnr.next();
      
      if ( (hourAmPm == 12) && (amPm.equals("am")) ) { // Special case for first hour
         hour24 = 0;
      }
      else if ( (amPm.equals("pm")) && (hourAmPm != 12) ) { // Add 12 for 1 pm and higher (not for 12 pm).
         hour24 = hourAmPm + 12;  // Ex: 2 pm becomes 14 
      }
      else { // must be 1 am to 11 am, so hour stays the same (e.g., 9 am stays 9 am
         hour24 = hourAmPm;
      }
   
      if (hour24 < 10) { // Prepend a "0", such as 02:30
         System.out.print("0");
      }
   
      System.out.print(hour24 + ":"); 
   
      if (minAmPm < 10) { // Prepend a "0", such as 12:01
         System.out.print("0");
      }
   
      System.out.println(minAmPm);

   }
}


/* NOTES

* Enumerating cases as above is a common skill needed by a programmer. 

* Formulating an if-else to detect each case is also a common skill. Note that the structure of the if-else captures
  each case, without using complicated expressions, because if an expression evaluates to false, the next expression
  can take advantage of that fact, especially in the "else" part. 
  
* The output is just text, so we could prepend 0's to the hour and minute. Trying to get those integers to output
  with a leading 0 would have been hard. The program could have also written to a string, and then output that string.

*/
