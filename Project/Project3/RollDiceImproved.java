public class RollDice {
    public static void main(String[] args) {

        int sumDie;
        int diceRemainder;


        //	instantiates two distinct Die objects
        Die dice1 = new Die();
        Die dice2 = new Die();


        //	rolls the two dice
        dice1.roll();
        dice2.roll();

        //	computes the sum of the two dice being rolled
        sumDie = dice1.getDieOne() + dice2.getDieTwo();

        //display to screen
        //what each Die rolled
        System.out.println("You rolled a " + dice1.getDieOne() + " and a " + dice2.getDieTwo());

        //whether the two dice rolled the same number
        if (dice1.getDieOne() == dice2.getDieTwo()){
            System.out.println("The two dice rolled the same number!");
        }
        else {System.out.println("The two dice did not roll the same number.");
        }

        //the sum of the two dice
        System.out.println("The sum of the two dice is " + sumDie);

        //whether the sum is odd or even
        diceRemainder = sumDie % 2;
        if (diceRemainder == 0) {
                 System.out.println(sumDie + " is even.");
          }
        else {
                System.out.println(sumDie + " is odd.");
           }


    }
}
