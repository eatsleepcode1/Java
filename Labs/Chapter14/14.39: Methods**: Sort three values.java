/*Write a method ascend3() with an array of integers of size three as the parameter, that sorts the values of the array into ascending order. 
Ex: If the array contains [5, 2, 7], after the call ascend3(int[] vals), the array will now hold [2, 5, 7].
Hints:
    Return type should be void.
    One approach puts the three values into an array, then sorts the array. We won't be describing that approach here. Instead, we'll use branches.
    One solution approach realizes that only 6 possible orderings of xyz exist: xyz, xzy, yxz, yzx, zxy, zyx. 
    An if-else can be used to detect which order x, y, z are initially in.
    Once detected, three variables lowVal, midVal, and highVal can be assigned. 
    Note: Don't assign the parameter right away, because you'll overwrite a value that is still needed.
    After the if-else, those lowVal, midVal, and highVal variables are ready. So just set the vals[0] with lowVal, vals[1] with midVal, 
    and vals[2] with highVal.
    Be aware that two values could be equal. So use <= rather than < in your comparisons. */
import java.util.Scanner; 

public class LabProgram {
   public static void ascend3(int[] vals) { 
      int lowVal, midVal, highVal; 
      int a, b, c; 
      
      lowVal = 0; midVal = 0; highVal = 0; 
      
      a = vals[0]; 
      b = vals[1]; 
      c = vals[2]; 
      
      // 6 possible orderings of a, b, c exist. abc, acb, bac, bca, cab, cba. 
      // Determine current ordering, then update to be ascending
   
      if ((a <= b) && (b <= c)) {
         lowVal = a;
         midVal = b;
         highVal = c;
      }
      else if ((a <= c) && (c <= b)) {
         lowVal = a;
         midVal = c;
         highVal = b;
      }
      else if ((b <= a) && (a <= c)) {
         lowVal = b;
         midVal = a;
         highVal = c;
      }
      else if ((b <= c) && (c <= a)) {
         lowVal = b;
         midVal = c;
         highVal = a;
      }
      else if ((c <= a) && (a <= b)) {
         lowVal = c;
         midVal = a;
         highVal = b;
      }
      else if ((c <= b) && (b <= a)) {
         lowVal = c;
         midVal = b;
         highVal = a;
      } 
      
      vals[0] = lowVal;
      vals[1] = midVal;
      vals[2] = highVal;
   } 
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int[] arrVals = new int[3]; 
      
      arrVals[0] = scnr.nextInt(); // x
      arrVals[1] = scnr.nextInt(); // y
      arrVals[2] = scnr.nextInt(); // z
      
      ascend3(arrVals); 
      
      System.out.println(arrVals[0] + " " + arrVals[1] + " " + arrVals[2]); 
   }
}


/* NOTES

* Being able to "enumerate" orderings (known as "permutations") is an important programming skill

* The above if-else approach works for 3 items because the number of permutations is only 6. But 4 items have
  24 permutations, so the if-else approach yields too complex of code beyond 3 items. 
  
* A common mistake is to update the reference parameters right away instead of using local variables. Such an update
  is like trying to swap x and y using two statements: x = y;  y = x;  The first assignment overwrite x's value, so 
  the second assignment is then just assigning y with y. 
  
* A more general way to sort items is to put them in an array and then use a "sorting algorithm".

* Here is another solution that shows using nested if-else statements 
  (in a different language but the statement structure should be clear): 
  http://www.cs.mtu.edu/~shene/COURSES/cs201/NOTES/chap03/sort.html

*/
