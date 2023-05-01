/*Given main() and the Instrument class, define a derived class, StringInstrument, with methods to set and get private fields of the following types:
    int to store the number of strings
    int to store the number of frets
    boolean to store whether the instrument is bowed
Ex. If the input is:
Drums
Zildjian
2015
2500
Guitar
Gibson
2002
1200
6
19
false
the output is:
Instrument Information: 
   Name: Drums
   Manufacturer: Zildjian
   Year built: 2015
   Cost: 2500
Instrument Information: 
   Name: Guitar
   Manufacturer: Gibson
   Year built: 2002
   Cost: 1200
   Number of strings: 6
   Number of frets: 19
   Is bowed: false*/
public class Instrument {

    protected String instrumentName;
    protected String instrumentManufacturer;
    protected int yearBuilt, cost;

    public void setName(String userName) {
        instrumentName = userName;
    }

    public String getName() {
        return instrumentName;
    }

    public void setManufacturer(String userManufacturer) {
        instrumentManufacturer = userManufacturer;
    }

    public String getManufacturer(){
        return instrumentManufacturer;
    }

    public void setYearBuilt(int userYearBuilt) {
        yearBuilt = userYearBuilt;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setCost(int userCost) {
        cost = userCost;
    }

    public int getCost() {
        return cost;
    }

    public void printInfo() {
        System.out.println("Instrument Information: ");
        System.out.println("   Name: " + instrumentName);
        System.out.println("   Manufacturer: " + instrumentManufacturer);
        System.out.println("   Year built: " + yearBuilt);
        System.out.println("   Cost: " + cost);
    }
}
// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
  // TODO: Declare private fields
      private int numOfStrings;
      private int numOfFrets;
      private boolean isBowed;
   // TODO: Define mutator methods - 
   //       setNumOfStrings(), setNumOfFrets(), setIsBowed()
         public void setNumOfStrings(int numOfStrings) {
               this.numOfStrings = numOfStrings;
          }
         public void setNumOfFrets(int numOfFrets) {
               this.numOfFrets = numOfFrets;
            }
         public void setIsBowed(boolean isBowed){
               this.isBowed = isBowed;
            }
   // TODO: Define accessor methods - 
   //       getNumOfStrings(), getNumOfFrets(), getIsBowed()
         public int getNumOfStrings(){
            return numOfStrings;
            }
         public int getNumOfFrets(){
            return numOfFrets;
            }
         public boolean getIsBowed(){
            return isBowed;
            }
}
import java.util.Scanner;

public class InstrumentInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Instrument myInstrument = new Instrument();
      StringInstrument myStringInstrument = new StringInstrument();

      String instrumentName, manufacturerName, stringInstrumentName, stringManufacturer;
      int yearBuilt, cost, stringYearBuilt, stringCost, numStrings, numFrets;
      boolean bowed;

      instrumentName = scnr.nextLine();
      manufacturerName = scnr.nextLine();
      yearBuilt = scnr.nextInt();
      scnr.nextLine();
      cost = scnr.nextInt();
      scnr.nextLine();
      stringInstrumentName = scnr.nextLine();
      stringManufacturer = scnr.nextLine();
      stringYearBuilt = scnr.nextInt();
      stringCost = scnr.nextInt();
      numStrings = scnr.nextInt();
      numFrets = scnr.nextInt();
      bowed = scnr.nextBoolean();

      myInstrument.setName(instrumentName);
      myInstrument.setManufacturer(manufacturerName);
      myInstrument.setYearBuilt(yearBuilt);
      myInstrument.setCost(cost);
      myInstrument.printInfo();

      myStringInstrument.setName(stringInstrumentName);
      myStringInstrument.setManufacturer(stringManufacturer);
      myStringInstrument.setYearBuilt(stringYearBuilt);
      myStringInstrument.setCost(stringCost);
      myStringInstrument.setNumOfStrings(numStrings);
      myStringInstrument.setNumOfFrets(numFrets);
      myStringInstrument.setIsBowed(bowed);
      myStringInstrument.printInfo();

      System.out.println("   Number of strings: " + myStringInstrument.getNumOfStrings());
      System.out.println("   Number of frets: " + myStringInstrument.getNumOfFrets());
      System.out.println("   Is bowed: " + myStringInstrument.getIsBowed());
   }
}
