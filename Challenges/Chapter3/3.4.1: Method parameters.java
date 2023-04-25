Level 1
public class User {

   public void printAge(int userAge) {
      System.out.print("She is " + userAge);
   }

   public static void main (String [] args) {
      User theUser = new User();
      int ageToPrint;

      ageToPrint = 24;
      theUser.printAge(ageToPrint);
   }
}
Output: She is 24
Level 2
public class Price {

   public void printPrice(int price) {
      System.out.print("Price: $" + price);
   }

   public static void main (String [] args) {
      int productPrice;
      int taxAmount;
      Price thePrice = new Price();

      productPrice = 20;
      taxAmount = 3;
      thePrice.printPrice(productPrice + taxAmount);
   }
}
Output: Price: $23
Level 3
public class Operation {

   public void printOperation(int number1, int number2) {
      System.out.print(number1 + "-" + number2 + "=" + (number1 - number2));
   }
   
   public static void main (String [] args) {
      int evenNumber;
      int oddNumber;
      Operation theOp = new Operation();
      
      evenNumber = 4;
      oddNumber = 5;
      theOp.printOperation(evenNumber, oddNumber);
   }
}
Output: 4-5=-1
Level 4
public class User {
   
   public void printInfo(String name, int age) {
      System.out.println(name + ", " + age);
   }
   
   public static void main (String [] args) {
      String userName1 = "Ann";
      String userName2 = "Joe";
      int userAge1 = 20;
      int userAge2 = 19;
      User theUser = new User();
      
      theUser.printInfo(userName1, userAge1);
      theUser.printInfo(userName2, userAge2);
   }
}
Output: 
Ann, 20
Joe, 19

Level 5
public class Player {
   
   public void printPoints(String name, int age, int totalPoints) {
      System.out.println(name + " is " + age);
      System.out.println(name + " made " + totalPoints + " points");
   }
   
   public static void main (String [] args) {
      String playerName = "May";
      int playerAge = 24;
      int regularTimePoints = 27;
      int overtimePoints = 3;
      Player thePlayer = new Player();
      
      thePlayer.printPoints(playerName, playerAge, regularTimePoints + overtimePoints);
   }
}
Output:
May is 24
May made 30 points
