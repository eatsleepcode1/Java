/*Students make the Dean's list if their GPA is 3.5 or higher. Complete the Course class by implementing the getDeansList() method, 
which returns an ArrayList of students with a GPA of 3.5 or higher.
Given classes:
    Class Course represents a course, which contains an ArrayList of Student objects as a course roster. (Type your code in here.)
    Class Student represents a classroom student, which has three fields: first name, last name, and GPA. (Hint: getGPA() returns a student's GPA.)
Ex: If the following students and their GPA values are added to a course:
Henry Nguyen with 3.5 GPA
Brenda Stern with 2.0 GPA
Lynda Robison with 3.2 GPA
Sonya King with 3.9 GPA
then the getDeansList() method returns an ArrayList of 2 students and the program output is:
Dean's list:
Henry Nguyen (GPA: 3.5)
Sonya King (GPA: 3.9)*/
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
		return first + " " + last + " (GPA: " + fmt.format(gpa) + ")";
	}
}
import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster; // Collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}
   
   // Return an ArrayList of all Students with a GPA of at least 3.5
	public ArrayList<Student> getDeansList() {
	   /* Type your code here */
	     ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < roster.size(); i++) {
            if (roster.get(i).getGPA() >= 3.5)
                students.add(roster.get(i));
        }
        return students;
	}

	public void addStudent(Student s) {
		roster.add(s);
	}
	
	// main
   public static void main(String args[]) {
      Course course = new Course();
      ArrayList<Student> deanList = new ArrayList<Student>();
      String first;  // first name
      String last;   // last name
      double gpa;    // grade point average
      
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

      deanList = course.getDeansList();
		System.out.println("Dean's list:");
		for (Student student: deanList) {
			System.out.println(student);     // Expect: ArrayList with Henry and Sonya
		}
   }    
}
