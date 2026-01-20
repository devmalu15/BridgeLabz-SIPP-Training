package Constructor;
class Book2 {
    String title;
    String author;
    double price;

    // Default constructor
    public Book2() {
        title = "rich dad poor dad";
        author = "Robert Kiyosaki";
        price = 500.0;
    }

    // Parameterized constructor
    public Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
