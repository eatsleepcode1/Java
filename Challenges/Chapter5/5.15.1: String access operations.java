//Level 1
/*Given string userText on one line and character userChar on a second line, output "Fourth letter matches" if the fourth character 
of userText matches userChar. Otherwise, output "Fourth letter does not match". End with a newline.
Ex: If the input is:
quart
r
then the output is:
Fourth letter matches
Note: Assume the length of string userText is greater than or equal to 4. */
import java.util.Scanner;

public class CharMatch {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText;
		char userChar;

      userText = scnr.nextLine();
		userChar = scnr.next().charAt(0);
      
      /* Your code goes here */
      if(userText.charAt(3) == userChar){
         System.out.println("Fourth letter matches");
         }
      else{
         System.out.println("Fourth letter does not match");
         }
   }
}
//Level 2
/*Given string strInput1 on one line and string strInput2 on a second line, assign maxSize with the length of the longer string.
Ex: If the input is:
ornament
dark
then the output is:
8 */
import java.util.Scanner;

public class StringLength {
   public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
     String strInput1;
		 String strInput2;
		 int maxSize;
   
      strInput1 = scnr.nextLine();
		strInput2 = scnr.nextLine();

      /* Your code goes here */
      if(strInput1.length() > strInput2.length()){
         maxSize = strInput1.length();
         }
      else{
         maxSize = strInput2.length();
         }
     
		System.out.println(maxSize);
   }
}
//Level 2
/*Given string strInput, output "Valid length" if the string's length is less than 6. Otherwise, output "Not short enough". End with a newline.
Ex: If the input is:
candles
then the output is:
Not short enough */
import java.util.Scanner;

public class StringLength {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String strInput;
   
      strInput = scnr.nextLine();

      /* Your code goes here */
      if (strInput.length() < 6){
         System.out.println("Valid length");
         }
      else{
         System.out.println("Not short enough");
         }
   }
}
//Level 3
/*Given string userGreeting on one line and string personName on a second line, append a space to userGreeting. Then, append personName to userGreeting. 
Lastly, append a period to userGreeting.
Ex: If the input is:
My name is
Fay
then the output is:
My name is Fay. */
import java.util.Scanner;

public class AppendString {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userGreeting;
      String personName;
      
      userGreeting = scnr.nextLine();
      personName = scnr.nextLine();

      /* Your code goes here */
      userGreeting = userGreeting.concat(" ");
      userGreeting = userGreeting + "" + personName + ".";
      
      System.out.println(userGreeting);
   }
}
//Level 3
/*Given string birthLocation on one line and string userState on a second line, append a comma and a space to birthLocation. 
Then, append userState to birthLocation.
Ex: If the input is:
Raleigh
North Carolina
then the output is:
Raleigh, North Carolina */
import java.util.Scanner;

public class ConcatenateString {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String birthLocation;
      String userState;
      
      birthLocation = scnr.nextLine();
      userState = scnr.nextLine();

      /* Your code goes here */
      birthLocation = birthLocation.concat(",");
      birthLocation = birthLocation + " " + userState;
     
      System.out.println(birthLocation);
   }
}
