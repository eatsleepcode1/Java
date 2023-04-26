Level 1
public class ReturnMethodOutput {
   public int changeValue(int x) {
      return x + 4;
   }

   public static void main (String [] args) {
      ReturnMethodOutput output = new ReturnMethodOutput();
      System.out.print(output.changeValue(3));
   }
}
Output: 7
Level 2
public class ReturnMethodOutput {
   public int changeValues(int x, int y) {
      return x + y;
   }

   public static void main (String [] args) {
       ReturnMethodOutput output = new ReturnMethodOutput();
      System.out.print(output.changeValues(1, 3));
   }
}
Output: 4
Level 3
public class ReturnMethodOutput {
   public  int changeValues(int x, int y) {
      int newValue;

      newValue = x + y;

      return newValue;
   }
   public static void main (String [] args) {
      ReturnMethodOutput output = new ReturnMethodOutput();
      System.out.print(output.changeValues(2, 4));
   }
}
Output: 6
