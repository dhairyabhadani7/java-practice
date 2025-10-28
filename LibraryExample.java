package JavaPractice;

import java.util.HashMap;
import java.util.Map;

class Book{
    private String isbn;
    private String title;
    private String author;
    private double price;

    public Book(String isbn, String title, String author, double price){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void displayBookDetails(){
        System.out.println("ISBN: "+isbn+", title: "+title+", Author: "+author+", Price: "+price);
    }

}
public class LibraryExample {
    public static void main(String[] args) {
        Map<String, Book> library=new HashMap<>();

        // Add books
        library.put("ISBN101", new Book("ISBN101", "Atomic Habits", "James Clear", 450.50));
        library.put("ISBN102", new Book("ISBN102", "Clean Code", "Robert Martin", 799.99));
        library.put("ISBN103", new Book("ISBN103", "Java: The Complete Reference", "Herbert Schildt", 999.00));

        //print all books
        System.out.println("Library Books:");
        for(Map.Entry<String,Book> entry: library.entrySet()){
         System.out.println("Key: "+entry.getKey()+" -> ");
         entry.getValue().displayBookDetails();
        }

        System.out.println("--------------------------------");

        //Fetch book by isbn
        String isbnToFind = "ISBN102";
        if(library.containsKey(isbnToFind)){
            System.out.println("Book found for ISBN " + isbnToFind + ":");
            library.get(isbnToFind).displayBookDetails();
        }
        else{
           System.out.println("Book not found!");
        }

        //Remove a book
        library.remove("ISBN103");
        System.out.println("After removing ISBN103:");
        for (Map.Entry<String, Book> entry : library.entrySet()) {
            entry.getValue().displayBookDetails();
        }

        System.out.println("------------------------------");
        // Print totoal number of books

        System.out.println("Total number of books are: "+ library.size());
    }
}
