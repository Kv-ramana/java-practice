import java.util.*;
class Book {
    private String isbn;
    private String title;
    private int quantityInStock;

    public Book(String isbn, String title, int quantityInStock) {
        this.isbn = isbn;
        this.title = title;
        this.quantityInStock = quantityInStock;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
}

public class BookInventory {
  private HashMap<String, Book> bookInventory;
  public BookInventory() {
        this.bookInventory = new HashMap<>();
    }

    public void addBook(String isbn, String title, int quantityInStock) {
        Book book = new Book(isbn, title, quantityInStock);
        bookInventory.put(isbn, book);
        System.out.println("Book added to inventory successfully.");
    }

    public void updateStock(String isbn, int newQuantity) {
        if (bookInventory.containsKey(isbn)) {
            Book book = bookInventory.get(isbn);
            book.setQuantityInStock(newQuantity);
            System.out.println("Stock updated successfully.");
        } else {
            System.out.println("Book not found with the given ISBN.");
        }
    }
    public void removeBook(String isbn) {
        if (bookInventory.containsKey(isbn)) {
            bookInventory.remove(isbn);
            System.out.println("Book removed from inventory successfully.");
        } else {
            System.out.println("Book not found with the given ISBN.");
        }
    }

    public void searchBook(String isbn) {
        if (bookInventory.containsKey(isbn)) {
            Book book = bookInventory.get(isbn);
            System.out.println("Book found! Details:");
            System.out.println("ISBN " + book.getIsbn());
            System.out.println("Title " + book.getTitle());
            System.out.println("Quantity in Stock: " + book.getQuantityInStock());
        } else {
            System.out.println("Book not found with the given ISBN.");
        }
    }
    public void displayAllBooks() {
        if (bookInventory.isEmpty()) {
            System.out.println("No books in the inventory.");
        } else {
            System.out.println("Details of all books in the inventory:");
            for (Book book : bookInventory.values()) {
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Quantity in Stock: " + book.getQuantityInStock());

            }
        }
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     BookInventory b = new BookInventory();
     for(int i=0;i<3;i++) {
       b.addBook(sc.next(), sc.next(), sc.nextInt());
     }
         b.displayAllBooks();
           System.out.println("Searching for a book");
          b.searchBook(sc.next());
          System.out.println( "Updating stock");
          b.updateStock(sc.next(),sc.nextInt());
          System.out.println(" Removing a book");
          b.removeBook(sc.next());
         System.out.println(" Displaying all books after removal");
          b.displayAllBooks();
      }
  }