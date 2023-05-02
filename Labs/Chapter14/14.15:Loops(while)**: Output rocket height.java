/*Suppose a launched toy rocket's height is computed as h = vi*t - 5t2. vi is the initial velocity, and t is time in seconds since the launch (starting at 0). 
Write a program to read the initial velocity, then output the time and the rocket's height once per second. 
Stop when the height would be negative, meaning the rocket hit the ground (don't print the negative). 
Assume all values are integers. Ex: For input 20, the output is:
0 0
1 15
2 20
3 15
4 0
Hints:
    Use a while loop.
    t squared is easily calculated as t * t.
    Use this expression for the while loop: (rocketHeight >= 0).
    Don't forget to increment time inside the while loop (else you'll get an infinite loop).*/
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int rocketHeight = 0; 
      int initialVelocity = 0;
      int timeSinceLaunch = 0; 
   
   
      initialVelocity = scnr.nextInt();

      while (rocketHeight >= 0) {
         System.out.println(timeSinceLaunch + " " + rocketHeight);
         timeSinceLaunch = timeSinceLaunch + 1;
         rocketHeight = (initialVelocity * timeSinceLaunch ) - (5 * timeSinceLaunch * timeSinceLaunch);
      }
   
   }
}

/* NOTES: 
* The number of iterations isn't known beforehand, meaning a while loop is usually more appropriate than a for loop.
* The loop only executes if rocketHeight >= 0, so doesn't execute when rocketHeight becomes negative. 
*/
