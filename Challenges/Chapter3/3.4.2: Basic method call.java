/*Complete the method definition to output the hours given minutes. Output for sample program:

3.5 **/
ublic class MinToHourConv {
   public void outputMinutesAsHours(double origMinutes) {

      /* Your solution goes here  */

   }

   public static void main (String [] args) {
      MinToHourConv timeConv = new MinToHourConv();

      // Will be run with 210.0, 3600.0, and 0.0.
      timeConv.outputMinutesAsHours(210.0);
      System.out.println("");
   }
}
/* Your solution goes here  */
      origMinutes = origMinutes / 60;
      System.out.print(origMinutes);

