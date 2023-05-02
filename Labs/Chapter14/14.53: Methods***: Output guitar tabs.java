/*An earlier problem introduced guitar tabs. In this problem, the user can enter a sequence of chords, 
and the program should output the tabs in sequence. The first input is the number of chords to follow. If the input is 4 G C G D, the output should be:
e|-3-0-3-2-
B|-0-1-0-3-
G|-0-0-0-2-
D|-0-2-0-0-
A|-2-3-2---
E|-3---3---
Hint:
    Use 6 Java strings, one for each guitar string ("string" below will mean Java string unless otherwise noted).
    Start by the e string with "e|-", the B string with "B|-", etc.
    For each user chord, append to each string the appropriate item (a number or -) plus -, like "2-".
    When done, print the 6 strings one at a time separated by newlines.*/
import java.util.Scanner; 

public class LabProgram {

	public static void guitarTabs() {
		Scanner scnr = new Scanner(System.in); 
		String eString = "e|-";
		String BString = "B|-";
		String GString = "G|-";
		String DString = "D|-";
		String AString = "A|-";
		String EString = "E|-";
		int numChords;
		String userChord;
		int i;

		numChords = scnr.nextInt();
		for (i = 0; i < numChords; ++i) { // Build each string by appending each chord's tab
			userChord = scnr.next(); 
			if (userChord.equals("G")) {  // Tab: 300023
				eString += "3-";
				BString += "0-";
				GString += "0-";
				DString += "0-";
				AString += "2-";
				EString += "3-";
			}
			else if (userChord.equals("C")) { // Tab: 01023-
				eString += "0-";
				BString += "1-";
				GString += "0-";
				DString += "2-";
				AString += "3-";
				EString += "--";
			}
			else if (userChord.equals("D")) { // Tab: 2320--
				eString += "2-";
				BString += "3-";
				GString += "2-";
				DString += "0-";
				AString += "--";
				EString += "--";
			}
		}

		System.out.println(eString); 
		System.out.println(BString); 
		System.out.println(GString); 
		System.out.println(DString); 
		System.out.println(AString); 
		System.out.println(EString); 

	}

	public static void main(String[] args) {
		guitarTabs();

	}
}

/* NOTES

 * The language is case sensitive. The above took advantage of that by declaring both eString and EString, thus
  keeping with the standard tab convention of writing the low guitar string as E and the high guitar string as e. 

 * When outputting an item that flows to the right but on many lines, the pattern of creating building a string 
  for each line, and then outputting all the strings at the end, is a common pattern. 

 * Requiring the user to type the number of chords was done to simplify this program. A preferred approach simply
  reads until reaching the end of input (or reaching a special input string like "done"). 

 * A more complete program would include "measures" (groups of chords). Such a program would indeed be very useful
  for generating tabs commonly found on various websites like https://www.ultimate-guitar.com/

 */ 
