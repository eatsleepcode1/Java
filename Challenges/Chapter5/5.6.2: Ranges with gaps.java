Level 1
/*Given integer currentBananas, if the number of bananas is 4 or more but fewer than or equal to 24, output "Manageable portion", followed by a newline.
Ex: If the input is 17, then the output is:
Manageable portion */
import java.util.Scanner;

public class BananaQuantity {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int currentBananas;
      
      currentBananas = scnr.nextInt();
   
      /* Your code goes here */
      if(currentBananas >= 4 && currentBananas <= 24){
         System.out.println("Manageable portion");
         }

   }
}
Level 2
/*Given double temperatureInKelvin, if the temperature is warmer than 26.1 Kelvin and colder than 86.4 Kelvin, output "Admit". 
Otherwise, output "Decline". End each output with a newline.
Ex: If the input is 78.39, then the output is:
Admit */
public class TemperatureController {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      double temperatureInKelvin;
      
      temperatureInKelvin = scnr.nextDouble();

      /* Your code goes here */
      if(temperatureInKelvin > 26.1 && temperatureInKelvin < 86.4){
         System.out.println("Admit");
         }
      else{
         System.out.println("Decline");
         }
   
   }
}
Level 3
/*Given integer grapesOrdered, output:
    "Large bin", if there are 50 - 80 grapes inclusive.
    "Extra large bin", if there are 120 - 150 grapes inclusive.
End each output with a newline.
Ex: If the input is 136, then the output is:
Extra large bin */
public class GrapesQuantity {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int grapesOrdered;
      
      grapesOrdered = scnr.nextInt();
   
      /* Your code goes here */
      if(grapesOrdered >= 50 && grapesOrdered <= 80){
         System.out.println("Large bin");
         }
      else if(grapesOrdered >= 120 && grapesOrdered <= 150){
         System.out.println("Extra large bin");
         }

   }
}
Level 4
/*Given integer numNapkins, output:
    "Basic carton", if the number of napkins is greater than or equal to 51 and less than 91.
    "Standard carton", if the number of napkins is greater than 132 and less than or equal to 164.
    "Not efficient to ship" otherwise.
End each output with a newline.
Ex: If the input is 98, then the output is:
Not efficient to ship */
import java.util.Scanner;

public class NapkinsCount {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numNapkins;
      
      numNapkins = scnr.nextInt();
   
      /* Your code goes here */
      if(numNapkins >= 51 && numNapkins < 91){
         System.out.println("Basic carton");
         }
      else if(numNapkins > 132 && numNapkins <= 164){
         System.out.println("Standard carton");
         }
      else{
         System.out.println("Not efficient to ship");
         }

   }
}
