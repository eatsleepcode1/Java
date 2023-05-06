Level 1
/*In the class definition, initialize the private fields name (string) and height (double) with the default values "Unspecified" and -1.00, respectively.

Ex: If the input is Ron 7.00, then the output is:

Default values: 
Name: Unspecified, Height: -1.00
After mutator methods: 
Name: Ron, Height: 7.00

Note: The class's print() method is called before and after the input is passed to the setters. */
public class Member {

   private /* Your code goes here */ String name = "Unspecified";
	private /* Your code goes here */ double height = -1.00;

   public void setName(String memberName) {
		name = memberName;
	}
	
	public void setHeight(double memberHeight) {
		height = memberHeight;
	}
   
   public void print() {
      System.out.print("Name: " + name);
		System.out.printf(", Height: %.2f\n", height);
   }
}
------end of file--------
import java.util.Scanner;

public class MemberList {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      String newName;
		double newHeight;
      Member member1 = new Member();
      
      System.out.println("Default values: ");
      member1.print();
      
      newName = scnr.next();
		newHeight = scnr.nextDouble();
      
      member1.setName(newName);
		member1.setHeight(newHeight);
      
      System.out.println("After mutator methods: ");
      member1.print();
   }
}
Level 2
/*Define a default constructor that initializes the fields color (string), age (integer), and name (string) with the default values "Incomplete", 0, 
and "Empty", respectively.
Ex: If the input is golden 15 Ken, then the output is:
Default values: 
Color: Incomplete, Age: 0, Name: Empty
After mutator methods: 
Color: golden, Age: 15, Name: Ken

Note: The class's print() method is called before and after the input is passed to the setters. */
public class Animal {
   private String color;
	private int age;
	private String name;

   /* Your code goes here */

   public void setColor(String animalColor) {
		color = animalColor;
	}
	
	public void setAge(int animalAge) {
		age = animalAge;
	}
	
	public void setName(String animalName) {
		name = animalName;
	}
   
   public void print() {
      System.out.println("Color: " + color + ", Age: " + age + ", Name: " + name);
   }
}
------end of file-------
import java.util.Scanner;

public class FavoriteAnimals {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String newColor;
		int newAge;
		String newName;
      Animal favoriteAnimal = new Animal();
      
      System.out.println("Default values: ");
      favoriteAnimal.print();
      
      newColor = scnr.next();
		newAge = scnr.nextInt();
		newName = scnr.next();
      
      favoriteAnimal.setColor(newColor);
		favoriteAnimal.setAge(newAge);
		favoriteAnimal.setName(newName);
      
      System.out.println("After mutator methods: ");
      favoriteAnimal.print();
   }
} 
 /* Your code goes here */
   public Animal(){
      this.color = "Incomplete";
      int age = 0;
      this.name = "Empty";
      }
