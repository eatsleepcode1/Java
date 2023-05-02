/*A list of 6 integers is input into ArrayList listInts. Complete the program to copy only the negative integers to a new ArrayList listNegInts.
Output the number of negative elements, and the negatives list. Ex: For input 5 -2 0 9 -66 -4, output is:
3
-2
-66
-4
Hints:
    When declaring listNegInts, don't specify a size. Instead, add elements using listNegInts.add(…)
    Write a first for loop that copies only the negative integers to listNegInts, then write a second for loop that outputs.
    Your copying for loop should have an if statement that only copies the current listInts element if negative.
    The number of items in listNegInts can be determined using listNegInts.size(). No need to have a separate variable keeping track.*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      final int NUM_ELEMENTS = 6;
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> listInts = new ArrayList<Integer>();
      ArrayList<Integer> listNegInts = new ArrayList<Integer>();
      int i;
      
      // Get input integers
      for (i = 0; i < NUM_ELEMENTS; ++i) {
         listInts.add(scnr.nextInt());
      }
      // Copy negative integers to new ArrayList
      for (i = 0; i < NUM_ELEMENTS; ++i) {
         if (listInts.get(i) < 0) { // Negative, so copy to other negatives list
            listNegInts.add(listInts.get(i));
         }
      }
      // Output negative integers
      System.out.println(listNegInts.size());
      for (i = 0; i < listNegInts.size(); ++i) {
         System.out.println(listNegInts.get(i));
      }
   }
}
