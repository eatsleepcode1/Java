/*Write a method checkCharacter() which has 2 parameters: A String, and a specified index (an int). 
Method checkCharacter() checks the character at the specified index of the String parameter,
and returns a String based on the type of character at that location indicating if the character is a letter, digit, whitespace, or unknown character.
Ex: The method calls below with the given arguments will return the following Strings:
checkCharacter("happy birthday", 2) returns "Character 'p' is a letter"
checkCharacter("happy birthday", 5) returns "Character ' ' is a white space"
checkCharacter("happy birthday 2 you", 15) returns "Character '2' is a digit"
checkCharacter("happy birthday!", 14) returns "Character '!' is unknown"
Your program must define the method:
public String checkCharacter(String word, int index) */
import java.util.Scanner;

public class FunWithCharacters {

               public static String checkCharacter(String word, int index){

      //This checks if the character at the index, is a digit

      if(Character.isDigit(word.charAt(index))){

      //If yes, it returns "Digit"  
      return "Character '"+ word.charAt(index) +"' is a digit";
      }
      //This checks if the character at the index, is a letter
      else if(Character.isLetter(word.charAt(index))){
      //If yes, it returns "letter"
            return "Character '"+ word.charAt(index) +"' is a letter";
         }
      //This checks if the character at the index, is a white space
      else if(word.charAt(index) == ' '){
      //If yes, it returns "white space"
         return "Character '"+ word.charAt(index )+"' is a white space";
         }
      else{
      //If yes, it returns "unknown character"
      return "Character '"+ word.charAt(index) +"' is unknown";
         } 
   }
   
   public static void main(String[] args) {
      
      FunWithCharacters labObject = new FunWithCharacters();
      String word = "happy birthday"; // Set string
      int index = 2; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));
      
      index = 5; // Set specified index to 5
      System.out.println(labObject.checkCharacter(word, index));
      
      word = "happy birthday 2 you"; 
      index = 15; // Set specified index to 15
      System.out.println(labObject.checkCharacter(word, index));
      
      word = "happy birthday!"; 
      index = 14; // Set specified index to 14
      System.out.println(labObject.checkCharacter(word, index));
   }
}
