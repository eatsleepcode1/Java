/*Modify the existing ArrayLists's contents, by erasing the second element, then inserting 100 and 102 in the shown locations. 
Use ArrayList's remove() and add() only. Sample ArrayList content of below program:
100 101 102 103  */
import java.util.ArrayList;

public class ArrayListADT {

   public static void main (String [] args) {
      ArrayList<Integer> numsList = new ArrayList<Integer>();
      int numOfElem = 4;

      numsList.add(101);
      numsList.add(200);
      numsList.add(103);

      /* Your solution goes here  */

   }
}
/* Your solution goes here  */
      numsList.remove(1);                           //Assignment code starts here
      numsList.add(0, new Integer(100));
      numsList.add(2, new Integer(102));            //Assignment code ends here
