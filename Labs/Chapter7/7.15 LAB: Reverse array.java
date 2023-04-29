/*Complete reverse() method that returns a new character array containing all contents in the input argument reversed.
Ex: If the input array is:
['a', 'b', 'c']
then the returned array will be:
['c', 'b', 'a']*/
import java.util.*;
public class Letters {
   
   // This method reverses contents of input argument arr.
   public char[] reverse(char[] arr) {
		/* Type your code here. */
		for (int i = 0; i < (arr.length / 2); i++) {
         char tempArr = arr[i];        
         arr[i] = arr[arr.length - 1 - i];
         arr[arr.length - 1 - i] = tempArr;
      }return arr;
   }
   
   public static void main(String[] args) {
      Letters lettersObject = new Letters();
      char [] ch = {'a','b','c'};
      System.out.println(lettersObject.reverse(ch));  // Should print cba
   }
}
