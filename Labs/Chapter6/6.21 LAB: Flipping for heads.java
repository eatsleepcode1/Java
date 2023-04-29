/*Given the GVCoin class, complete the method flipForHeads() in the TossingCoins class that counts and returns the number of flips 
taken to achieve a desired number of heads. Method flipForHeads() has a GVCoin object and an integer representing the desired number of heads as parameters. 
Review the definition of "GVCoin.java" by clicking on the orange arrow.
Note: For testing purposes, a GVCoin object is created in the main() method using a pseudo-random number generator with a fixed seed value. 
The program uses a seed value of 15 during development, but when submitted, a different seed value will be used for each test case. 
Refer to the textbook section on Random numbers to learn more about pseudo-random numbers.
Ex: If the GVCoin object is created with a seed value of 15 and the desired number of heads is 100, 
then the method flipForHeads() returns 192 and the program outputs:
Total number of flips for 100 heads: 192*/
import java.util.*;

public class GVCoin {
    
   // true for heads, false for tails
   private boolean isHeads;
   private int flips, heads;
   private Random r;

   public GVCoin() {
     r = new Random();
     heads = 0;
     flips = 0;
     isHeads = true;     
   }

   public void flip() {
     isHeads = r.nextBoolean();  // Flip the coin by randomly choosing true / false
     flips++;  // Increment flip count
     if(isHeads){
         heads++; // Increment heads count if current flip results in heads
     }
   }
    
   public boolean isHeads() {
     return isHeads; // Return true if coin is currently heads
   }    

   public String toString() {
     String str;
     str = "Flips: " + flips + " Heads: " + heads + " isHeads: " + isHeads;
     return str;  // Return String representation of important values
   }    
   
   public int numFlips() {
     return flips;   // Return number of total flips
   }
    
   public int numHeads() {
     return heads;   // Return number of total heads   
   }
    

   public int numTails() {
     return flips - heads; // Return number of total tails   
   }

   public void setToHeads(boolean h) {
     isHeads = h; 
   }

   public GVCoin(int seed) {  // Create the coin with a random seed
     this();
     r = new Random(seed);
   }    
}
public class TossingCoins {
   
   public int flipForHeads(GVCoin coin, int goal) {
      /* Type your code here. */
      while(coin.numHeads() != goal){
         coin.flip();
         }
      return coin.numFlips();
      }
   
   public static void main(String[] args) {
      TossingCoins game = new TossingCoins();
      GVCoin coin = new GVCoin(15); // Create a GVCoin object with seed value 15
      int numHeads = 100;   // Desire 100 heads
      int totalFlips;
      
      totalFlips = game.flipForHeads(coin, numHeads);
      System.out.println("Total number of flips for 100 heads: " + totalFlips);
   }
}
