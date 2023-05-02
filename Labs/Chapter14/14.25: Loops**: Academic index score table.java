/*Many universities calculate a weighted sum of an applicant's high school GPA and standardized test scores, whose value 
(called an Academic Index Score or AIS) must exceed a minimum threshold to be considered for admission. 
Ex: AIS = 2.5 * (GPA / 4.0) * 100 + (test_score / 1600) * 100 must be at least 270. 
Write a program that, given a threshold, prints a table indicating the minimum GPA / test score combinations that meet the threshold. 
Use doubles for all values. Each row is GPA then test score. GPA should range from 3.0 to 4.0 in increments of 0.1.
Hints:
    Do some algebra first to solve the above equation for test_score.
    Write a for loop that iterates 11 times, for 3.0 to 4.0 in 0.1 increments. 
    For each iteration, print the row GPA, then calculate the test_score using the equation you created.
    Be careful to avoid integer division, which yields a different result than floating-point division.*/
import java.util.Scanner;

/* 
   AIS = 2.5*(GPA/4.0)*100 + (test_score/1600)*100 
   AIS/100 = 2.5*(GPA/4.0) + (test_score/1600)
   1600 * (AIS/100) = 1600*2.5*(GPA/4.0) + test_score
   test_score = 1600*(AIS/100) - 1600*2.5*(GPA/4.0)
   
*/ 
public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double aisMinimum;
      double rowGPA;
      double rowTestScore;
      
      aisMinimum = scnr.nextDouble();
      
      for (rowGPA = 3.0; rowGPA < 4.1; rowGPA += 0.1) {
         rowTestScore = 1600.0 * (aisMinimum / 100.0) - 1600.0 * 2.5 * (rowGPA / 4.0);
         System.out.println(rowGPA + " " + rowTestScore);
      }

   }
}

/* NOTES

* The comment at the top shows the original equation, and the work to convert it to compute test score. Showing such
  work can aid a future person who must modify the software, perhaps to use a different equation. We also chose to
  keep values separated (1600 * 2.5) rather than multiplying them out, to make the final equation more understandable
  in relation to the original equation. Any loss of efficiency is negligible compared to understandability
  (and, a good compiler would multiple them out before creating an executable so no runtime overhead 
  would occur anyways). 

* When doing floating-point calculations, good practice is to make all literals (1600.0, 100.0) floating-points as
  well by ending with .0, rather than using ints (1600, 100). This practice makes absolutely clear to a reader
  that the calculation is a floating-point calculation rather than an integer calculation (which can yield very different results). 

* Normally a for loop's index is an int. In this case, a double is most natural. 

* Floating-point values should not be compared for equality, due to inaccuracies of the internal representation
  of floating-point values. In fact, when we originally wrote this code, the loop went to <= 4.0. But that didn't work;
  the loop stopped at 3.9. Interesting, no? Changing the loop to < 4.1 work is safer; even if the loop index is 4.00001, 
  the 4.0 iteration will be printed. 
  
* Really, an even better approach would be to use an int index i as follows: 
  for (i = 0; i <= 10; ++i) {
     rowGPA = 3.0 + (i / 10.0);  // Will be 3.0 + 0.0 = 3.0, then 3.0 + 0.1 = 3.1, ..., 3.0 + 1.0 = 4.0. 
     ...
   This approach prevents the inaccuracies of the 0.1 representation from accumulating as the for loop iterates. 
*/
