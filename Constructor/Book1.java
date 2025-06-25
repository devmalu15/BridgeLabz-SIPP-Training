package Constructor;
class Book {
    public String ISBN;
    protected String title;
    private String author;

    

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);

    }
}

public class Book1 {
    public static void main(String[] args) {
        EBook ebook = new EBook();
        ebook.ISBN = "978-3-16-148410-0";
        ebook.title = "Effective Java";
        ebook.setAuthor("Joshua Bloch");

        ebook.displayDetails();
        System.out.println("Author: " + ebook.getAuthor());
    }
}