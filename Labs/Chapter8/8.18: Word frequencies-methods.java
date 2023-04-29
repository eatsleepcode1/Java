/*Define a method named getWordFrequency that takes an array of strings, the size of the array, and a search word as parameters. 
Method getWordFrequency() then returns the number of occurrences of the search word in the array parameter (case insensitive).
Then, write a main program that reads a list of words into an array, calls method getWordFrequency() repeatedly, and outputs the words 
in the arrays with their frequencies. The input begins with an integer indicating the number of words that follow. 
Assume that the list will always contain less than 20 words.
Ex: If the input is:
5 hey Hi Mark hi mark
the output is:
hey 1
Hi 2
Mark 2
hi 2
mark 2
Hint: Use the equalsIgnoreCase() method for comparing strings, ignoring case.
The program must define and call a method:
public static int getWordFrequency(String[] wordsList, int listSize, String currWord)*/
import java.util.Scanner;

public class LabProgram {

   public static int getWordFrequency(String[] wordsList, int listSize, String currWord){
      int num = 0;
         for(int i = 0; i < listSize; i++){
            if(wordsList[i].equalsIgnoreCase(currWord)){
               num++;
               }
            }
            return num;
      }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElements = scnr.nextInt();
      String array[] = new String[numElements];
      
         for(int i = 0; i < numElements; i++){
            array[i] = scnr.next();
            }
         
         for(int i = 0; i < numElements; i++){
            System.out.println(array[i] + " " + getWordFrequency(array, numElements, array[i]));
            }
   }
}
