/*Output "Fruit" if the value of userItem is a type of fruit. Otherwise, if the value of userItem is a type of drink, output "Drink". 
End each output with a newline.
Ex: If userItem is GR_APPLES, then the output is:
Fruit */
public class GrocerySorter {
   public enum GroceryItem {GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER}

   public static void main (String[] args) {
      GroceryItem userItem;

      /* Your code will be tested with GR_APPLES and other values for userItem */
      userItem = GroceryItem.GR_APPLES;

      /* Your solution goes here  */
      switch (userItem) {
      case GR_APPLES:
         System.out.println("Fruit");
         break;
      case GR_BANANAS:
         System.out.println("Fruit");
         break;
      case GR_JUICE:
         System.out.println("Drink");
         break;
      case GR_WATER:
         System.out.println("Drink");
         break;
      default:
        break;
      }

   }
}
