/*The ArrayList's get() method returns the element at the specified list location, and can be used to lookup the Nth item in a list. 
The program below allows a user to print the name of the Nth most popular operating system. The program accesses the Nth most popular operating 
system using operatingSystems.get(nthOS - 1);. Note that the index is nthOS - 1 rather than just nthOS because an ArrayList's indices start at 0, 
so the 1st operating system is at index 0, the 2nd at index 1, etc.
An ArrayList's index must be an integer type. The index cannot be a floating-point type, even if the value is 0.0, 1.0, etc. */
import java.util.ArrayList;
import java.util.Scanner;

public class MostPopularOS {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> operatingSystems = new ArrayList<String>(); 
      int nthOS;      // User input, Nth most popular OS
      
      // Source: StatCounter.com, 2018
      operatingSystems.add("Windows 10");
      operatingSystems.add("Windows 7");
      operatingSystems.add("Mac OS X");
      operatingSystems.add("Windows 8");
      operatingSystems.add("Windows XP");
      operatingSystems.add("Linux");
      operatingSystems.add("Chrome OS");
      operatingSystems.add("Other");

      System.out.println("Enter N (1-8): ");
      nthOS = scnr.nextInt();

      if ((nthOS >= 1) && (nthOS <= 8)) {
         System.out.print("The " + getNumberSuffix(nthOS) + " most popular OS is ");
         System.out.println(operatingSystems.get(nthOS - 1));
      }
   }

   private static String getNumberSuffix(int number) {
      String[] firstThree = { "st", "nd", "rd" };
      if (number >= 1 && number <= 3) {
         return number + firstThree[number - 1];
      }
      return number + "th";
   }
}
