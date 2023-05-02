/*Commas make large integers easier to read. Ex: 145,020 is easier to read than 145020. Write a method that takes an integer, 
and returns a string representation of that number with commas appropriately inserted. If the input if 145020, the method returns string "145,020".
Hints:
    Develop incrementally: Start by just converting the integer to a string, without commas. Then update the program to insert commas.
    This problem is hard. Take your time. Do little by little.
    Write a method to convert a single integer digit to a char called digitToChar(). Then use that method in your method that converts an integer to a string.
    Insert one digit at a time into the string, starting with the one's place. Use % 10 to get the rightmost digit. 
    Use / 10 to shift the number right (discarding the current 1's place).*/
import java.util.Scanner; 

public class LabProgram {
   
   // Given int 0, 1, ..., 9, returns ASCII character '0', '1', ..., '9'.
   public static char digitToChar(int singleDigit) {
      char digitAsChar = '0'; 
      
      // We know 1's ASCII code is 1 more than 0's, 2's is 2 more, etc. So we initialize digitAsChar to 0's ASCII code. 
      // Then we increase by the amount of the digit, so we add 0, 1, 2, etc.
      digitAsChar = (char) (digitAsChar + singleDigit); 
      return digitAsChar;
   }
   
   
   // Assumes a non-negative userNum
   public static String numToStringWithCommas(int userNum) {
      int currNum;
      int currDigit;
      char currDigitAsChar;
      String numAsString = "";
      int posCount;
      
      currNum = userNum;
      posCount = 0; // Every 3, insert a comma
      while (currNum > 0) {
         if (posCount == 3) {
            numAsString = "," + numAsString; 
            posCount = 1; // 1 (not 0), because we're going to add a digit
         }
         else {
            ++posCount;
         }
   
         currDigit = currNum % 10; // Gets the rightmost digit. Ex: 569 % 10 is 9. 
         currDigitAsChar = digitToChar(currDigit); // Ex: 9 becomes character '9'
         numAsString = currDigitAsChar + numAsString; 
         currNum = currNum / 10;  // Shifts the number right one digit. Ex: 569 / 10 is 56. 
      }
      
      if (userNum == 0) {  // 0 is a special case. Above loop never entered. 
         numAsString = Character.toString('0');
      }
      
      return numAsString;
   }
   
   /* NOTES
   
   * This problem is surprisingly hard. As one develops the approach of using % to get each digit, the usefulness of a function
   to convert a digit to a character becomes evident. So one may stop working on the higher level function, to work on this
   lower level function. Once the lower-level function is fully tested, one can return to writing the higher-level function. 
   
   * Converting a digit to a character can be done in various ways. We chose to do integer addition, knowing ASCII codes 
   are integers. An alternative is to just have a large if-else statement: if (num == 0) { c = '0'; } else if ...
   
   * Trying to handle the 0 case with the while loop is hard. We found it easier to just treat it as a special case. 
   
   */ 
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int userNum; 
      
      userNum = scnr.nextInt(); 
      
      System.out.println(numToStringWithCommas(userNum)); 
   }
}
