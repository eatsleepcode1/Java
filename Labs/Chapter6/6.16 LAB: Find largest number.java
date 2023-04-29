/*Write a method, findMax(), that repeatedly reads in integers until a negative integer is read and keeps track of the largest integer that has been read. 
findMax() then returns the largest number entered.
Ex: If the input is:
2 77 17 4 -1
the findMax() returns and the program output is:
77
Assume a user will enter at least one non-zero integer.
Note: Your program must define the method:
public int findMax()*/
import java.util.Scanner;

public class Max {
   
   public int findMax() {
      /* Type your code here. */  
      int max = 0;
      Scanner in = new Scanner(System.in);
       
       while (true) {
           int num = in.nextInt();
           if (num >= 0) {
               if (num > max) {
                   max = num;
               }
           }
           else {
            break;
            }
       }
       return max;
         } 
   
   
   public static void main(String[] args) {
      Max test = new Max();
      System.out.println(test.findMax());
      }
   }
