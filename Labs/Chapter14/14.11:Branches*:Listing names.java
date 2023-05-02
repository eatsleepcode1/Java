/*A university has a web page that displays the instructors for a course, using the following algorithm: If only one instructor exists, 
the instructor's first initial and last name are listed. If two instructors exist, only their last names are listed, separated by /. 
If three exist, only the first two are listed, with "/ …" following the second. If none exist, print "TBD". 
Given six words representing three first and last names (each name a single word; latter names may be "none none"), 
output one line of text listing the instructors' names using the algorithm. If the input is "Ann Jones none none none none", 
the output is "A. Jones". If the input is "Ann Jones Mike Smith Lee Nguyen" then the output is "Jones / Smith / …".
Hints:
    Use an if-else statement with four branches. The first detects the situation of no instructors. The second one instructor. Etc.
    Detect whether an instructor exists by checking if the first name is "none".*/
import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String firstName1, lastName1;
      String firstName2, lastName2;
      String firstName3, lastName3;
      
      // Get instructors' names
      firstName1 = scnr.next();
      lastName1 = scnr.next();
      firstName2= scnr.next();   
      lastName2= scnr.next();
      firstName3= scnr.next();
      lastName3= scnr.next();
      
      // Output names. Detect each possible case (1 name, 2 names, 3 names), handling each differently
      if (firstName1.equals("none")) {      // No names exist
         System.out.println("TBD");
      }
      else if (firstName2.equals("none")) { // 1 name exists. Output first initial and last name.
         System.out.println(firstName1.charAt(0) + ". " + lastName1);
      }
      else if (firstName3.equals("none")) { // 2 names exist. Output last names separated by /
         System.out.println(lastName1 + " / " + lastName2);
      }
      else {                           // 3 names exist. Output first two last names followed by / ...
         System.out.println(lastName1 + " / " + lastName2 + " / ...");
      }
      
   }
}

/* NOTES

* Enumerating different cases using an if-else, and handling each one independently, is a common pattern. 

* Some students might try to combine the 2 name and 3 name cases. That's not unreasonable, but keeping the cases
  separate yields clean structured code that is easy to understand. 

*/ 
