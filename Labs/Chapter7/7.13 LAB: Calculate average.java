/*Complete the calcAverage() method that has an integer array parameter and returns the average value of the elements in the array as a double.
Ex: If the input array is:
1 2 3 4 5
then the returned average will be:
3.0 */
import java.util.*;
import java.util.Arrays;
public class Numbers {
   
   // calcAverage() takes in an int array and returns the average value of elements in the array as a double.
   public double calcAverage(int[] nums) {
      /* Type your code here. */
        // getting the size
        int n = nums.length;
        int total = 0;
        // looping over the array
        for (int i = 0; i < n; i++)
            // finding the sum
            total += nums[i];
        // finding the average
        double avg = (double) total / n;
        // returning the average
        return avg;
   }
   
   public static void main(String[] args) {
      Numbers numObject = new Numbers();
      int [] nums = {1,2,3,4,5};
      System.out.println(numObject.calcAverage(nums)); 
   }
}
