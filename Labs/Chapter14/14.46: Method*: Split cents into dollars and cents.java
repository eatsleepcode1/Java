/*Money is a bit tricky to represent in programs. One naturally wants to use floating-point like 7.52 to represent 7 dollars and 52 cents, 
but many programmers believe that money should be represented as ints because money is counted (versus being measured like temperature). 
One approach is to do all money calculations using cents, represented as an integer, like 752 cents. 
A useful method in such an approach might convert cents into separate dollar and cents values. 
Write a method centsToDollarsCents() whose parameter is given cents and returns an array of integers containing numDollars and numCents, respectively. 
If the first parameter is 752, the array would contain [7, 52].  */
import java.util.Scanner; 

public class LabProgram {
   public static int[] centsToDollarsCents(int userCents) { 
      int[] numDollarsCents = new int[2]; 
      int numDollars; 
      int numCents; 
      
      numDollars = userCents / 100; // Ex: 752 / 100 is 7 (integer division ignores fraction)
      numCents   = userCents % 100; // Ex: 752 % 100 is 52, because 752/100 is 7 remainder 52.
      
      numDollarsCents[0] = numDollars;  
      numDollarsCents[1] = numCents;  
      
      return numDollarsCents; 
   } 
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int userCents; 
      int[] numDollarsCents;
      
      userCents = scnr.nextInt(); 
      
      numDollarsCents = centsToDollarsCents(userCents); 
      
      System.out.println(numDollarsCents[0] + " dollars " + numDollarsCents[1] + " cents"); 
   }
}
