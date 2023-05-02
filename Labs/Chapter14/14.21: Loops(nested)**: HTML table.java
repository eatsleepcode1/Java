/*HTML is the language of web pages. Items start and end with tags. A table starts with <table> and ends with </table>. 
In a table, a row starts with <tr> and ends with </tr>. In a row, a column starts with <td> and ends with </td>. 
Given two integers for rows and columns, generate an appropriately sized html table. Place the character c in each table cell. 
If the input is 2 3, the output is:
<table>
<tr> <td> c </td> <td> c </td> <td> c </td> </tr>
<tr> <td> c </td> <td> c </td> <td> c </td> </tr>
</table> */
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userRows;
      int userCols;
      int i;
      int j;
      
      userRows = scnr.nextInt();
      userCols = scnr.nextInt();

      System.out.println("<table>");
      for (i = 0; i < userRows; ++i) {
         System.out.print("<tr> ");
         for (j = 0; j < userCols; ++j) {
            System.out.print("<td> c </td> ");
         }
         System.out.println("</tr>");
      }
      System.out.println("</table>");

   }
}
