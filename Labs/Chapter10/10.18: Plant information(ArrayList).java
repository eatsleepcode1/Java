/*Given a base Plant class and a derived Flower class, complete main() to create an ArrayList called myGarden. 
The ArrayList should be able to store objects that belong to the Plant class or the Flower class. 
Create a method called printArrayList(), that uses the printInfo() methods defined in the respective classes and prints each element in myGarden. 
The program should read plants or flowers from input (ending with -1), add each Plant or Flower to the myGarden ArrayList, 
and output each element in myGarden using the printInfo() method.
Ex. If the input is:
plant Spirea 10 
flower Hydrangea 30 false lilac 
flower Rose 6 false white
plant Mint 4
-1
the output is:
Plant 1 Information: 
   Plant name: Spirea
   Cost: 10

Plant 2 Information: 
   Plant name: Hydrangea
   Cost: 30
   Annual: false
   Color of flowers: lilac

Plant 3 Information: 
   Plant name: Rose
   Cost: 6
   Annual: false
   Color of flowers: white

Plant 4 Information: 
   Plant name: Mint
   Cost: 4*/
public class Plant {
   protected String plantName;
   protected String plantCost;

   public void setPlantName(String userPlantName) {
      plantName = userPlantName;
   }

   public String getPlantName() {
      return plantName;
   }

   public void setPlantCost(String userPlantCost) {
      plantCost = userPlantCost;
   }

   public String getPlantCost() {
      return plantCost;
   }

   public void printInfo() {
      System.out.println("   Plant name: " + plantName);
      System.out.println("   Cost: " + plantCost);
   }
}
public boolean getPlantType(){
      return isAnnual;
   }

   public void setColorOfFlowers(String userColorOfFlowers) {
      colorOfFlowers = userColorOfFlowers;
   }

   public String getColorOfFlowers(){
      return colorOfFlowers;
   }
   
   @Override
   public void printInfo(){
      System.out.println("   Plant name: " + plantName);
      System.out.println("   Cost: " + plantCost);
      System.out.println("   Annual: " + isAnnual);
      System.out.println("   Color of flowers: " + colorOfFlowers);
   }
}
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects                                                       
    public static void printArrayList(ArrayList<Plant> myGarden) {
        for (int i = 0; i < myGarden.size(); ++i) {
               System.out.println("Plant " + (i + 1) + " Information: ");
               myGarden.get(i).printInfo();
               System.out.println();
            }
        }
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant
      ArrayList<Plant> myGarden = new ArrayList<>();
      
      // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost, colorOfFlowers, isAnnual
      String plantName;
      String plantCost;
      String colorOffFlowers;
      boolean isAnnual;
      String flowerName;
      String flowerCost;
      String colorOfFlowers;
      
      input = scnr.nextLine();
      while(!input.equals("-1")){
         // TODO: Check if input is a plant or flower
         //       Store as a plant object or flower object
         //       Add to the ArrayList myGarden
      String[] info = input.split(" ");
      
       if (info[0].toLowerCase().equals("plant")) {
            Plant p1 = new Plant();
               p1.setPlantName(info[1]);
               p1.setPlantCost(info[2]);
               myGarden.add(p1);
         }        
        else if (info[0].toLowerCase().equals("flower")) {
           Flower f1 = new Flower();
            f1.setPlantName(info[1]);
            f1.setPlantCost(info[2]);
            f1.setPlantType(Boolean.parseBoolean(info[3]));
            f1.setColorOfFlowers(info[4]);
            myGarden.add(f1);
         }
         else {
            continue;
         }  
         input = scnr.nextLine();
      }
      
      // TODO: Call the method printArrayList to print myGarden
      printArrayList(myGarden);
   }
}
