/*A pedometer treats walking 1 step as walking 2.5 feet. Define a method named feetToSteps that takes a double as a parameter, 
representing the number of feet walked, and returns an integer that represents the number of steps walked. 
Then, write a main program that reads the number of feet walked as an input, calls method feetToSteps() with the input as an argument, 
and outputs the number of steps.
Use floating-point arithmetic to perform the conversion.
Ex: If the input is:
150.5
the output is:
60
The program must define and call a method:
public static int feetToSteps(double userFeet)*/
import java.util.Scanner;

public class LabProgram {
   
   public static int feetToSteps(double userFeet){
      return (int) (userFeet / 2.5);
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      System.out.println(feetToSteps(scnr.nextDouble()));
   }
}
