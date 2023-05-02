/*Map/GPS applications commonly compute the distance between two points. A point may be a coordinate on an x-y plane like 1.5 2.0. 
The distance formula is d = √((x2 - x1)2 + (y2-y1)2) (basically, Pythagorean's Theorem). 
Given two points, output the distance between them. If the input is 1.5 2.0 4.5 6.0, the output is 5.
Hints:
    Add import java.lang.Math; and then use the sqrt() method. For squaring, you might use the pow() method with a second parameter of 2.*/
import java.util.Scanner;
import java.lang.Math;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double x1, y1, x2, y2; 
      double distPoints; 
      
      x1 = scnr.nextDouble(); 
      y1 = scnr.nextDouble(); 
      x2 = scnr.nextDouble(); 
      y2 = scnr.nextDouble(); 
      
      distPoints = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
      System.out.println(distPoints); 
   }
}

/* NOTES

* Using math functions can greatly simplify code. Math.sqrt and Math.pow are common. Power of 2 (squaring) can also be done
  just by multiplying an item by itself, as in num * num. 
  
* The distance formula works in three dimensions too, just be appending + Math.pow(z2-z1, 2) within the square root. 

* Reading in characters and numbers in combination is commonplace. A more robust program would check that 
  parentheses and commas were correctly placed.*/
