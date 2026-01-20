package ClassAndObject.Class_and_Object;
public class Book {
    String title;
    String author;
    int price;

    public Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void DisplayDetails() {
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Price:" + price);
    }

    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", 45);

        book.DisplayDetails();
    }
}