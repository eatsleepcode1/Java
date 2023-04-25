Level 1
public class CallPerson {
   public static void main(String [] args) {
      String userName;
      Person person1 = new Person();
   
      userName = "Bob";

      // Check Person.java file for setFirstName() definition
      person1.setFirstName(userName);
      
      // Check Person.java file for getFirstName() definition
      System.out.print("He is " + person1.getFirstName());
   }
}
Output: He is Bob
Level 2
public class CallPerson {
   public static void main(String [] args) {
      String userFirstName;
      String userLastName;
      Person person1 = new Person();
   
      userFirstName = "Ron";
      userLastName = "Stark";

      person1.setFirstName(userFirstName);
      person1.setLastName(userLastName);
      
      // Check Person.java file for getFullName() definition
      System.out.print("I am " + person1.getFullName());
   }
}
Output: I am Ron Stark
Level 3
public class CallPerson {
   public static void main(String [] args) {
      String userName;
      String differentUserName;
      Person person1 = new Person();

      userName = "Bob";
      differentUserName = "Ron";
   
      person1.setFirstName(userName);
      System.out.println("You are not " + person1.getFirstName());
      person1.setFirstName(differentUserName);
      System.out.println("You are " + person1.getFirstName());
   }
}
Output: 
You are not Bob
You are Ron

Level 4
public class CallPerson {
   public static void main(String [] args) {
      String aFirstName;
      String anotherFirstName;
      String aLastName;
      String anotherLastName;

      aFirstName = "Sam";
      anotherFirstName = "Joe";
      aLastName = "Stark";
      anotherLastName = "Banner";

      Person person1 = new Person();
      Person person2 = new Person();
      
      person1.setFirstName(aFirstName);
      person1.setLastName(aLastName);
      person2.setFirstName(anotherFirstName);
      person2.setLastName(anotherLastName);

      System.out.println("You are " + person1.getFullName());
      System.out.println("I am " + person2.getFullName());
   }
}
public class Person {
   private String firstName;
   private String lastName;

   public void setFirstName(String firstNameToSet) {
      firstName = firstNameToSet;
   }
   
   public void setLastName(String lastNameToSet) {
      lastName = lastNameToSet;
   }
   
   public String getFullName() {
      return lastName + ", " + firstName;
   }
}
Output:
You are Stark, Sam
I am Banner, Joe
