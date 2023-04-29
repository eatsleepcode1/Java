/*Complete the Course class by implementing the printRoster() method, which outputs a list of all students enrolled in a course and 
also the total number of students in the course.
Given classes:
    Class Course represents a course, which contains an ArrayList of Student objects as a course roster. (Type your code in here)
    Class Student represents a classroom student, which has three fields: first name, last name, and GPA. 
    (Hint: toString() returns a String representation of the Student object.)
Ex: If the following students and their GPA values are added to a course:
Henry Cabot with 3.5 GPA
Brenda Stern with 2.0 GPA
Jane Flynn with 3.9 GPA
Lynda Robison with 3.2 GPA
then the program output is:
Henry Cabot (GPA: 3.5)
Brenda Stern (GPA: 2.0)
Jane Flynn (GPA: 3.9)
Lynda Robison (GPA: 3.2)
Students: 4*/
import java.text.DecimalFormat;

// Class representing a student
public class Student {

	private String first;  // first name
	private String last;   // last name
	private double gpa;    // grade point average

	// Student class constructor
	public Student(String first, String last, double gpa) {
		this.first = first; // first name
		this.last = last;   // last name
		this.gpa = gpa;     // grade point average
	}

	public double getGPA() {
		return gpa;
	}

	public String getLast() {
		return last;
	}

	// Returns a String representation of the Student object, with the GPA formatted to one decimal
	public String toString() {
		DecimalFormat fmt = new DecimalFormat("#.0");
		return first + " " + last + " " + "(GPA: " + fmt.format(gpa) + ")";
	}
}
import java.util.ArrayList;

// Class representing a student
public class Course {
	private ArrayList<Student> roster; // Collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}

   // Output each student in the course roster, and then the total size of the course
	public void printRoster() {
		/* Type your code here */
		 // Use for loop to iterate over the roster and print string representation of each student object in the roster
        for (int counter = 0; counter < roster.size(); counter++) {         
          System.out.println(roster.get(counter).toString() + "");   
      }
      // Print the number of students in the roster
      System.out.println("Students: "+ roster.size());
    }

	public void addStudent(Student s) {
		roster.add(s);
	}
    
   // main
   public static void main(String args[]) {
      Course course = new Course();
      String first;  // first name
      String last;   // last name
      double gpa;    // grade point average
      
      first = "Henry";
      last = "Cabot";
      gpa = 3.5;
      course.addStudent(new Student(first, last, gpa));  // Add 1st student
      
      first = "Brenda";
      last = "Stern";
      gpa = 2.0;
      course.addStudent(new Student(first, last, gpa));  // Add 2nd student
      
      first = "Jane";
      last = "Flynn";
      gpa = 3.9;
      course.addStudent(new Student(first, last, gpa));  // Add 3rd student
      
      first = "Lynda";
      last = "Robison";
      gpa = 3.2;
      course.addStudent(new Student(first, last, gpa));  // Add 4th student

      course.printRoster();
   }    
}
