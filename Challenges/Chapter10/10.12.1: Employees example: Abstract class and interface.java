/*The classes below describe an abstract class named EmployeePerson and two derived concrete classes, EmployeeManager and EmployeeStaff, 
both of which extend the EmployeePerson class. The main program creates objects of type EmployeeManager and EmployeeStaff and prints them.

Run the program. The program prints manager and staff data using the EmployeeManager's and EmployeeStaff's printInfo methods. 
Those classes override EmployeePerson's getAnnualBonus() method but simply return 0.
Modify the EmployeeManager and EmployeeStaff getAnnualBonus methods to return the correct bonus rather than just returning 0. 
A manager's bonus is 10% of the annual salary and a staff's bonus is 7.5% of the annual salary. */
public class EmployeeMain {

   public static void main(String [] args) {

      // Create the objects
      EmployeeManager manager = new EmployeeManager(25);
      EmployeeStaff   staff1  = new EmployeeStaff("Michele");

      // Load data into the objects using the Person class's method
      manager.setData("Michele", "Sales", "03-03-1975", 70000);
      staff1.setData ("Bob",     "Sales", "02-02-1980", 50000);

      // Print the objects
      manager.printInfo();
      System.out.println("Annual bonus: " + manager.getAnnualBonus());
      staff1.printInfo();
      System.out.println("Annual bonus: " + staff1.getAnnualBonus());
   } 
} ---end of file-----
abstract class EmployeePerson {
   protected String fullName;       // In the format last name, first name
   protected String departmentCode;
   protected String birthday;
   protected int annualSalary;
   
   // ***********************************************************************

   // Default constructor. Set protected variables to the empty string or 0
   public EmployeePerson() {
      fullName = "";
      departmentCode = "";
      birthday = "";
      annualSalary = 0;
   } 

   // ***********************************************************************

   // Constructor with parameters to set the private variables
   public EmployeePerson(String empFullName, String empDepartmentCode,
                         String empBirthday, int empAnnualSalary) {
      setData(empFullName, empDepartmentCode, empBirthday, empAnnualSalary);
   } 
   
   // ***********************************************************************

   public void setData(String empFullName, String empDepartmentCode,
                       String empBirthday, int empAnnualSalary) {
      fullName       = empFullName;
      departmentCode = empDepartmentCode;
      birthday       = empBirthday;
      annualSalary   = empAnnualSalary;
   } 

   // ***********************************************************************

   // Ensure each subclass has a printInfo() method
   abstract void printInfo();

   // ***********************************************************************

   // Ensure each subclass has a getAnnualBonus() method
   abstract int getAnnualBonus();
} ------end of file-------
public class EmployeeManager extends EmployeePerson {
   private int numManaged;    // Number of staff managed

   // ***********************************************************************

   // Default constructor
   public EmployeeManager() {
      numManaged = 0;
   } 

   // ***********************************************************************

   // Constructor with parameters 
   public EmployeeManager(int nManaged) {
      numManaged = nManaged;
   } 

   // ***********************************************************************

   // Get the number of people managed
   public int getNumManaged() {
      return numManaged;
   } 

   // ***********************************************************************

   @Override
   public void printInfo() {
      System.out.println("Name: " + fullName + ", Department: " + 
               departmentCode + ", Birthday: " + birthday +
               ", Salary: " + annualSalary + 
               ", Staff managed: " + getNumManaged());
   } 

   // ***********************************************************************

   // FIXME: Implement the getAnnualBonus method. A manager's annual bonus 
   //        is calculated as 10% of the manager's annual salary.
  
   @Override
   public int getAnnualBonus() {
      return 0;
   } 
    /* // The annual bonus for a manager is 10% of the annual salary.
   @Override
   public int getAnnualBonus() {
      return (int)(annualSalary * 0.10);
   } */
   // ***********************************************************************
} -----end of file-------
public class EmployeeStaff extends EmployeePerson {
   private String managerName;

   // ***********************************************************************

   // Default constructor 
   public EmployeeStaff() {
      managerName = "";
   } 

   // ***********************************************************************

   // Constructor with parameters
   public EmployeeStaff(String reportsTo) {
      managerName = reportsTo;
   } 

   // ***********************************************************************

   // Get the name of the manager
   
   public String getManagerName() {
      return managerName;
   } 

   // ***********************************************************************

   @Override
   public void printInfo() {
      System.out.println("Name: " + fullName + ", Department: " + 
                         departmentCode + ", Birthday: " + birthday +
                         ", Salary: " + annualSalary + 
                         ", Manager: " + getManagerName());
   } 

   // ***********************************************************************

   // FIXME: Implement the getAnnualBonus method. A staff's annual bonus 
   //        is calculated as 7.5% of the employee's annual salary.

   @Override
   public int getAnnualBonus() {
      return 0;
   /*@Override
   public int getAnnualBonus() {
      return (int)(annualSalary * 0.075);
   }  */
   } 
} 
