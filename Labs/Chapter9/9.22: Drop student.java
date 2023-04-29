/*Complete the Course class by implementing the dropStudent() method, which removes a student (by last name) from the course roster. 
If the student is not found in the course roster, no student should be dropped.
Given classes:
    Class Course represents a course, which contains an ArrayList of Student objects as a course roster. (Type your code in here.)
    Class Student represents a classroom student, which has three private fields: first name, last name, and GPA. (Hint: getLast() returns the last name field.)
Ex: If the following students and their GPA values are added to a course:
Henry Nguyen with 3.5 GPA
Brenda Stern with 2.0 GPA
Lynda Robison with 3.2 GPA
Sonya King with 3.9 GPA
then dropStudent(last), where last is "Stern", removes a student and the program output is:
Course size: 4 students
Course size after drop: 3 students*/
import java.text.DecimalFormat;

// Class representing a student
public class Student {

	private String first;  // first name
	private String last;   // last name
	private double gpa;    // grade point average

	// Student class constructor
	public Student(String f, String l, double g) {
		first = f;  // first name
		last = l;   // last name
		gpa = g;    // grade point average
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
		return first + " " + last + " " + fmt.format(gpa);
	}
}
import java.util.ArrayList;

public class Course {
	private ArrayList<Student> roster; // Collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}

	// Drops a student from course by removing student from course roster 
	public void dropStudent(String last) {
		//declare dropStudent
       Student dropStudent = null;
       //iterate roster list and find the student based on the last
       for(Student student:roster) {
           if(student.getLast().equals(last)) {
               dropStudent = student;
               break;
           }
       }
       //check dropStudent is not null, then remove dropStudent from the roster list
       if(dropStudent != null) {
           roster.remove(dropStudent);
       }
	}

   public void addStudent(Student s) {
      roster.add(s);
   }
 
   public int countStudents() {
      return roster.size();
   }
   
   // main
   public static void main(String args[]) {
      Course course = new Course();
      String first;  // first name
      String last;   // last name
      double gpa;    // grade point average
      int beforeCount;
      
      first = "Henry";
      last = "Nguyen";
      gpa = 3.5;
      course.addStudent(new Student(first, last, gpa));  // Add 1st student
      
      first = "Brenda";
      last = "Stern";
      gpa = 2.0;
      course.addStudent(new Student(first, last, gpa));  // Add 2nd student
      
      first = "Lynda";
      last = "Robison";
      gpa = 3.2;
      course.addStudent(new Student(first, last, gpa));  // Add 3rd student
      
      first = "Sonya";
      last = "King";
      gpa = 3.9;
      course.addStudent(new Student(first, last, gpa));  // Add 4th student
      
      beforeCount = course.countStudents();  // Number of students before dropping any students
      last = "Stern";
      course.dropStudent(last); // Should drop Brenda Stern
      
      System.out.println("Course size: " + beforeCount + " students");     // Should output 4
		System.out.println("Course size after drop: " + course.countStudents() + " students");     // Should output 3
   }    
}
