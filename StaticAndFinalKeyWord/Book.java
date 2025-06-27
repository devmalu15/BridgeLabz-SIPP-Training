public class Book {
    private static String libraryName;

    String title;
    String author;
    final int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);

    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title:" + title);
            System.out.println("Author:" + author);
            System.out.println("ISBN:" + isbn);
        } else {
            System.out.println("This is not a Book instance.");
        }
    }

    public static void main(String[] args) {
        libraryName = "City Library";
        Book.displayLibraryName();

        Book book1 = new Book("1984", "George Orwell", 123456);
        book1.displayDetails();

        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 789012);
        book2.displayDetails();
    }
}