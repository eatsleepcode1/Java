/*Write a loop that sets newScores to oldScores rotated once left, with element 0 copied to the end.
Ex: If oldScores = {10, 20, 30, 40}, then newScores = {20, 30, 40, 10}. */
import java.util.Scanner;
public class StudentScores {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int SCORES_SIZE = 4;
      int[] oldScores = new int[SCORES_SIZE];
      int[] newScores = new int[SCORES_SIZE];
      int i;

      for (i = 0; i < oldScores.length; ++i) {
         oldScores[i] = scnr.nextInt();
      }

      /* Your solution goes here  */
     for(i = 0; i < SCORES_SIZE -1 ; i++){
         newScores[i] = oldScores[i + 1];
         newScores[SCORES_SIZE - 1] = oldScores[0];
         }
     

      for (i = 0; i < newScores.length; ++i) {
         System.out.print(newScores[i] + " ");
      }
      System.out.println();
   }
}
