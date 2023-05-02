/*Many websites let users make reservations (hotel, car, flights, etc.). When a user selects a date, the next day is often automatically selected 
(for hotel checkout, car return, flight return, etc.). Given a date in the form of three integers, output the next date. 
If the input is 1 15 2017, the output should be 1 16 2017. If the input is 8 31 2017, the output should be 9 1 2017. Ignore leap years.
Hints:
    Group the months based on number of days. Then create an if-else statement for each case.
    Note that 12 (December) is a special case; after the last day, the next month is 1 (January) and is the next year.*/
import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userMonth;
      int userDay;
      int userYear;
      int nextMonth;
      int nextDay;
      int nextYear;
      
      userMonth = scnr.nextInt();
      userDay = scnr.nextInt();
      userYear = scnr.nextInt();
      
      // Days per month
      // Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec
      //  1   2   3   4   5   6   7   8   9   10  11  12
      //  31  28  31  30  31  30  31  31  30  31  30  31
      
      if ((userMonth == 12) && (userDay == 31)) { // Last day of year
         nextMonth = 1; 
         nextDay   = 1;
         nextYear  = userYear + 1;
      }
      else if (  ( (userMonth == 1) || (userMonth == 3) || (userMonth == 5)
                  || (userMonth == 7) || (userMonth == 8) || (userMonth == 10) )
               && (userDay == 31) ) {
         nextMonth = userMonth + 1;
         nextDay   = 1;
         nextYear  = userYear;
      }
      else if (  ( (userMonth == 4) || (userMonth == 6) || (userMonth == 9) || (userMonth == 11) )
               && (userDay == 30) ) {
         nextMonth = userMonth + 1;
         nextDay   = 1;
         nextYear  = userYear; 
      }
      else if ( (userMonth == 2) && (userDay == 28) ) {
         nextMonth = userMonth + 1;
         nextDay = 1;
         nextYear = userYear;
      }
      else { // Normal case, just increment day
         nextMonth = userMonth;
         nextDay = userDay + 1;
         nextYear = userYear;
      }
      System.out.println(nextMonth + " " + nextDay + " " + nextYear); 

   }
}
