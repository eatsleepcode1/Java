/*Arrange the following lines to make a program that determines when the number of people in a restaurant equals or exceeds 10 occupants. 
The program continually gets the number of people entering or leaving the restaurant. 
Ex: 2 means two people entered, and -3 means three people left. After each input, the program outputs the number of people in the restaurant. 
Once the number of people in the restaurant equals or exceeds 10, the program exits.

If an InputMismatchException exception occurs, the program should get and discard a single string from input. 
Ex: The input "2 abc 8" should result in 10 occupants. Not all lines are used in the solution. */
import java.util.Scanner;
import java.util.InputMismatchException;

public class MaxOccupancyTracker{
  public static void main(Stirng [] args){
    Scanner scnr = new Scanner(System.in);
    int maxNumPeople = 10;
    int totalNumPeople = 0;
    
while(totalNumPeople < maxNumPeople){
try{
totalNumPeople += scnr.nextInt();
System.out.println("Occupancy: " + totalNumPeople);
}
catch(InputMismatchException e){
scnr.next();
}
}
System.out.println("We're full!");
    }
}
