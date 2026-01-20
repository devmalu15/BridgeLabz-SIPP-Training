import java.util.ArrayList;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Setters
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

interface Reservable {
    void reserveItem(String borrowerName);

    boolean checkAvailability();
}

// Book subclass
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrowerName;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println("Book reserved for " + maskBorrowerName());
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    private String maskBorrowerName() {
        if (borrowerName != null && borrowerName.length() >= 3)
            return borrowerName.substring(0, 1) + "**";
        else
            return "**";
    }
}

// Magazine subclass
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrowerName;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println("Magazine reserved for " + maskBorrowerName());
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    private String maskBorrowerName() {
        if (borrowerName != null && borrowerName.length() >= 3)
            return borrowerName.substring(0, 1) + "**";
        else
            return "**";
    }
}

// DVD subclass
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrowerName;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println("DVD reserved for " + maskBorrowerName());
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    private String maskBorrowerName() {
        if (borrowerName != null && borrowerName.length() >= 3)
            return borrowerName.substring(0, 1) + "**";
        else
            return "**";
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();

        libraryItems.add(new Book("B001", "Java Programming", "James Gosling"));
        libraryItems.add(new Magazine("M001", "National Geographic", "NatGeo Editors"));
        libraryItems.add(new DVD("D001", "Interstellar", "Christopher Nolan"));

        // Demonstrate polymorphism
        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println("Loan duration (days): " + item.getLoanDuration());

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                reservable.reserveItem("John Doe");
                System.out.println("Is available: " + reservable.checkAvailability());
            }

            System.out.println("----------------------------");
        }
    }
}
