//Level 1
/*A while loop reads integers from input. Write an expression that executes the while loop until an integer read from input is greater than or equal to 0.
Ex: If the input is -5 -10 -32 -22 43, then the output is:
Input is -5
Input is -10
Input is -32
Input is -22
Done */
import java.util.Scanner;

public class InputReader {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int value;
   
      value = scnr.nextInt();
   
      while (/* Your code goes here */value < 0) {
         System.out.println("Input is " + value);
         value = scnr.nextInt();
      }
      
      System.out.println("Done"); 
   }
}
/*A while loop reads characters from input. Write an expression that executes the while loop until character 'e' is read.

Ex: If the input is v D e, then the output is:

User entered v
User entered D
Loop terminated */
import java.util.Scanner;

public class InputReader {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char value;
   
      value = scnr.next().charAt(0);
   
      while (/* Your code goes here */value != 'e') {
         System.out.println("User entered " + value);
         value = scnr.next().charAt(0);
      }
      
      System.out.println("Loop terminated"); 
   }
}
//Level 2
/*Integer userNum is read from input. Write a while loop that reads integers from input until an integer that is greater than or equal to 10 is read. 
Then, find the sum of all integers read. The integer greater than or equal to 10 should not be included in the sum.
Ex: If the input is -14 1 -49 -42 18, then the output is:
-104 */
import java.util.Scanner;

public class SumCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
		int sum;while

		sum = 0;
		userNum = scnr.nextInt();

      /* Your code goes here */
      while(userNum < 10){
         sum = sum + userNum;
         userNum = scnr.nextInt();
         }
   	System.out.println(sum);
	}
}
/*Integer userNumber is read from input. Write a while loop that reads integers from input until a negative integer is read. 
Then, find the sum of all integers read. The negative integer should not be included in the sum.
Ex: If the input is 29 35 31 41 -4, then the output is:
136 */
public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNumber;
		int result;

		result = 0;
		userNumber = scnr.nextInt();

      /* Your code goes here */
      while(userNumber >= 0){
         result = result + userNumber;
         userNumber = scnr.nextInt();
         }

   	System.out.println(result);
	}
}
/*Integer numInput is read from input. Write a while loop that adds 3 to numInput, updating numInput with the sum, 
and outputs the updated numInput, followed by a newline. The loop iterates until numInput is greater than or equal to 12.
Ex: If the input is 2, then the output is:
5
8
11
14 */
import java.util.Scanner;

public class SumCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numInput;

		numInput = scnr.nextInt();

      /* Your code goes here */
      while(numInput < 12){
         numInput = numInput + 3;
         System.out.println(numInput);
         }
   }
}
/*Character userInput is read from input. Write a while loop that reads characters from input until character 'q' is read. 
Then, count the total number of characters read. Character 'q' should not be included in the count.
Ex: If the input is E T q, then the output is:
2 */
import java.util.Scanner;

public class CountCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char userInput;
		int result;

		result = 0;
		userInput = scnr.next().charAt(0);

      /* Your code goes here */
      int total = 0;
      while(userInput != 'q'){
         result = total++;
         result = result + 1;
         userInput = scnr.next().charAt(0);
         }
   	System.out.println(result);
	}
}
//Level 3
/*Integer valueIn is read from input. Write a while loop that iterates until valueIn is negative. At each iteration:
Update integer finalNum as follows:
If valueIn is not divisible by 5, output "miss" and do not update finalNum.
Otherwise, output "hit" and increment finalNum.
Then, read an integer from input into variable valueIn.
End each output with a newline.
Ex: If the input is 15 10 6 -1, then the output is:
hit
hit
miss
Final number is 2
Note: x % 5 == 0 returns true if x is divisible by 5. */
import java.util.Scanner;

public class ResultCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int valueIn;
      int finalNum;
   
      finalNum = 0;
      valueIn = scnr.nextInt();
   
      /* Your code goes here */
      while(valueIn >= 0){
         if(valueIn % 5 != 0){
            System.out.println("miss");
            }
         else{
            finalNum++;
            System.out.println("hit");
            }
         valueIn = scnr.nextInt();
         }
   
      System.out.println("Final number is " + finalNum);
   }
}
/*Integer userNum is read from input. Write a while loop that iterates until userNum is negative. At each iteration:
Update integer result as follows:
If userNum is even, add userNum to result.
Otherwise, subtract userNum from result.
Then, read an integer from input into variable userNum.
Ex: If the input is 6 3 4 -4, then the output is:
Result is 7
Note: x % 2 == 0 returns true if x is even. */
import java.util.Scanner;

public class ResultCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int result;
   
      result = 0;
      userNum = scnr.nextInt();
   
      /* Your code goes here */
      while(userNum >= 0){
         if(userNum % 2 == 0){
            result = result + userNum;
            }
         else{
            result = result - userNum;
            }
         userNum = scnr.nextInt();
         }
   
      System.out.println("Result is " + result);
   }
}
/*Integer userInput is read from input. Write a while loop that iterates until userInput is negative. At each iteration:
Update integer result as follows:
If userInput is not divisible by 4, output "lose" and do not update result.
Otherwise, output "win" and increment result.
Then, read an integer from input into variable userInput.
End each output with a newline.
Ex: If the input is 8 4 13 -5, then the output is:
win
win
lose
Result is 2
Note: x % 4 == 0 returns true if x is divisible by 4. */
import java.util.Scanner;

public class ResultCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInput;
      int result;
   
      result = 0;
      userInput = scnr.nextInt();
   
      /* Your code goes here */
      while(userInput >= 0){
         if(userInput % 4 != 0){
            System.out.println("lose");
            }
         else{
            result++;
            System.out.println("win");
            }
         userInput = scnr.nextInt();
         }
   
      System.out.println("Result is " + result);
   }
}
