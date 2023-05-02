/*Suppose a graphics program needs a method to indicate whether one rectangle is smaller than another rectangle. 
A rectangle is specified by its upper-left coordinate and bottom-right coordinate. If the first rectangle is (1, 1) and (2,3), 
and the second is (0,0) and (10,10), the method returns true.
Hints:
    Use copy-paste to ensure your parameters exactly match the arguments. You can use the same names for parameters as the arguments.
    Declare local variables r1Area and r2Area to make your comparison expression simpler.
    Use the abs() method in Java's Math class (requires import static java.lang.Math.abs).
    Take great care to check and recheck that your calculations involve the correct values.*/
import java.util.Scanner; 
import static java.lang.Math.abs; 

public class LabProgram {
   
   public static boolean firstRectangleSmaller(int r1xul, int r1yul, int r1xbr, int r1ybr, 
                                              int r2xul, int r2yul, int r2xbr, int r2ybr) {
      int r1Area, r2Area;
      
      // Area is width * height
      
      r1Area = abs(r1xul - r1xbr) * abs(r1yul - r1ybr);  // width * height
      r2Area = abs(r2xul - r2xbr) * abs(r2yul - r2ybr);
      
      if (r1Area < r2Area) {
         return true;
      }
      else {
         return false;
      }
   }
   
   /* NOTES

   * Great care must be taken to ensure the correct variables are used in each calculation; making a mistake is easy.
     A good idea is examine your code several times checking specific things each time: Does the first calculation only
     involve r1? The second only r2? Does the first difference do upper-left and bottom right? Does the second? 
     
   * Likewise, great care should be taken to ensure the parameters are written correctly as well. 
     
   * The function could have just returned (r1Area < r2Area), without the if-else. We like the explicitness, but either is fine.
   
   * Writing a function to compute one rectangle's area, then calling it twice, would likely be a good idea, yielding
     even cleaner code. 
     
   * Some people might have written one large expression to avoid declaring variables r1Area and r2Area, but 
     such code would be harder to read. Better to use intermediate variables so to keep the code easier to read. 
     
   */

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int r1xul, r1yul, r1xbr, r1ybr; // x upper-left, y upper-left, x bottom-right, y bottom-right
      int r2xul, r2yul, r2xbr, r2ybr;
      
      r1xul = scnr.nextInt(); r1yul = scnr.nextInt(); r1xbr = scnr.nextInt(); r1ybr = scnr.nextInt(); 
      r2xul = scnr.nextInt(); r2yul = scnr.nextInt(); r2xbr = scnr.nextInt(); r2ybr = scnr.nextInt(); 
   
      System.out.println(firstRectangleSmaller(r1xul, r1yul, r1xbr, r1ybr, r2xul, r2yul, r2xbr, r2ybr)); 
   }
}
