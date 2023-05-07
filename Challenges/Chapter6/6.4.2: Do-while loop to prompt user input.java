/*Write a do-while loop that continues to prompt a user to enter a number less than 100, until the entered number is actually less than 100. 
End each prompt with newline Ex: For the user input 123, 395, 25, the expected output is:
Enter a number (<100): 
Enter a number (<100): 
Enter a number (<100): 
Your number < 100 is: 25 */
import java.util.Scanner;

public class NumberPrompt {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userInput;

      /* Your solution goes here  */
     do {
           System.out.println("Enter a number (<100): ");
           userInput = scnr.nextInt();
       }
       while(userInput > 100);
     
      System.out.println("Your number < 100 is: " + userInput);
   }
}
