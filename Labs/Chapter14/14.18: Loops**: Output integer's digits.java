/*Given an input positive integer, output each digit on its own line, starting with the rightmost digit. Ex: If the input is 935, the output is:
5
3
9
Hints:
    Use the mod operator (%) to get the rightmost digit.
    Mod by 10 to get the rightmost digit.
    Use a loop that keeps a current dividend (the number being divided). In each iteration, output the rightmost digit, 
    then update the divisor by dividing by 10.
    End the loop when the divisor is 0.*/
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInt; 
      int divisor; 
         
      userInt = scnr.nextInt();
      
      divisor = userInt; 
      while (divisor != 0) {
         System.out.println(divisor % 10); // Outputs rightmost digit
         divisor = divisor / 10; // Shifts the integer right by one digit
      }

   }
}

/* NOTES

* Using % 10 is a common way to get the rightmost digit's value. Ex: 532 % 10 is 2 (the quotient is 53, remainder 2). 

* Using / 10 is a common way to shift a decimal value to the right by one digit. Ex: 532 / 10 is 53. Note that integer
  division drops any fractional part, so the result is 53, not 53.2. 

*/
