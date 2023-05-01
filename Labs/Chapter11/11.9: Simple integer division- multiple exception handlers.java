/*Write a program that reads integers userNum and divNum as input, and output the quotient (userNum divided by divNum). 
Use a try block to perform the statements. Use a catch block to catch any ArithmeticException and output an exception message with the getMessage() method. 
Use another catch block to catch any InputMismatchException and output an exception message with the toString() method.
Note: ArithmeticException is thrown when a division by zero happens. 
InputMismatchException is thrown when a user enters a value of different data type than what is defined in the program. 
Do not include code to throw any exception in the program.
Ex: If the input of the program is:
15 3
the output of the program is:
5
Ex: If the input of the program is:
10 0
the output of the program is:
Arithmetic Exception: / by zero
Ex: If the input of the program is:
15.5 5
the output of the program is:
Input Mismatch Exception: java.util.InputMismatchException*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      //This is try block
 try {
  //This is optional, if you want you can comment this line
  //System.out.println("Enter userNum & divNum :: ");
  
  //It will take user input
  int userNum = scnr.nextInt();
  int divNum = scnr.nextInt();

  //divide the userNum to divNum
  int quotient = userNum / divNum;

  //display quotient on console window
  System.out.println(quotient);
 } // try
 catch (ArithmeticException ae) {
  System.out.println("Arithmetic Exception: " + ae.getMessage());
 } // catch
 catch (InputMismatchException ime) {
  System.out.println("Input Mismatch Exception: " + ime.toString());
 } // catch
   }
}
