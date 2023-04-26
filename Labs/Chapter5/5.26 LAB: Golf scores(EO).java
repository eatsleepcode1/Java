/*Golf scores record the number of strokes used to get the ball in the hole. 
The expected number of strokes varies from hole to hole and is called par (i.e. 3, 4, or 5). 
Each score's name is based on the actual strokes taken compared to par:
    "Eagle": number of strokes is two less than par
    "Birdie": number of strokes is one less than par
    "Par": number of strokes equals par
    "Bogey": number of strokes is one more than par
Given main() and two input integers that represent par and the number of strokes used, 
write a method, golfScore(), that returns the appropriate score name (a String). Return "Error" if par or score is not in the expected range.
Ex: If the program input is:
4 3
the method golfScore() returns and then the program outputs:
Birdie
Note: Your program must define the method:
public String golfScore(int par, int strokes) */
import java.util.Scanner;

public class GolfScores {
   
      public String golfScore(int par, int strokes){
      if ((par != 3) && (par != 4) && (par != 5)){
            return "Error";
         }
      else if(strokes <= par - 2){
            return "Eagle";
         }
      else if(strokes <= par -1){
            return "Birdie";
         }
      else if(strokes == par){
            return "Par";
         }
      else{
            return "Bogey";
         } 
      }
   
   public static void main(String[] args) {
      GolfScores score = new GolfScores();
      Scanner scnr = new Scanner(System.in);
      int par;
      int strokes;
      String name;
      
      par = scnr.nextInt();
      strokes = scnr.nextInt();
      
      name = score.golfScore(par, strokes);
      
      System.out.println(name);
   }
}
