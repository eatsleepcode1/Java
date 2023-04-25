/*Write a program using integers userNum and divNum as input, and output userNum divided by divNum three times. Note: End with a newline.

Ex: If the input is:

2000 2

the output is:

1000 500 250

Note: In Java, integer division discards fractions. Ex: 6 / 4 is 1 (the 0.5 is discarded) **/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int userNum;
      int divNum;
      
      userNum = scnr.nextInt();
      divNum = scnr.nextInt();
                                                                                       
      System.out.println((userNum /=divNum) + " " + (userNum /=divNum) + " " + (userNum /=divNum));
   }
}


