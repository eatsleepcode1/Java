/*Many text processing tools like Microsoft Word or Google Docs will count the number of "words" in text. 
A word is a sequence of any characters other than a space. Write a program that reads an input line of text, 
and outputs the number of words in that text. If the input is "I have a bike." then the output is 4.
Hints:
    Use nextLine() to read the line of text.
    Use a for loop to walk through each character in the string. Count the words as you go through that loop. You'll need a variable to keep that count. 
    Initialize it to 0 before the loop, and then increment it whenever you see a new word.
    Use a boolean variable to indicate whether you are currently "in" a word or not. If you see a space, set that variable with false. Else, set it to true.
    There are actually three cases to consider in each loop iteration. Either you are at a space (so are not in a word), 
    you are not at a space and you are NOT already in a word (so you found a new word), or you are not at a space and you ARE already in a word 
    (so there's nothing to do). So create an if -- else if -- else branch statement. */
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText;
      int i; 
      int wordCount;
      boolean inWord;
      
      if(scnr.hasNextLine()) {
         
         userText = scnr.nextLine();
         
         wordCount = 0;
         inWord = false;
         for (i = 0; i < userText.length(); ++i) {
            if (userText.charAt(i) == ' ') { // Space, so we're not in a word
               inWord = false; 
            }
            else if (!inWord) {  // First non-space char after a space (or at start of text)
               wordCount += 1;   // So we found a new word, thus increment wordCount
               inWord = true;
            }
            else {               // Non-space char in the middle of word
               // Just skip this non-space char
            }
         }
         System.out.println(wordCount);
      }
      else {
         System.out.println("0");
      }
      
   }
}


/* NOTES

* The boolean variable is a nice way to keep track of the current "state" of either being in a word or not.
  If we're not already in a word and we see a non-space char, we just found a new word, so we increment count and 
  set the boolean to true. When we see a space, we set the boolean to false. 
  
* A common mistake is to forget to initialize the boolean to false before the loop. The weird thing is that the program 
  may still work, if the compiler happened to initialize the variable to false. But the programmer shouldn't rely
  on such a compiler initialization. 
  
* Note that we wrote the last "else" branch, even though there's nothing done for that case. We did that for clarity. 
  Writing clear programs is really important. Also, later we might want to update the code to do something for that case,
  including outputting something during debugging. 

*/
