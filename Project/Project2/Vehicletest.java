import java.util.Scanner;
public class VehicleTest {
    private int year;
    private int miles;
    private double mpg;

    public void drive(int miles) {this.miles += miles;
    }
    public static void main (String[] args){
        Vehicle hondaCivic = new Vehicle();
        Vehicle nissanMaxima = new Vehicle();
        Scanner scnr = new Scanner(System.in);

        //set year of vehicles
        hondaCivic.setYear(2021);
        nissanMaxima.setYear(2020);
        //display results
        System.out.println("Honda Civic year is: " + hondaCivic.getYear());
        System.out.println("Nissan Maxima year is: " + nissanMaxima.getYear());
        //set miles of vehicles
        hondaCivic.setMiles(20000);
        nissanMaxima.setMiles(28000);
        //display results
        System.out.println("Honda Civic miles are: " + hondaCivic.getMiles());
        System.out.println("Nissan Maxima miles are: " + nissanMaxima.getMiles());
        //set mpg of vehicles
        hondaCivic.setMpg(30.0);
        nissanMaxima.setMpg(25.5);
        //display results
        System.out.println("Honda Civic mpg is: " + hondaCivic.getMpg());
        System.out.println("Nissan Maxima mpg is: " + nissanMaxima.getMpg());

        System.out.println("For Honda Civic please enter miles: " + miles);
        int miles = scnr.nextInt();

        hondaCivic.getMiles();
        hondaCivic.drive(miles);
        System.out.println("The new miles for Honda Civic is: " + hondaCivic.drive());

        System.out.println("For Nissan Maxima please enter miles: " + miles);
        miles = scnr.nextInt();


        nissanMaxima.getMiles();
        nissanMaxima.drive(90);
        System.out.println("The new miles for Honda Civic is: " + nissanMaxima.getMiles());
    }
}
