/*Bowling involves 10 frames. Each frame starts with 10 pins. The bowler has two throws to knock all 10 pins down. 
The total score is the sum of pins knocked down, with some special rules.
For the first 9 frames:
    If all 10 pins are knocked down on a frame's first throw (a "strike"), that frame's score is the previous frame plus 10 plus the next two throws. 
    (No second throw is taken).
    If all 10 pins are knocked down after a frame's second throw (a "spare"), that frame's score is the previous frame plus 10 plus the next throw.
In the 10th frame, if the bowler's first throw is a strike, or the first two throws yields a spare, the bowler gets a third throw. 
The 10th frame's score is the previous frame's score plus the pins knocked down in the 10th frame's two or three throws.
Given integers represents all throws for a game, output on one line each frame's score followed by a space (and end with a newline). 
Note that the number of throws may be as few as 11 (strikes in first 9 frames, and no strike/spare in 10th frame), or as many as 21 
(2 throws in first 9 frames, then 3 in 10th).
For simplicity, the input will always have 21 integers. If the game ended with fewer than 21 throws, the remaining integers will be 0's and can be ignored.
Ex: A perfect game is one where every throw is a strike. The 21 input integers will be: 10 10 10 10 10 10 10 10 10 10 10 10 0 0 0 0 0 0 0 0 0. 
The output will be: 30 60 90 120 150 180 210 240 270 300.
Hints:
    A first for loop should just read in the 21 scores in the first array.
    A second for loop should fill the second array's first 9 elements (first 9 frames).
    Additional code should compute the 10th frame, which is unique.*/
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int[] throwValues = new int[21]; 
      int[] frameScores = new int[10]; 
      int t; // Throw index
      int f; // Frame index
      int frameScore; 
      
      // Read in the 21 possible throw values for the 10 frames
      for (t = 0; t < 21; ++t) {
         throwValues[t] = scnr.nextInt(); 
      }
      
      // Compute score of each of first 9 frames
      t = 0;
      for (f = 0; f < 9; ++f) {
         frameScore = 0;
         frameScore = throwValues[t]; // Add first throw of this frame 
         if (frameScore == 10) { // Strike
            frameScore += throwValues[t + 1] + throwValues[t + 2]; // Add next two throws
         }
         else { // Not a strike
            ++t;
            frameScore += throwValues[t]; // Add second throw of this frame
            if (frameScore == 10) { // Spare
               frameScore += throwValues[t + 1]; // Add next throw
            }
         }
         ++t; 
         
         if (f > 0) { // Not first frame, so add previous frame's score
            frameScore += frameScores[f - 1]; // Add previous frame's score
         }
         
         frameScores[f] = frameScore;
      }
      
      // 10th frame
      frameScores[f] = frameScores[f - 1] + throwValues[t] + throwValues[t + 1] + throwValues[t + 2];
      // Note: If only two throws in 10th frame, the t+2 value will be 0, so OK to add. Keeps code simpler.
   
      // Note that above, frame 1 is at element 0, frame 2 at element 1, ..., and frame 10 at element 9.  
   
      
      for (f = 0; f < 10; ++f) {
         System.out.print(frameScores[f] + " ");
      }
      System.out.println();
   }
}

/* NOTES

* Considering the first 9 frames separately from the 10th frame simplifies the logic. Trying to include the 10th frame
  as a special case in a 10-frame loop may have been harder to think about. 
  
* In the 9-frame loop, three cases must be considered. A strike (add next two throws). Else, it could be a non-spare
  (just add second throw), or could be a spare (add second throw and next throw). The if-else structures capture that. 
  
* Care must be taken to only add the previous frame's score if a previous frame exists. Thus, the (f > 0) check. 
  When using vectors, one must always make sure an element exists before trying to access it. 

*/
