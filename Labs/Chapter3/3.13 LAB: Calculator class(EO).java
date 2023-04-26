/*Build a class called Calculator that emulates basic functions of a calculator: add, subtract, multiply, divide, and clear. 
The class has one private member field, double value, for the calculator's current value. 
Implement the following Constructor and instance methods as listed below:

    public Calculator() - Constructor method to set the member field to 0.0
    public void add(double val) - add the parameter to the member field
    public void subtract(double val) - subtract the parameter from the member field
    public void multiply(double val) - multiply the member field by the parameter
    public void divide(double val) - divide the member field by the parameter
    public void clear( ) - set the member field to 0.0
    public double getValue( ) - return the member field

Given two double input values num1 and num2, the program outputs the following values:

    The initial value of the instance field, value
    The value after adding num1
    The value after multiplying by 3
    The value after subtracting num2
    The value after dividing by 2
    The value after calling the clear() method
Ex: If the input is:

10.0 5.0

the output is:

0.0
10.0
30.0
25.0
12.5
0.0 */

import java.util.Scanner;

public class Calculator {
   // Build Calculator class with public methods and private fields listed above
   
   /* Type your code here. */ 
   private double value;
    
   public Calculator(){
      this.value = 0.0;
       }
       
   public void add(double val){
      this.value += val;
      }
      
   public void subtract(double val){
      this.value -= val;
      }
      
   public void multiply(double val){
      this.value *= val;
      }
   public void divide(double val){
      this.value /= val;
      }
      
   public void clear( ){
      this.value = 0.0;
      }
      
   public double getValue( ){
      return value;
      }

   public static void main(String[] args) {
      Calculator calc = new Calculator();

		Scanner keyboard = new Scanner(System.in);
		double num1 = keyboard.nextDouble();
		double num2 = keyboard.nextDouble();
		
		// 1. The initial value
		System.out.println(calc.getValue()); 
		
		// 2. The value after adding num1
		calc.add(num1);
		System.out.println(calc.getValue());
		
		// 3. The value after multiplying by 3
		calc.multiply(3);
		System.out.println(calc.getValue());
		
		// 4. The value after subtracting num2
		calc.subtract(num2);
		System.out.println(calc.getValue());
		
		// 5. The value after dividing by 2
		calc.divide(2);
		System.out.println(calc.getValue());
		
		// 6. The value after calling the clear() method
		calc.clear();
		System.out.println(calc.getValue()); 
   }
}
