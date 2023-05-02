/*A customer database file named CustomerDb.txt contains a list of customers (one per line), 
each customer consisting of a unique customer id followed by a first and last name. Given an id, 
output the customer's first and last name. If the id is not found, output "Not found". If the input id is 27, the output might be "Sarah Lee" (if found).
FYI, the customer database's contents happen to be: 42 Mike Jones 16 Al Garcia 27 Sarah Lee 12 Stan Lee 99 Amy Hernandez
Hints:
    The template code has functions for opening and closing the customer database file. You need not understand those functions. 
    Just know that fstream can be read just like System.in. You might also note that the expression evaluates to 0 when the end of file is reached, 
    so the while loop will exit.
    In the while loop, you'll want to skip the first and last names for that id, since that line's id didn't match the id to find.
    After the while loop, check if the id was found (you can compare idToFind with dbId to detect this). If so, read the first and last name, and print them. 
    Else, print "Not found". */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
   public static void main(String[] args) throws IOException {
      FileInputStream fstream = null; // file stream
      String idToFind;// Using string for id in case  has both numbers and letters, like M47
      String dbId = "-1";
      String dbFirstName = "";
      String dbLastName = "";
      boolean found = false;
   
      Scanner scnr = new Scanner(System.in);
      idToFind = scnr.next();

      // You need not understand the file open and close functions to complete this program. Just know that 
      // fstream can be read just like System.in can be read in a new Scanner. 
      
      fstream = new FileInputStream("CustomerDb.txt");
      scnr = new Scanner(fstream);
      
      // File successfully opened, will throw exception otherwise
   
      // When reaching end of file, hasNext() will evaluate to false
      while (!(dbId.equals(idToFind)) && scnr.hasNext()) {
         // Also get first and last names
         dbId = scnr.next();
         dbFirstName = scnr.next();
         dbLastName = scnr.next();
         
         if (dbId.equals(idToFind)) {
            found = true;
            break;
         }
                  
      }
      
      if (found) {
         // Output first and last names
        System.out.println(dbFirstName + " " + dbLastName);
      }
      else {
         System.out.println("Not found");
      }
      
      fstream.close();
   }
   
}

/* NOTES

* Updating an existing code pattern, like a loop that reads text file entries, is a common programmer task. 

* Skipping items in a file while searching for a specific item is common. 

*/ 
