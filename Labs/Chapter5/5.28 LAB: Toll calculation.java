/*Toll roads have different fees based on the time of day and on weekends. 
Write a method calcToll() that has three parameters: the current hour of time (int), whether the time is morning (boolean), 
and whether the day is a weekend (boolean). The method returns the correct toll fee (double), based on the chart below.
Weekday Tolls
    Before 7:00 am ($1.15)
    7:00 am to 9:59 am ($2.95)
    10:00 am to 2:59 pm ($1.90)
    3:00 pm to 7:59 pm ($3.95)
    Starting 8:00 pm ($1.40)
Weekend Tolls
    Before 7:00 am ($1.05)
    7:00 am to 7:59 pm ($2.15)
    Starting 8:00 pm ($1.10)
Ex: The method calls below, with the given arguments, will return the following toll fees:
calcToll(7, true, false) returns 2.95
calcToll(1, false, false) returns 1.90
calcToll(3, false, true) returns 2.15
calcToll(5, true, true) returns 1.05 */
public class TollCalculation {
   
   public double calcToll(int hour, boolean isMorning, boolean isWeekend) {
      //this variable store toll amount
         double tollAmount = 0;
      //checking isWeekend
      if(isWeekend == false){
            if (hour < 7 && isMorning == true){
                  tollAmount = 1.15;
                  }
            else if(hour >= 7 && hour <= 9.59 && isMorning == true){
         //when weekday in the morning in between 7.00 am and 9.59 am then
                  tollAmount= 2.95;
                  }
            else if(hour > 10||hour <= 2.59 && isMorning == false){
         //when weekday in between 10.00 am and 2.59 pm then
                  tollAmount= 1.90;
                  }
            else if(hour >= 3 && hour <= 7.59 && isMorning == false){
         //when weekday in evening between 3.00 am and 7.59 pm then
                  tollAmount= 3.95;
                  }
            if(hour > 8.00 && isMorning == false){
         //when weekday in evening starting 8.00 pm then
                  tollAmount= 1.40;
                  }
         }
      
      if(isWeekend == true) {
         if (hour < 7 && isMorning == true){
         //when weekend in the morning before 7.00 am then
                  tollAmount = 1.05;
                  }
         else if((hour >= 7 || hour <= 7.59) && isMorning == false){
         //when weekend in the morning in between 700 am and 759 pm then
                  tollAmount= 2.15;
                  }           
         if(hour >= 8 && isMorning == false){
         //when weekend in evening starting 8.00 pm then
                  tollAmount= 1.10;
                  }
          }   
                     //return tollAmount
                     return tollAmount;
         }
   
  public static void main(String[] args) {
       TollCalculation tollObj = new TollCalculation();
       
       // Test the three samples from the specification.
       System.out.println(tollObj.calcToll(7, true, false));
       System.out.println(tollObj.calcToll(1, false, false));
       System.out.println(tollObj.calcToll(3, true, true));
   }
}
