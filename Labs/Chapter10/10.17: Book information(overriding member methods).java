/*Given main() and a base Book class, define a derived class called Encyclopedia with member methods to get and set private fields of the following types:
    String to store the edition
    int to store the number of pages
Within the derived Encyclopedia class, define a printInfo() method that overrides the Book class' printInfo() method by 
printing the title, author, publisher, publication date, edition, and number of pages.
Ex. If the input is:
The Hobbit
J. R. R. Tolkien
George Allen & Unwin
21 September 1937
The Illustrated Encyclopedia of the Universe
Ian Ridpath
Watson-Guptill
2001
2nd
384
the output is:
Book Information: 
   Book Title: The Hobbit
   Author: J. R. R. Tolkien
   Publisher: George Allen & Unwin
   Publication Date: 21 September 1937
Book Information: 
   Book Title: The Illustrated Encyclopedia of the Universe
   Author: Ian Ridpath
   Publisher: Watson-Guptill
   Publication Date: 2001
   Edition: 2nd
   Number of Pages: 384*/
public class Book {

   protected String title;
   protected String author;
   protected String publisher;
   protected String publicationDate;

   public void setTitle(String userTitle) {
      title = userTitle;
   }

   public String getTitle() {
      return title;
   }

   public void setAuthor(String userAuthor) {
      author = userAuthor;
   }

   public String getAuthor(){
      return author;
   }

   public void setPublisher(String userPublisher) {
      publisher = userPublisher;
   }

   public String getPublisher() {
      return publisher;
   }

   public void setPublicationDate(String userPublicationDate) {
      publicationDate = userPublicationDate;
   }

   public String getPublicationDate() {
      return publicationDate;
   }

   public void printInfo() {
      System.out.println("Book Information: ");
      System.out.println("   Book Title: " + title);
      System.out.println("   Author: " + author);
      System.out.println("   Publisher: " + publisher);
      System.out.println("   Publication Date: " + publicationDate);
   }
}
public class Encyclopedia extends Book {
   // TODO: Declare private fields
   private String edition;
   private int numPages;
   
   // TODO: Define mutator methods - 
   //       setEdition(), setNumPages()
   public void setEdition(String edition){
      this.edition = edition;
      }
   public void setNumPages(int numPages){
      this.numPages = numPages;
      }
  
   // TODO: Define accessor methods -
   //       getEdition(), getNumPages()
   public String getEdition(){
      return edition;
      }
   public int getNumPages(){
      return numPages;
      }
   
   // TODO: Define a printInfo() method that overrides 
   //       the printInfo in Book class 
   @Override
   public void printInfo(){
      super.printInfo();
      System.out.println("   Edition: " + edition);
      System.out.println("   Number of Pages: " + numPages);
      }
}
import java.util.Scanner;

public class BookInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Book myBook = new Book();
      Encyclopedia myEncyclopedia = new Encyclopedia();

      String title, author, publisher, publicationDate;
      String eTitle, eAuthor, ePublisher, ePublicationDate, edition;
      int numPages;

      title = scnr.nextLine();
      author = scnr.nextLine();
      publisher = scnr.nextLine();
      publicationDate = scnr.nextLine();

      eTitle = scnr.nextLine();
      eAuthor = scnr.nextLine();
      ePublisher = scnr.nextLine();
      ePublicationDate = scnr.nextLine();
      edition = scnr.nextLine();
      numPages = scnr.nextInt();

      myBook.setTitle(title);
      myBook.setAuthor(author);
      myBook.setPublisher(publisher);
      myBook.setPublicationDate(publicationDate);
      myBook.printInfo();

      myEncyclopedia.setTitle(eTitle);
      myEncyclopedia.setAuthor(eAuthor);
      myEncyclopedia.setPublisher(ePublisher);
      myEncyclopedia.setPublicationDate(ePublicationDate);
      myEncyclopedia.setEdition(edition);
      myEncyclopedia.setNumPages(numPages);
      myEncyclopedia.printInfo();
    }
}
