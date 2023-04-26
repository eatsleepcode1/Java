/*Determine the distance between point (x1, y1) and point (x2, y2), and assign the result to pointsDistance. The calculation is:

Ex: For points (1.0, 2.0) and (1.0, 5.0), pointsDistance is 3.0.  */

import java.util.Scanner;

public class CoordinateGeometry {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double x1;
      double y1;
      double x2;
      double y2;
      double pointsDistance;
      double xDist;
      double yDist;

      pointsDistance = 0.0;
      xDist = 0.0;
      yDist = 0.0;

      x1 = scnr.nextDouble();
      y1 = scnr.nextDouble();
      x2 = scnr.nextDouble();
      y2 = scnr.nextDouble();

      /* Your solution goes here  */

      System.out.println(pointsDistance);
   }
}
/* Your solution goes here  */
pointsDistance = Math.sqrt((Math.pow((x2 - x1), 2.0)) + (Math.pow((y2 - y1), 2.0)));
