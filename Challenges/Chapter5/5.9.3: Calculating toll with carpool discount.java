/*A toll road may have a discount for carpools, sometimes called high-occupancy vehicles (HOV). T
he following program uses if-else statement to adjust the toll amount based on the number of people in the vehicle. The carpool discount rules are:

A carpool is 3 or more people per vehicle.
The toll for carpools on weekdays between 6:00 am and 10:00 am is half the normal toll.
Otherwise, the toll for carpools is 0 (as in free). */
import java.util.Scanner;
 
public class TollCalc {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int timeHour;      // Time of travel hour (24 hour format)
      int timeMinute;    // Time of travel minute
      int typeOfDay;     // 0 - weekday, 1 - weekend/holiday
      int numPeople;    // People in vehicle
      int inputColon;    // Used to read time format
      String userInput;  // User specified time
      double tollAmount;
   
      System.out.print("Enter time of travel (HH:MM in 24 hour format): ");
 
      // Read an integer (hour), colon (char), and integer (minute)
      // with built-in string operators (discussed elsewhere)      
      userInput = scnr.nextLine();
      inputColon = userInput.indexOf(":");
      timeHour = Integer.parseInt(userInput.substring(0, inputColon));
      timeMinute = Integer.parseInt(userInput.substring(inputColon + 1, userInput.length()));
 
      System.out.print("Enter type of day (0 - weekday, 1 - weekend/holiday): ");
      typeOfDay = scnr.nextInt();
   
      System.out.print("Enter number of people in vehicle: ");
      numPeople = scnr.nextInt();

      if (typeOfDay == 0) { // Weekday time and rates
                            // Determine toll based on hour of travel
         if (timeHour < 6) {         // Before 6:00 am
            tollAmount = 1.55;
         }
         else if (timeHour < 10) {   // 6 am to 9:59 am
            tollAmount = 4.65;
         }
         else if (timeHour < 18) {   // 10 am to 5:59 pm
            tollAmount = 2.35;
         }
         else {                      // 6 pm and after
            tollAmount = 1.55;
         }
      }
      else { // Weekend/holiday time and rates
             // Determine toll based on hour of travel
         if (timeHour < 8) {         // Before 8:00 am
            tollAmount = 1.55;
         }
         else if (timeHour < 12) {   // 8 am to 11:59 am
            tollAmount = 3.05;
         }
         else if (timeHour < 16) {   // 12 pm to 3:59 pm
            tollAmount = 3.45;
         }
         else if (timeHour < 19) {   // 4 pm to 6:59 pm
            tollAmount = 3.60;
         }
         else if (timeHour < 22) {   // 7 pm to 9:59 pm
            tollAmount = 3.05;
         }
         else {                      // 10 pm and after
            tollAmount = 1.55;
         }
      }

      // Check for carpool rate (3 or more people) and update toll
      if (numPeople >= 3) {
         // If on a weekday between 6:00 am and 9:59 am, toll is half off
         if ((typeOfDay == 0) && (timeHour >= 6) && (timeHour < 10)) {
            tollAmount = tollAmount * 0.5;
         }
         // Otherwise, the toll is free
         else {
            tollAmount = 0.0;
         }
      }

      // Output toll using am/pm format
      System.out.print("Toll at ");
   
      // Output hour adjusting for am/pm format
      if (timeHour == 0) {
         System.out.print("12:");
      }
      else if (timeHour <= 12) {
         System.out.print(timeHour + ":");
      }
      else {
         System.out.print((timeHour - 12) + ":");
      }
   
      // Output minute with formatting (discussed elsewhere) to
      // print two digits for minutes.
      System.out.print(String.format("%02d", timeMinute));
 
      System.out.println(" is " + tollAmount);
   }   
}
