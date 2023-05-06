/*A finally block always executes when a try block exits. A programmer can use a finally block to do additional processing, 
even if an exception is thrown in the try statement. The program below uses a finally block to write partial results to the output file, 
even if an InputMismatchException exception occurs while reading the input file. */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class FileDataSum {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      PrintWriter fileWriter = null;
      int numValues;
      int numValuesRead = 0;
      int valueSum = 0;

      try (Scanner fileScnr = new Scanner(new FileInputStream("input.txt"))) {
         fileWriter = new PrintWriter(new FileOutputStream("output.txt"));
         numValues = fileScnr.nextInt();

         for (numValuesRead = 0; numValuesRead < numValues; ++numValuesRead) {
            valueSum += fileScnr.nextInt();
         }
      }
      catch (FileNotFoundException exception) {
         System.out.println("File not found");
      }
      finally {
         if (fileWriter != null) {
            fileWriter.println(valueSum);
            fileWriter.close();
         }
      }
   }
}
