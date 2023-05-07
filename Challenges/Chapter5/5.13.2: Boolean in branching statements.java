/*Write an if-else statement to describe an object. Print "Balloon" if isBalloon is true and isRed is false. 
Print "Red balloon" if isBalloon and isRed are both true. 
Print "Not a balloon" otherwise. End with newline. */
import java.util.Scanner;

public class RedBalloon {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      boolean isRed;
      boolean isBalloon;

      isRed = scnr.nextBoolean();
      isBalloon = scnr.nextBoolean();

      /* Your solution goes here  */
      if (isRed && isBalloon){
         isRed = true;
         isBalloon = true;
         System.out.println("Red balloon");
         }
      else if(isBalloon && !isRed){
         isRed = false;
         isBalloon = true;
         System.out.println("Balloon");
         }
      else{
         isRed = false;
         isBalloon = false;
         System.out.println("Not a balloon");
         }
   }
}
