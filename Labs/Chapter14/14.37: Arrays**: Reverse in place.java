/*Reversing an array is a common task. One approach copies to a second array in reverse, then copies the second array back to the first. 
However, to save space, reversing an array without using a second array is sometimes preferable. Write a function that reads in an integer
representing the length of the array. Then read in and reverse the given array, without using a second array. 
If the original array's values are 2 5 9 7, the array after reversing is 7 9 5 2.
Hints:
    Use this approach: Swap the first and last elements, then swap the second and second-to-last elements, etc.
    Stop when you reach the middle; else, you'll reverse the vector twice, ending with the original order.
    Think about the case when the number of elements is even, and when odd. Make sure your code handles both cases. */
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int currNum;
      int i; 
      int tmp;
      int listLength;
      
      listLength = scnr.nextInt();
      
      int[] listNums = new int[listLength];
      
      for(i = 0; i < listLength; i++){
         currNum = scnr.nextInt();
         listNums[i] = currNum;
      }
      
      // Reverse listNums in place. 
      for(i = 0; i < (listLength / 2); ++i){
         // Swap item from first half with item from second half
         tmp = listNums[i];
         listNums[i] = listNums[listLength - i - 1];
         listNums[listLength - i - 1] = tmp;
      }
      
      
      for (i = 0; i < listLength; ++i) {
         System.out.print(listNums[i] + " ");
      }
      System.out.println();
   }
}

/* NOTES

* A common mistake is to iterate from i = 0 to i < listLength. That will reverse the list twice. 

* Another common mistake is to swap with listNums[listLength - i]. That will access an invalid element.
Ex: If list size is 4, the last element is 3, but the above will initially access element 4 - 0 = 4. Hence the - 1. 

* Knowing how to swap two variables or two vector elements is a very important skill. 

*/
