/*Given main(), define a Course base class with methods to set and get private fields of the following types:
    String to store the course number
    String to store the course title
Define Course's PrintInfo() method that outputs the course number and title.
Then, define a derived class OfferedCourse with methods to set and get private fields of the following types:
    String to store the instructor's name
    String to store the location
    String to store the class time
Ex. If the input is:
ECE287
Digital Systems Design
ECE387
Embedded Systems Design
Mark Patterson
Wilson Hall 231
WF: 2-3:30 pm
the output is:
Course Information:
   Course Number: ECE287
   Course Title: Digital Systems Design
Course Information:
   Course Number: ECE387
   Course Title: Embedded Systems Design
   Instructor Name: Mark Patterson
   Location: Wilson Hall 231
   Class Time: WF: 2-3:30 pm*/
public class Course{
   // TODO: Declare private fields
   private String courseNumber;
   private String courseTitle;
   // TODO: Define mutator methods - 
   //       setCourseNumber(), setCourseTitle()
    public void setCourseNumber(String courseNumber){
      this.courseNumber = courseNumber;
      }
   public void setCourseTitle(String courseTitle){
      this.courseTitle = courseTitle;
      }

   // TODO: Define accessor methods - 
   //       getCourseNumber(), getCourseTitle()
    public String getCourseNumber(){
      return courseNumber;
      }
   public String getCourseTitle(){
      return courseTitle;
      }
   // TODO: Define printInfo()
   public void printInfo(){
      System.out.println("Course Information:");
      System.out.println("   Course Number: " + courseNumber);
      System.out.println("   Course Title: " + courseTitle);
      }
}
public class OfferedCourse extends Course {
   // TODO: Declare private fields
   private String instructorName;
   private String location;
   private String classTime;
   // TODO: Define mutator methods -
   //      setInstructorName(), setLocation(), setClassTime()
   public void setInstructorName(String instructorName){
      this.instructorName = instructorName;
      }
   public void setLocation(String location){
      this.location = location;
      }
   public void setClassTime(String classTime){
      this.classTime = classTime;
      }

   // TODO: Define accessor methods -
   //      getInstructorName(), getLocation(), getClassTime()
   public String getInstructorName(){
      return instructorName;
      }
   public String getLocation(){
      return location;
      }
   public String getClassTime(){
      return classTime;
      }
}
import java.util.Scanner;

public class CourseInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Course myCourse = new Course();
      OfferedCourse myOfferedCourse = new OfferedCourse();

      String courseNumber, courseTitle;
      String oCourseNumber, oCourseTitle, instructorName, location, classTime;

      courseNumber = scnr.nextLine();
      courseTitle = scnr.nextLine();

      oCourseNumber =  scnr.nextLine();
      oCourseTitle =  scnr.nextLine();
      instructorName = scnr.nextLine();
      location = scnr.nextLine();
      classTime = scnr.nextLine();

      myCourse.setCourseNumber(courseNumber);
      myCourse.setCourseTitle(courseTitle);
      myCourse.printInfo();

      myOfferedCourse.setCourseNumber(oCourseNumber);
      myOfferedCourse.setCourseTitle(oCourseTitle);
      myOfferedCourse.setInstructorName(instructorName);
      myOfferedCourse.setLocation(location);
      myOfferedCourse.setClassTime(classTime);
      myOfferedCourse.printInfo();

      System.out.println("   Instructor Name: " + myOfferedCourse.getInstructorName());
      System.out.println("   Location: " + myOfferedCourse.getLocation());
      System.out.println("   Class Time: " + myOfferedCourse.getClassTime());
   }
}
