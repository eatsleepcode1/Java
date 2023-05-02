/*Given an integer array containing three integers, rotate the values to the right. Rotate means to shift each item to the item on the right,
with the rightmost item rotating around to become the leftmost item. If initial values of the array are 2 4 6, final values are 6 2 4.
Hints:
    Method return type is void.
    Use a tmp variable in the method (similar to when swapping two variables). 
    Your first assignment statement in the method should be assigning tmp with one of the three parameter's value.
    Be careful not to overwrite a value that you expect to use. The order in which you do the assignments matters */
import java.util.Scanner; 

public class LabProgram {
   public static void rotateRight3(int[] n) { 
      int tmp; 
      tmp = n[2]; 
      n[2] = n[1]; 
      n[1] = n[0]; 
      n[0] = tmp; 
   } 
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int[] nValues = new int[3]; 
      
      nValues[0] = scnr.nextInt(); 
      nValues[1] = scnr.nextInt(); 
      nValues[2] = scnr.nextInt(); 
      
      rotateRight3(nValues); 
      
      System.out.println(nValues[0] + " " + nValues[1] + " " + nValues[2]); 
   }
}

/* NOTES

* This program is a variation on swapping. To swap two variables x and y: tmp = x;  x = y;  y = tmp;  
  Because we're about to overwrite x, we first assign tmp with x. Then we overwrite x with y. To assign y with x, 
  we used the copy of x that was saved in tmp. Rotating is similar: We are going to overwrite n[2], so we save n[2]. 
  Then we do the shifts to the right: n[2] = n[1];  n[1] = n[0];   To assign n[0] with n[2] (the "rotate" part), we use the copy 
  of n[2] we made in tmp. 

* Swapping is common, as is shifting or rotating as above. Learning to keep a temporary copy is an important skill. 

*/ 
