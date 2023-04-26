/*Build the Student class with the following specifications:

    Private member fields
        String name - Initialized in default constructor to "Louie"
        double gpa - Initialized in default constructor to 1.0
    Default constructor
    Public member methods
        setName() & getName()
        setGPA() & getGPA()*/
        
public class Student {
   // Build Student class with public methods and private fields listed above

   // TODO: Define two private fields
   private String name;
   private double gpa;
   
   public Student() {
      // TODO: Define default constructor
      String name = "Louie";
      double gpa = 1.0;
      this.name = name;
      this.gpa = gpa;
   }
    
   public void setName(String name) {
      // TODO: Assign parameter to private field
      this.name = name;
   }
   
   // TODO: Add three more public methods
   public String getName(){
      return name;
      }
   public double getGPA(){
      return gpa;
      }
   public void setGPA(double gpa){
      this.gpa = gpa;
      }
   
   public static void main(String[] args) {
      Student student = new Student();
      System.out.println(student.getName() + "/" + student.getGPA());
      
      student.setName("Felix");
      student.setGPA(3.7);
      System.out.println(student.getName() + "/" + student.getGPA());
   }
}        
