/*Define a method named sortArray that takes an array of integers and the number of elements in the array as parameters. 
Method sortArray() modifies the array parameter by sorting the elements in descending order (highest to lowest). 
Then write a main program that reads a list of integers from input, stores the integers in an array, calls sortArray(), and outputs the sorted array. 
The first input integer indicates how many numbers are in the list. Assume that the list will always contain less than 20 integers.
Ex: If the input is:
5 10 4 39 12 2
the output is:
39,12,10,4,2,
For coding simplicity, follow every output value by a comma, including the last one.
Your program must define and call the following method:
public static void sortArray(int[] myArr, int arrSize)
Hint: Sorting an array can be done in many ways. You are welcome to look up and use any existing algorithm. 
Some believe the simplest to code is bubble sort: https://en.wikipedia.org/wiki/Bubble_sort. 
But you are welcome to try others: https://en.wikipedia.org/wiki/Sorting_algorithm.*/
import java.util.Scanner;

public class LabProgram {

   public static int[] sortArray(int[] myArr, int arrSize) {
      boolean swapped = true;
      int j = 0;
      int temp;
      
      while (swapped) {
         swapped = false;
         j++;
         for (int i = 0; i < arrSize - j; i++) {
            if (myArr[i] < myArr[i + 1]) {
               temp = myArr[i];
               myArr[i] = myArr[i + 1];
               myArr[i + 1] = temp;
               swapped = true;
            }
         }
      }
      
      return myArr;
   }

   public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
      int[] myArr = new int[20];
      int arrSize = scnr.nextInt();
      
      for (int i = 0; i < arrSize; ++i) {
         myArr[i] = scnr.nextInt();
      }
      
      myArr = sortArray(myArr, arrSize);
      
      for (int i = 0; i < arrSize; ++i) {
         System.out.print(myArr[i] + ",");
      }
      
      System.out.println("");
   }
}
