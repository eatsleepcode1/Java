/*Write a method, findLongest(), that takes two strings as parameters and returns the longest string. 
If the strings are the same length then return the second string.
Ex. If the input is:
almond pistachio
the method findLongest() returns and then the program outputs:
pistachio
Your program must define the following method:
public String findLongest(String str1, String str2) */
import java.util.Scanner;

public class LongestString {
   public String findLongest(String str1, String str2) {
      if(str1.length() > str2.length()){
          return str1;
       }
         else{
         return str2;
         }
      }
   
   public static void main(String[] args) {
      LongestString mainObject = new LongestString();
      Scanner scnr = new Scanner(System.in);
      
      String str1;
      String str2;
      String longest;
      
      str1 = scnr.next();
      str2 = scnr.next();
      
      longest = mainObject.findLongest(str1, str2);
      
      System.out.println(longest);
   }
}
