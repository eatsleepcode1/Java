/*Websites commonly require a password that satisfies several requirements. Write a program that checks if an input string satisfies the following 
(error message is shown for each):
    At least 8 characters (Too short)
    At least one letter (Missing letter)
    At least one number (Missing number)
    At least one of these special characters: !, #, % (Missing special)
Output OK, or all related error messages (in above order). If the input string is "Hello", the output is:
Too short
Missing number
Missing special
Hints:
    Declare a boolean variable for each requirement.
    Use a for loop to visit each character, setting the corresponding boolean to true if satisfied (length is done differently though).
    Use the functions Character.isLetter() and Character.isDigit() to detect if a character is a letter or a number.*/
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText; 
      int i;
      char c; // Improves code readability in expressions below
      boolean lengthOK = false;
      boolean hasLetter = false;
      boolean hasNumber = false;
      boolean hasSpecial = false; 
      
      userText = scnr.nextLine();
      
      if (userText.length() >= 8) {
         lengthOK = true;
      }
      
      for (i = 0; i < userText.length(); ++i) {
         c = userText.charAt(i);
         
         if (Character.isLetter(c)) {  // At least one letter found
            hasLetter = true;
         }
         else if (Character.isDigit(c)) { // At least one number found
            hasNumber = true;
         }
         else if ( (c == '!') || (c == '#') || (c == '%') ) {
            hasSpecial = true;
         }
      }
         
      if (lengthOK && hasLetter && hasNumber && hasSpecial) { // All requirements met
         System.out.println("OK");
      }
      else {
         if (!lengthOK) {
            System.out.println("Too short");
         }
         if (!hasLetter) {
            System.out.println("Missing letter");
         }
         if (!hasNumber) {
            System.out.println("Missing number");
         }
         if (!hasSpecial) {
            System.out.println("Missing special");
         }
      }
   
   return;
   }
}


/* NOTES

* Using boolean variables makes the code a lot easier to read than some other approaches. 

* A common mistake is to set each boolean as hasLetter = Character.isLetter(c). That statement will keep changing hasLetter's value 
  based on each character, with the final value being for the last character. Instead, only one letter must exist, 
  so once true, this value should never be set back to false. The if statement accomplishes that. 
  
* The ending if-else checks if all requirements are met (outputting OK if so). If not all are met, then the else 
  part has a nested series of if statements, in order to print every failed requirement. A common mistake is to 
  use a nested if-else, which would only print one failed requirement. 
  
* Inside the for loop, an if-else was used because a character can only be one of those things. But a series of
  if statements would have worked as well (for the same reason; only one could have a true expression). 
  
* Be careful to use && and not &, and || and not |. (& and | are for bitwise and/or, not logical and/or). 

* Don't do this: if (lengthOK == false). When using boolean variables, good practice in logical expressions is to just
  list the boolean variable, either in true (lengthOK) or complemented (!lengthOK) form. The expressions are more
  concise and easier to comprehend. 
  
* The character c was introduced to make the expressions concise and easy-to-read. Normally variables should have 
  meaningful names (and some say at least two words as well, like userText). Exceptions include loop indices like i, 
  coordinates like x and y, and in this case a single character in a string like c. 
  
*/
