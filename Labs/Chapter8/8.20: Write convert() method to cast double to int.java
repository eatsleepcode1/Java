/*Complete the convert() method that casts the parameter from a double to an integer and returns the result.
Note that the main() method prints out the returned value of the convert() method.
Ex: If the double value is 19.9, then the output is:
19
Ex: If the double value is 3.1, then the output is:
3*/
public class LabProgram {
   
   public static int convert(double d){
     return (int) (d);
      
      
   }
   public static void main(String[] args) {
      System.out.println(convert(19.9));
      System.out.println(convert(3.1));
   }
}
