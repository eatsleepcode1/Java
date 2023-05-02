/*Write a method called maxFive() that returns the maximum of five integer parameters. Ex: maxFive(3, 5, 1, 0, 2) returns 5.
Hints:
    Use four if statements. (Don't use if-else).
    Use a variable maxFound to keep track of the largest value seen so far.
    Initialize maxFound to one of the parameters. (Not to 0, which wouldn't handle the case when all parameters are negative).
    Don't forget to return maxFound.*/
import java.util.Scanner; 

public class LabProgram {
    
   public static int maxFive(int a, int b, int c, int d, int e) { 
      int maxFound = a; // Note: Initializing to 0 would be wrongl what if all values are negative? 
      
      if (b > maxFound) { 
         maxFound = b; 
      } 
      if(c > maxFound) { // Common error is using else if, rather than just if.
         maxFound = c; 
      } 
      if(d > maxFound) { 
         maxFound = d; 
      } 
      if(e > maxFound) { 
         maxFound = e; 
      } 
      
      return maxFound; 
   } 
   
   public static void main(String[] args) {
      // Don't modify main's code below
      Scanner scnr = new Scanner(System.in); 
      int v, w, x, y, z;
      int maxVal;
      
      v = scnr.nextInt(); 
      w = scnr.nextInt(); 
      x = scnr.nextInt(); 
      y = scnr.nextInt(); 
      z = scnr.nextInt(); 
      
      maxVal = maxFive(v, w, x, y, z);
      System.out.println(maxVal); 
   }
}

/* NOTES

* Incorrectly initializing maxFound to 0 is a common mistake. Initializing to a large-magnitude negative value is
  sometimes tried but unnecessary. Just initialize to any of the values. 

* That pattern of multiple if statements is common when finding the min or max of a small set of values. 

*/ 
