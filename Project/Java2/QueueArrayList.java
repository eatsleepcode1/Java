//Queue and ArrayList Program
//There is a new concert coming to town.  This concert is popular and has a long line.  The line uses the data structure Queue.  
//The people in the line are Objects (Person class).  Person object has a name and ticket number.  
//Create 7 people and randomly add them to the line.  Create 7 random ticket numbers and add them to an ArrayList.  
//As each person is dequeued from the line, they are assigned a ticket number(Use print statements to print the name and their assigned ticket number).  
//Print each person being dequeued from the line (name and ticket number).

public class Persons {
    private String name;
    private int tNumber;

    public Persons (String name) {
        this.name = name;
    }
    public void settNumber(int tNumber) {
        this.tNumber = tNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Ticket number: " + tNumber;
    }
}

import java.util.* ;
public class Concert {
    public static void main(String[] args) {
        //Create 7 people
        String[] names = {"Captain America", "Falcon", "Black Widow", "Black Panther", "Thor", "Captain Marvel", "Wasp"};

        //Create the names as objects for array
        List<Persons> concertgoers = new ArrayList<>();
        for (String name : names) {
            concertgoers.add(new Persons(name));
        }

        //Shuffle people to randomly add them to the queue
        Collections.shuffle(concertgoers);
        Queue<Persons> queue = new LinkedList<>(concertgoers);

        //Create 7 unique ticket numbers
        List<Integer> tNumbers = new ArrayList<>();
        Random random = new Random();
        while (tNumbers.size() < 7){
            int tickets = 1 + random.nextInt(1000);//This creates ticket numbers 1 to 1000
            if (!tNumbers.contains(tickets)) {
                tNumbers.add(tickets);
            }
        }
        //Shuffle ticket numbers
        Collections.shuffle(tNumbers);

        //Dequeue each person and add ticket
        System.out.println("In the concert line is: ");
        for (int i = 0; i < 7; i++) {
            Persons persons = queue.poll();
            int t = tNumbers.get(i);
            persons.settNumber(t);
            System.out.println(persons);
        }
    }
}
