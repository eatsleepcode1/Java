/*The base class Pet has protected fields petName, and petAge. 
The derived class Cat extends the Pet class and includes a private field for catBreed. Complete main() to:
    create a generic pet and print information using printInfo().
    create a Cat pet, use printInfo() to print information, and add a statement to print the cat's breed using the getBreed() method.
Ex. If the input is:
Dobby
2
Kreacher
3
Scottish Fold
the output is:
Pet Information: 
   Name: Dobby
   Age: 2
Pet Information: 
   Name: Kreacher
   Age: 3
   Breed: Scottish Fold */
public class Cat extends Pet {
   private String breed;

   public void setBreed(String userBreed) {
      breed = userBreed;
   }

   public String getBreed() {
      return breed;
   }
}
public class Pet {

   protected String name;
   protected int age;

   public void setName(String userName) {
      name = userName;
   }

   public String getName() {
      return name;
   }

   public void setAge(int userAge) {
      age = userAge;
   }

   public int getAge() {
      return age;
   }

   public void printInfo() {
      System.out.println("Pet Information: ");
      System.out.println("   Name: " + name);
      System.out.println("   Age: " + age);
   }

}
import java.util.Scanner;

public class PetInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Pet myPet = new Pet();
      Cat myCat = new Cat();
      
      String petName, catName, catBreed;
      int petAge, catAge;

      petName = scnr.nextLine();
      petAge = scnr.nextInt();
      scnr.nextLine();
      catName = scnr.nextLine();
      catAge = scnr.nextInt();
      scnr.nextLine();
      catBreed = scnr.nextLine();
      
      // TODO: Create generic pet (using petName, petAge) and then call printInfo
      myPet.setName(petName);
      myPet.setAge(petAge);
      myPet.printInfo();
      // TODO: Create cat pet (using catName, catAge, catBreed) and then call printInfo
      myCat.setName(catName);
      myCat.setAge(catAge);
      myCat.printInfo();
      // TODO: Use getBreed(), to output the breed of the cat
      myCat.setBreed(catBreed);
      System.out.println("   Breed: " + myCat.getBreed());
   }
}
