/*A guitar has 6 strings that play the notes E (lowest), A, D, G, B, and e (highest). A guitar's neck has regions called frets. 
A musical chord like a "G" or "C" is a combination of notes, and can be played by pressing certain strings at certain frets and then strumming all 6 strings. To quickly learn to play chords, people share "tabs" -- visual indications of what strings to press. To enable easy sharing over the internet, tabs are usually shared as text files. 
Write a program that takes a string input representing one of three chords (G, C, D) and outputs the corresponding tab. If the input is G, the output is:
e|-3-
B|-0-
G|-0-
D|-0-
A|-2-
E|-3-
0 means to strum the string open (without pressing). 1 means to press the string at the first fret, 2 at the second fret, 3 at the third fret.
If the input is C, the output is:
e|-0-
B|-1-
G|-0-
D|-2-
A|-3-
E|---
The - on the E string below the numbers means to not strum that string for that chord.
If the input is D, the output is:
e|-2-
B|-3-
G|-2-
D|-0-
A|---
E|---
If the user enters an unrecognized chord like Am, the output should be: Am is not a supported chord.
For more info, see How to read tabs. (The above three chords, G C D, is the sequence of chords in the classic song "Sweet Home Alabama".
Hints:
    Use an if-else that outputs the appropriate text per chord input.
    Using \n for newlines may make creating the output statements simpler, using a single output string per chord. 
    In fact, you can copy-paste the above output examples between " ", then delete the new lines and spaces and replacing with \n.
    Use an ending "else" branch to output the error message.*/
import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userChord;
      
      userChord = scnr.next();

      if (userChord.equals("G")) {
         System.out.println("e|-3-\nB|-0-\nG|-0-\nD|-0-\nA|-2-\nE|-3-");
         /* 
            e|-3-
            B|-0-
            G|-0-
            D|-0-
            A|-2-
            E|-3-
         */ 
      }
      else if (userChord.equals("C")) {
         System.out.println("e|-0-\nB|-1-\nG|-0-\nD|-2-\nA|-3-\nE|---");
         /*
            e|-0-
            B|-1-
            G|-0-
            D|-2-
            A|-3-
            E|---
         */
      }
      else if (userChord.equals("D")) {
         System.out.println("e|-2-\nB|-3-\nG|-2-\nD|-0-\nA|---\nE|---");
         /* 
            e|-2-
            B|-3-
            G|-2-
            D|-0-
            A|---
            E|---
         */
      }
      else {
         System.out.println(userChord + " is not a supported chord.");
      }
   }
}

/* NOTES

* The comments showing the desired chord help guide the current and future programmer to create a correct output. 

* The program outputs nothing if anything is entered other than a recognized chord. 

* Having an ending "else" to catch unsupported values is a common pattern. 

* userChord was declared as String rather than char to support future chords like Am (A minor). 

*/
