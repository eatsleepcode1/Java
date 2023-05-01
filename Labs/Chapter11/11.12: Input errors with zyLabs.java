/*Write a program that takes in three integers as inputs and outputs the largest value. Use a try block to perform all the statements. 
Use a catch block to catch any NoSuchElementException caused by missing inputs. Then output the number of inputs read and the largest value, or 
output "No max" if no inputs are read.
Note: Because inputs are pre-entered when running a program in the zyLabs environment, the system throws the NoSuchElementException when inputs are missing. 
Test the program by running the program in the Develop mode.
Hint: Use a counter to keep track of the number of inputs read and compare the inputs accordingly in the catch block when an exception is caught.
Ex: If the input is:
3 7 5
the output is:
7
Ex: If the input is:
3
the system throws the NoSuchElementException and outputs:
1 input(s) read:
Max is 3
Ex: If no inputs are entered:
the system throws the NoSuchElementException and outputs:
0 input(s) read:
No max*/
import java.util.Scanner;
import java.util.NoSuchElementException;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int val1;
      int val2;
      int val3;
      int max;
      
      val1 = 0;
      val2 = 0;
      val3 = 0;
      
      /* Type your code here. */
      max = 0;
      int counter = 0;
      
      try
      {
         val1 = scnr.nextInt();
         counter++;
         val2 = scnr.nextInt();
         counter++;
         val3 = scnr.nextInt();
         counter++;
         
         max =  Math.max(Math.max(val1,val2),val3);
          
         System.out.println(max);
      }
      catch(NoSuchElementException e)
      {
         
          max = Math.max(Math.max(val1,val2),val3);
          
    	  if (counter == 0)
    	  {
              System.out.println(counter + " input(s) read:");
        	  System.out.println("No max");
    	  }
    	  else
    	  {
              System.out.println(counter + " input(s) read:");
        	  System.out.println("Max is " + max);
    	  }

      }
      
   }
}
