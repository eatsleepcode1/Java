/*The previous program did not close the opened file before exiting. A good practice is to close all files to allow the operating system to cleanup any 
resources used while reading or writing a file. 
The following example reads numbers from an input file, writes the average to an output file, and then closes both files before exiting. */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDataAverage {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int expectedNumValues = 0;
      int numValuesRead = 0;
      int valueSum = 0;
      double valueAvg = 0.0;

      FileInputStream fileInStream;
      Scanner fileScanner = null;
      FileOutputStream fileOutStream;
      PrintWriter fileWriter = null;

      try {
         // Open input file.
         fileInStream = new FileInputStream("input.txt");
         fileScanner = new Scanner(fileInStream);
         System.out.println("Opened input.txt");

         // Open output file.
         fileOutStream = new FileOutputStream("output.txt");
         fileWriter = new PrintWriter(fileOutStream);
         System.out.println("Opened output.txt");

         // The first entry in the input file is the expected number of values.
         expectedNumValues = fileScanner.nextInt(); // May throw InputMismatchException

         // Calculate the average input value.
         for (numValuesRead = 0; numValuesRead < expectedNumValues; ++numValuesRead) {
            valueSum += fileScanner.nextInt();  // May throw InputMismatchException
         }

         valueAvg = valueSum / numValuesRead;

         // Print the average to the output file.
         fileWriter.println("Average: " + valueAvg);
      }
      catch (FileNotFoundException exception) {
         System.out.println("Error opening file");
      }

      // Close both files.
      if (fileScanner != null) {
         fileScanner.close();
         System.out.println("Closed input.txt");
      }

      if (fileWriter != null) {
         fileWriter.close();
         System.out.println("Closed output.txt");
      }
   }
}
