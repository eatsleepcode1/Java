/*Write a method activityCalories that takes a string indicating an activity (sit, walk, jog, bike, swim) and duration in minutes (integer), 
and returns the estimated calories expended (double). Calories per minute for a 150 lb person (source):
sit: 1.4 walk: 5.4 run: 13.0 bike: 6.8 swim: 8.7
If the input is sit 2, the output is
2.8  
Hints:
    Use an if-else statement to determine the calories per minute for the given activity.
    Return the calories per minute times the minutes spent.*/
import java.util.Scanner; 

/* https://whatscookingamerica.net/Information/CalorieBurnChart.htm 
Sit: 1.4
Walk: 5.4
Run: 13.0
Bike: 6.8
Swim: 8.7
*/ 
public class LabProgram {
   
   /* Write your method here */ 
   public static double activityCalories(String activityDone, int minutesSpent) { 
      double caloriesPerMinute; 
      
      if (activityDone.equals("sit")) {
         caloriesPerMinute = 1.4;
      }
      else if (activityDone.equals("walk")) {
         caloriesPerMinute = 5.4;
      }
      else if (activityDone.equals("run")) {
         caloriesPerMinute = 13.0;
      }
      else if (activityDone.equals("bike")) {
         caloriesPerMinute = 6.8;
      }
      else if (activityDone.equals("swim")) {
         caloriesPerMinute = 8.7;
      }
      else { // Unrecognized
         caloriesPerMinute = 0.0;
      }
   
      return caloriesPerMinute * minutesSpent;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int userMinutes; 
      String userActivity; 
      
      userActivity = scnr.next(); 
      userMinutes = scnr.nextInt(); 
            
      System.out.println(activityCalories(userActivity, userMinutes)); 
   }
}

/* NOTES

* Setting a variable's value based on an input parameter (activity) and then using that
  value later is a common pattern.

* Returning from within the if-else statement is often considered bad practice. Better to set a variable 
  (calories per minute), and then calculate and return once at the end.
  
* Such an if-else statement should almost always have an "else" part to catch unrecognized inputs. Otherwise, 
  the function's behavior may be unpredictable. 

*/ 
