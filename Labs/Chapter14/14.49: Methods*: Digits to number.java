/*Given an array of digits (0-9) for a decimal number, write a method that returns a single integer. The 0'th element is the decimal number's one's place. 
If the array's elements are 9, 6, 2, the method returns integer 269.
Hints:
    First do the example conversion by hand to ensure you understand how each digit contributes to the total value of the integer.
    The first digit (at element 0) should be multiplied by 1, the second by 10, the third by 100, etc.
    Declare a variable to keep the total value (initialized with 0), and another to keep the current digit's weight (initialized with 1). 
    For the current digit in the array, multiply by the current weight and add to the total. Then update the weight in preparation for the next iteration.*/
import java.util.Scanner; 

public class LabProgram {
   public static int digitsToNum(int[] digitsList) {
      int i;
      int currWeight = 1;
      int totalNum = 0;
      
      for (i = 0; i < digitsList.length; ++i) {
         totalNum += digitsList[i] * currWeight;
         currWeight *= 10;
      }
      return totalNum;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      
      int userDigit; 
      int[] digitsList = new int[10]; 
      int resultNum; 
      int i = 0;
      
      while(scnr.hasNextInt() && i < digitsList.length) { 
         userDigit = scnr.nextInt();
         digitsList[i] = userDigit; 
         i++; 
      }
      
      resultNum = digitsToNum(digitsList); 
      
      System.out.println(resultNum); 
   }
}


/* NOTES

* The current weight could instead be derived from i, by computing 10^i. We felt our approach was equally intuitive. 

*/ 
