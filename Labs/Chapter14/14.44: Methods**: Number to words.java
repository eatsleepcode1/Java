/*Sometimes numbers are converted to words, like in a wedding invitation. 
So 23 becomes "twenty three". Write a method digitToWord() that takes a single digit number from 0-9 and returns that 
number's word: 0 is zero, 1 is one, 2 is two, etc (if the number is outside 0-9, return "error"). 
Write another method tensDigitToWord() that takes a single digit number from 2-9, and returns that number's word 
when it appears in the tens digit: 2 is twenty, 3 is thirty, etc. If the number is outside 2-9, return "error". 
Finally, write a method twoDigitNumToWords() that takes a two-digit number from 20-99 and returns that number in words. 
Your main program should get a user's integer, call twoDigitNumToWords(), and output the resulting string. If the input is 23, 
the output should be "twenty three".
Do not do any error checking of the input. Note that your program does not support all numbers. 0-19 will yield error output, for example.
HINTS:
    Write digitToWord() first, and test the method (have your main call that method directly) -- you won't pass any of the tests, 
    but you should still start that way. Next, write tensDigitToWord() and test it by itself also. Finally, write twoDigitNumToWords() 
    (calling your first two methods) and test the entire program.
    Your twoDigitNumToWords() method should pass the ten's digit to tensDigitToWord(). To get the tens digit, divide the number by 10.
    Your twoDigitNumToWords() method should pass the one's digit to digitToWord(). To get the ones digit, mod the number by 10 (num % 10).
    You can concatenate the strings returned by those two methods using the + operator. Ex: "hello" + " " + "there" yields one string "hello there".*/
import java.util.Scanner; 

public class LabProgram {
   public static String digitToWord(int digitIn) { 
      String wordOut;
   
      if (digitIn == 0) {
         wordOut = "";
      }
      else if (digitIn == 1) {
         wordOut = "one";
      }
      else if (digitIn == 2) {
         wordOut = "two";
      }
      else if (digitIn == 3) {
         wordOut = "three";
      }
      else if (digitIn == 4) {
         wordOut = "four";
      }
      else if (digitIn == 5) {
         wordOut = "five";
      }
      else if (digitIn == 6) {
         wordOut = "six";
      }
      else if (digitIn == 7) {
         wordOut = "seven";
      }
      else if (digitIn == 8) {
         wordOut = "eight";
      }
      else if (digitIn == 9) {
         wordOut = "nine";
      }
      else {
         wordOut = "error";
      }
      return wordOut; 
      
   } 
   
   public static String tensDigitToWord(int digitIn) { 
      String wordOut;
   
      if (digitIn == 0) {
         wordOut = "error";
      }
      else if (digitIn == 1) {
         wordOut = "error";
      }
      else if (digitIn == 2) {
         wordOut = "twenty";
      }
      else if (digitIn == 3) {
         wordOut = "thirty";
      }
      else if (digitIn == 4) {
         wordOut = "forty";
      }
      else if (digitIn == 5) {
         wordOut = "fifty";
      }
      else if (digitIn == 6) {
         wordOut = "sixty";
      }
      else if (digitIn == 7) {
         wordOut = "seventy";
      }
      else if (digitIn == 8) {
         wordOut = "eighty";
      }
      else if (digitIn == 9) {
         wordOut = "ninety";
      }
      else {
         wordOut = "error";
      }
      return wordOut; 
   } 
   
   public static String twoDigitNumToWords(int numIn) { 
      int    tensDigit;
      int    onesDigit;
      
      // Assumes numIn is 20-99. No error checking performed. 
      
      onesDigit = numIn % 10;  // Ex: 45 % 10 is 5, because 45/10 is 4 with remainder 5.
      tensDigit = numIn / 10;  // Ex: 45 / 10 is 4 (integer division ignores the fraction)
      
      return tensDigitToWord(tensDigit) + " " + digitToWord(onesDigit);
   } 
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int userNum; 
      
      userNum = scnr.nextInt(); 
      
      System.out.println(twoDigitNumToWords(userNum)); 
      
   }
}

/* NOTES

* The first two functions could have returned the string in each branch. But generally, good practice is to only have
  one return statement, at the end of the function. That's not always reasonable, but was easy to accomplish here
  using a variable (wordOut). 
  
* This program only supports 20-99. Supporting 0-9 would involve a simple check in TwoDigitNumToWords, then just call
  DigitToWord. Supporting 10-19 would involve another function called from TwoDigitNumToWords since those values 
  are all special cases using one word for the two digits. 
  
* Breaking a problem down into small pieces is common in programming. Here, the problem of output a two-digit number
  was broken down into smaller problems: Converting a one's digit to a word, converting a ten's digit to a word, and
  combining those words. 
  
* This program does no checking to ensure the entered number is within a support range. A better program would
  certainly do such checking, returning an error message. 

*/ 
