/*Write the removeEvens() method, which has an array of integers as a parameter and returns a new array of integers containing only the odd numbers 
from the original array. The main program outputs values of the returned array.
Hint: If the original array has even numbers, then the new array will be smaller in length than the original array and should have no blank element.
Ex: If the array passed to the removeEvens() method is [1, 2, 3, 4, 5, 6, 7, 8, 9], then the method returns and the program output is:
[1, 3, 5, 7, 9]
Ex: If the array passed to the removeEvens() method is [1, 9, 3], then the method returns and the program output is:
[1, 9, 3]*/
import java.util.Arrays;
public class Odd {
   
   public int[] removeEvens(int [] nums) {
      /* Type your code here. */
      // first count the number of odd elements in array
        // that will the size of result array

        int size = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]%2 != 0)
                size++;
        }

        int[] result = new int[size];

        // put all the odd numbers into new array, now even numbers will be excluded
        size = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]%2 != 0)
                result[size++] = nums[i];
        }

        return result;
   }
   
   public static void main(String[] args) {
      Odd labObject = new Odd();
      int [] input = {1,2,3,4,5,6,7,8,9};
      int [] result = labObject.removeEvens(input);
      
      // Helper method Arrays.toString() converts int[] to a String
      System.out.println(Arrays.toString(result)); // Should print [1, 3, 5, 7, 9]
   }
}
