/*Write a toString() method for the Number class, which returns a String representation of a Number object. 
The String should be in the format "The value is yourNum", where yourNum is the value of the integer instance field from the Number class
Ex: If the input is:
723
then the output is:
The value is 723*/
import java.util.Scanner;

public class Number {
   private int num;
   
   public Number(int n) {
      num = n;
   }

   public String toString() {
      return "The value is " + num;
   }
   
   public int getNum() {
      return num;
   }
   
   public void setNum(int n) {
      num = n;
   }

   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int inputNum = scnr.nextInt();
      Number yourNum = new Number(inputNum);
      System.out.print(yourNum);
   }
}
