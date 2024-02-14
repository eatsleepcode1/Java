//Fix the noted FIXME issues: change the hourlyWage amount so that it accurately reflects the hourly wage you would like to 
//earn as a software developer, and also fix the monthly salary calculation so that the displayed result is correct.
//public class Salary {                         
   //public static void main(String[] args) { 
      //int hourlyWage;

      //hourlyWage = 20; // FIXME: Adjust to match your hourly earning goal as a software developer.
                   
      //System.out.print("Annual salary is: ");         
      //System.out.println(hourlyWage * 40 * 50);   
    
      //System.out.print("Monthly salary is: ");
      //System.out.println((hourlyWage * 40 * 50) / 1); 
      // FIXME: The above calculation is wrong. Fix the calculation so that it prints monthly salary.

   //} 
//}
public class Salary {
    public static void main(String[] args)
    {
        int hourlyWage;
        hourlyWage = 36;

        System.out.print("Annual salary is: ");
        System.out.println(hourlyWage * 40 * 50);

        System.out.print("Monthly salary is: ");
        System.out.println((hourlyWage * 40 * 50) /12);
    }

}
