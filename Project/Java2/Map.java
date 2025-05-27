//Map Program
//In this program, you will design a program that acts as an electronic address book.
//This program must do the following:
    //Allow the user to add addresses to the address book.
    //Allow the user to remove addresses from the address book.
    //Allow the user to see how many addresses are in the book.
    //Allow the user to list all addresses in the book.
    //Allow the user to find an address by last name.
//Process:
    //Design an Address class to hold address information.
    //Design an AddressBook class that has a Collection of Address objects.  It should also have methods to do the following:
        //Add an address
        //Remove and address
        //Find an address by last name
        //Return a count of Addresses in the AddressBook
        //Return all of the Addresses in the AddressBook
    //Design a AddressBookController class.  This class should do the following:
        //Handle all the interaction with the user.
        //Create the ConsoleIO class to handle the all console input and output.
        //Use the AddressBook class to store Address objects.

public class Addresses {
    private String fName;
    private String lName;
    private String street;
    private String city;
    private String state;
    private String zip;

    public Addresses(String fName, String lName, String street, String city, String state, String zip) {
        this.fName = fName;
        this.lName = lName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public String getlName() {
        return lName;
    }

    @Override
    public String toString() {
        return fName + " " + lName + " " + street + "\n " + city + ", " + state + " " + zip;
    }
}

import java.util.*;

public class AddressBook {
    private List<Addresses> addresses;

    public AddressBook() {
        this.addresses = new ArrayList<>();
    }

    public void addAddress(Addresses address) {
        addresses.add(address);
    }

    public boolean removeAddress(String lName) {
        return addresses.removeIf(addr -> addr.getlName().equalsIgnoreCase(lName));
    }

    public Addresses findAddressByLastName(String lName) {
        for (Addresses addr : addresses) {
            if (addr.getlName().equalsIgnoreCase(lName)) {
                return addr;
            }
        }
        return null;
    }
    public int getAddressCount() {
        return addresses.size();
    }
    public List<Addresses> getAddresses() {
        return new ArrayList<>(addresses);
    }
}

import java.util.Scanner;

public class Console {
    private Scanner s;

    public Console() {
        s = new Scanner(System.in);
    }

    public String readLine(String prompt) {
        System.out.print(prompt);
        return s.nextLine();
    }

    public void print(String prompt) {
        System.out.println(prompt);
    }

}

public class AddressBookGuide {
    private AddressBook addressBook;
    private Console console;

    public AddressBookGuide() {
        addressBook = new AddressBook();
        console = new Console();
    }

    public void display() {
        boolean displaying = true;
        while (displaying) {
        console.print(" Address Book Menu: ");
        console.print("1. Add Address");
        console.print("2. Delete Address");
        console.print("3. Find Addresses by Last Name");
        console.print("4. List Address Count");
        console.print("5. List all Addresses");

        String choice = console.readLine("Enter your choice: ");
        switch (choice) {
            case "1":
                addAddress();
                break;
            case "2":
                removeAddress();
                break;
            case "3":
               findAddressByLastName();
               break;
            case "4":
                console.print("Total Number of Addresses: " + addressBook.getAddressCount());
                break;
            case "5":
                listAllAddresses();
                break;
            case "6":
                displaying = false;
                break;
            default:
                console.print("Invalid Choice");

            }
        }
    }
    private void addAddress() {
        String fName = console.readLine("First name: ");
        String lName = console.readLine("Last name: ");
        String street = console.readLine("Street: ");
        String city = console.readLine("City: ");
        String state = console.readLine("State: ");
        String zip = console.readLine("Zip code: ");

        Addresses address = new Addresses(fName, lName, street, city, state, zip);
        addressBook.addAddress(address);
        console.print("Address created");
    }
    private void removeAddress() {
        String lastName = console.readLine("Enter Last name to remove: ");
        boolean removed = addressBook.removeAddress(lastName);
        if (removed) {
            console.print("Address removed");
        }
        else {
            console.print("Address not found");
        }
    }
    private void listAllAddresses() {
        for ( Addresses a : addressBook.getAddresses()) {
            console.print(a.toString());
            console.print("\n");
        }
    }
    private void findAddressByLastName() {
        String lName = console.readLine("Enter last name: ");
        Addresses found = addressBook.findAddressByLastName(lName);
        if (found != null) {
            console.print("Address Found:\n " + found.toString());
        }
        else {
            console.print("Address not found");
        }
    }
    public static void main(String[] args) {

    AddressBookGuide a = new AddressBookGuide();
    a.display();
    }
}
