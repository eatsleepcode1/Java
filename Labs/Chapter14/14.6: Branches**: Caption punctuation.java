/*A user is asked to type a caption for a photo in a web form's text field. If the caption didn't end with a punctuation mark (. ! ?), 
a period should automatically be added. A common error is to end with a comma, which should be replaced by a period. 
Another common error is to end with two periods, which should be changed to one period (however, ending with three periods (or more) indicates elipses 
so should be kept as is). The corrected caption is output.
If the input is "I like pie", the output is "I like pie." If the input is "I like pie!", 
the output remains "I like pie!" If the input is "Coming soon…", the output remains "Coming soon…"
Hints:
    Start by checking for ! or ? which don't require any action.
    Then check for , which requires the simple action of replacing by a period.
    Then check for two ending periods (making sure the caption is at least 2 characters long). If found, check for three ending periods 
    (making sure caption is at least 3 characters long), in which case no action required. Otherwise, remove the last period.
    Use substring() to remove the last period.*/
import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userCaption;
      int lastIndex;
      char lastChar;
      
      userCaption = scnr.nextLine();
      
      lastIndex = userCaption.length() - 1; 
      lastChar = userCaption.charAt(lastIndex);
      
      if ((lastChar == '!') || (lastChar == '?')) { 
         // Caption OK; do nothing
      }
      else if (lastChar == ',') {
         userCaption = userCaption.substring(0, lastIndex) + "."; // Replace ending , (common mistake) by .
      }
      else if (lastChar != '.') { // Not ! ? , . so append .
         userCaption = userCaption + ".";
      }
      else if ((lastIndex > 0) && (lastChar == '.') && (userCaption.charAt(lastIndex - 1) == '.')) { // Two periods
         // Three periods? 
         if ((lastIndex > 1) && (userCaption.charAt(lastIndex - 2) == '.')) {
            // Caption OK (ends with elipses ...  Do nothing
         }
         else { // Ends with two periods; remove one
            userCaption = userCaption.substring(0, userCaption.length() - 1);
         }
      }
   
      System.out.println(userCaption);

   }
}

/* NOTES

* Careful arrangement of the if-else simplifies the coding.

* When accessing string elements, always make sure the element exists. Hence the checks for lastIndex > 0 and > 1. 

* This kind of form entry correction is common.

* lastChar and lastIndex variables aren't necessary but make the code more readable.

*/
