import java.util.Random;
    public class Die {
        //Field that can store a whole number value from 1 through 6
        private int dieOne;
        private int dieTwo;

        //Constructor that assigns a random valid value to a die object
        public Die (){
        Random randGen = new Random();
        dieOne = randGen.nextInt(6) + 1;
        dieTwo = randGen.nextInt(6) + 1;
    }
    //Instance method that will roll a die, assigning it a new valid value
    public void roll(){
        Random randGen = new Random();
        dieOne = randGen.nextInt(6) + 1;
        dieTwo = randGen.nextInt(6) + 1;
    }
    //Instance method that returns a die's value
    public int getDieOne() {
        return dieOne;
    }
    public int getDieTwo() {
        return dieTwo;
    }
}
