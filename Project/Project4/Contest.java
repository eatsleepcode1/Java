import java.util.Random;
import java.util.Scanner;

public class Contest {//class 2
    String[] selection = new String[Entrants.PRIZE];
    String[] name = new String[Entrants.PRIZE1];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] name = new String[Entrants.PRIZE];
        String[] email = new String[Entrants.PRIZE1];
        int e = 0;

        System.out.println("Please enter the contestants information below: ");
        for (int i = 0; i < name.length; i++){
            System.out.print("Name: ");
            name[i] = input.nextLine();
            System.out.print("Please enter contestants email address: ");
            email[e] = input.nextLine();
            System.out.print("Please enter the number JDK version contestant likes: ");
            email[e] = input.nextLine();

        }
        Random rand = new Random();
        int s = rand.nextInt(Entrants.PRIZE);
        System.out.println("The winner is" + " " + name[s] + "!" + " Congratulations!");
    }
}
