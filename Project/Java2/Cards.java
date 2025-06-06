//Stack Program
//Create a deck of cards using an array (Array size 14).  Each card is an object (Card class).  
//So you will have to create several Cards that are named (one - ten, Jack, Queen, King, Ace) and (Heart, Spade, Diamond, Clubs).  
//You will create a stack and randomly pick a card from the deck to put be pushed onto the stack.  You will repeat this 5 times.  
//Then you will take cards off the top of the stack (pop) and reveal the values of the cards in the output.

public class Cards {
    private String suits;
    private String name;

    public Cards(String suits, String name){
        this.suits=suits;
        this.name=name;
    }

    @Override
    public String toString() {
        return name + " of " + suits;
    }
}

import java.util.Random;
import java.util.Stack;

public class CardDemo {
    public static void main(String[] args) {
        //This defines my card name and suits in the array
        String[] name = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};

        //This will create the deck of 14 cards and randomize it
        Cards[] cards = new Cards[14];
        Random random = new Random();

        for (int i = 0; i < cards.length; i++ ){
            String suit = suits[random.nextInt(suits.length)];
            cards[i] = new Cards(name[i], suit);
        }

        //This uses stack to work like a deck of cards
        Stack <Cards> stack = new Stack<>();

        //This uses push to get 5 random cards onto the stack
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(cards.length);
            stack.push(cards[index]);
        }

        //This utilizes pop and displays the card
        System.out.println("The cards drawn from the deck are: ");
        while (!stack.isEmpty()) {
   	 Cards d = stack.pop();
   	 System.out.println(d);
	}

    }
}
