//Level 1
/*Write a for loop that prints: 1 2 … lastNumber
Ex: If the input is:
4
the output is:
1 2 3 4  */
import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int lastNumber;
      int i;
      
      Scanner input = new Scanner(System.in);
      lastNumber = input.nextInt();
      
      for (/* Your code goes here */i = 1; i <= lastNumber; ++i) {
         System.out.print(i + " ");
      }
   }
}
/*Write a for loop that prints: 1 2 … numVal
Ex: If the input is:
4
the output is:
1 2 3 4  */
import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int numVal;
      int i;
      
      Scanner input = new Scanner(System.in);
      numVal = input.nextInt();
      
      for (/* Your code goes here */i = 1; i <= numVal; ++i) {
         System.out.print(i + " ");
      }
   }
}
//Level 2
/*Write code that prints: userNum … 2 1
Print a newline after each number.
Ex: If the input is:
3
the output is:
3
2
1 */
import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int userNum;
      int i;
      
      Scanner input = new Scanner(System.in);
      userNum = input.nextInt();
      
      for (/* Your code goes here */i = userNum; i >= 1; --i) {
         System.out.println(i);
      }
   }
}
/*Write code that prints: countNum … 2 1
Print a newline after each number.
Ex: If the input is:
3
the output is:
3
2
1 */
import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int countNum;
      int i;
      
      Scanner input = new Scanner(System.in);
      countNum = input.nextInt();
      
      for (/* Your code goes here */i = countNum; i >= 1; --i) {
         System.out.println(i);
      }
   }
}
//Level 3
/*Write code that prints: Ready! firstNumber … 2 1 Run!
Your code should contain a for loop. Print a newline after each number and after each line of text.
Ex: If the input is:
3
the output is:
Ready!
3
2
1
Run! */
import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int firstNumber;
      int i;
      
      Scanner input = new Scanner(System.in);
      firstNumber = input.nextInt();

      /* Your code goes here */
      System.out.println("Ready!");
      for(i = firstNumber; i > 0; i--){
         System.out.println(i);
         }
      System.out.println("Run!");
   }
}
/*Write code that prints: Ready! countNum … 2 1 Start!
Your code should contain a for loop. Print a newline after each number and after each line of text.
Ex: If the input is:
3
the output is:
Ready!
3
2
1
Start! */
public static void main (String [] args) {
      int countNum;
      int i;
      
      Scanner input = new Scanner(System.in);
      countNum = input.nextInt();

      /* Your code goes here */
      System.out.println("Ready!");
      for(i = countNum; i > 0; i--){
      System.out.println(i);
      }
      System.out.println("Start!");
      
   }
}
public static void main (String [] args) {
      int countNum;
      int i;
      
      Scanner input = new Scanner(System.in);
      countNum = input.nextInt();

      /* Your code goes here */
      System.out.println("Ready!");
      for(i = countNum; i > 0; i--){
      System.out.println(i);
      }
      System.out.println("Start!");
      
   }
}
/*Write code that prints: Ready! numVal … 2 1 Blastoff!
Your code should contain a for loop. Print a newline after each number and after each line of text.
Ex: If the input is:
3
the output is:
Ready!
3
2
1
Blastoff! */
public class ForLoops {
   public static void main (String [] args) {
      int numVal;
      int i;
      
      Scanner input = new Scanner(System.in);
      numVal = input.nextInt();

      /* Your code goes here */
       System.out.println("Ready!");
      for(i = numVal; i > 0; i--){
      System.out.println(i);
      }
      System.out.println("Blastoff!");
   }
}
//Level 4
/*Write a for loop that prints userNum … -1 0.
Ex: If the input is:
-3
the output is:
-3 -2 -1 0  */
import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int userNum;
      int i;
      
      Scanner input = new Scanner(System.in);
      userNum = input.nextInt();
      
      for (/* Your code goes here */i = userNum; i <= 0; i++) {
         System.out.print(i + " ");
      }
   }
}
/*Write a for loop that prints numVal … -1 0.
Ex: If the input is:
-3
the output is:
-3 -2 -1 0  */
import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int numVal;
      int i;
      
      Scanner input = new Scanner(System.in);
      numVal = input.nextInt();
      
      for (/* Your code goes here */i = numVal; i <= 0; i++) {
         System.out.print(i + " ");
      }
   }
}
//Level 5
/*Write a for loop that prints from firstNumber to endNumber.
Ex: If the input is:
-3 1
the output is:
-3 -2 -1 0 1  */
import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int firstNumber;
      int endNumber;
      int i;
      
      Scanner input = new Scanner(System.in);
      firstNumber = input.nextInt();
      endNumber = input.nextInt();
      
      for (/* Your code goes here */i = firstNumber; i <= endNumber; i++) {
         System.out.print(i + " ");
      }
   }
}
/*Write a for loop that prints from initialNumber to finalNumber.
Ex: If the input is:
-3 1
the output is:
-3 -2 -1 0 1  */
import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int initialNumber;
      int finalNumber;
      int i;
      
      Scanner input = new Scanner(System.in);
      initialNumber = input.nextInt();
      finalNumber = input.nextInt();
      
      for (/* Your code goes here */i = initialNumber; i <= finalNumber; i++) {
         System.out.print(i + " ");
      }
   }
}
