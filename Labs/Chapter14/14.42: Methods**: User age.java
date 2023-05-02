/*Various websites like Wikipedia or IMDB list not just a person's birthdate but also the person's current age. 
Given a person's birthdate and current date, output the person's age in years. Write a method that, given a person's birthdate and current date, 
returns the person's age in years. The custom is to round down. If the input is 7 1 2000 2 15 2015, the output is 14 
(because the person hasn't yet reached their 15th birthday). A person less than 1 has age 0.
Hints:
    Start by computing currAge just as the difference in years. Then, use an if-else statement to determine whether to decrement currAge.
    One reason to decrement is if the current month is less than the birth month (no birthday yet this year).
    Another reason to decrement is if the current month equals the birth month, but the current day is less than the birth day.*/
import java.util.Scanner; 

public class LabProgram {
   public static int getAge(int birthMonth, int birthDay, int birthYear, int currMonth, int currDay, int currYear) { 
      int currAge;
   
      currAge = currYear - birthYear; 
      // Determine if need to reduce by 1 if birthday not yet reached
      if (currMonth < birthMonth) { // Birth month not yet reached, reduce by 1
         currAge = currAge - 1;
      }
      else if (currMonth == birthMonth) {
         if (currDay < birthDay) { // In birth month, but birthday not yet reached
            currAge = currAge - 1;
         }
      }
      
      return currAge;
   } 
   
   /* NOTES

   * The program display a common pattern of first performing a simple calculation, and then adjusting for special cases. 
     Here, the initial calculation just subtracts years. Then, two cases are listed that indicate that the birth date hasn't
     been reached yet, both requiring decrementing by 1.
     
   * A mistake would be for the else condition to just be currDay < birthDay. That condition only matters if the current
     month and birth month are equal. If the relation is <, or >, the current and birth days don't matter. 
   
   */ 
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int birthMonth, birthDay, birthYear; 
      int currMonth, currDay, currYear; 
      
      birthMonth = scnr.nextInt(); birthDay = scnr.nextInt(); birthYear = scnr.nextInt(); 
      currMonth = scnr.nextInt(); currDay = scnr.nextInt(); currYear = scnr.nextInt(); 
      
      System.out.println(getAge(birthMonth, birthDay, birthYear, currMonth, currDay, currYear)); 
   }
}
