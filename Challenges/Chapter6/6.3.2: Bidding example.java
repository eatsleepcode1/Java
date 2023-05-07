/*Write an expression that continues to bid until the user enters 'n'. */
import java.util.Scanner;

public class AutoBidder {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      char keepBidding;
      int nextBid;

      nextBid = 0;
      keepBidding = 'y';

      while (/* Your solution goes here  */keepBidding != 'n') {
         nextBid = nextBid + 3;
         System.out.println("I'll bid $" + nextBid + "!");
         System.out.print("Continue bidding? (y/n) ");
         keepBidding = scnr.next().charAt(0);
      }
      System.out.println("");
   }
}
