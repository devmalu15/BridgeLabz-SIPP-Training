import java.util.ArrayList;

class Book {
    // This class represents a book with a title and an author
    private String title;
    private String author;

    // Constructor to initialize the book's title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;

    }

    public void displayBook() {
        System.out.println("Title:" + title + ", Author:" + author);
    }
}

public class Library {
    private String name;
    private ArrayList<Book> books;// Initialize the books list

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayLibrary() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayBook();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("The Alchemist", "Paulo Coelho");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Create libraries
        Library cityLibrary = new Library("City Library");
        Library schoolLibrary = new Library("School Library");

        // Add books to libraries
        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        schoolLibrary.addBook(book2); // shared book
        schoolLibrary.addBook(book3);

        // Display books in each library
        cityLibrary.displayLibrary();
        schoolLibrary.displayLibrary();
    }
}