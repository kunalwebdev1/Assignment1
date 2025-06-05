package Training;

// Book.java
// A program to catalog books in a bookstore and find the most expensive one

public class Book {

    // Attributes of the Book
    int id;
    String title;
    String author;
    double price;

    // Constructor to initialize book details
    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book ID   : " + id);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Price     : Rs. " + price);
        System.out.println("-----------------------------");
    }

    // Main method to catalog books and find the most expensive one
    public static void main(String[] args) {
        // Creating an array of 5 books
        Book[] books = new Book[5];
        books[0] = new Book(101, "The Alchemist", "Paulo Coelho", 399.00);
        books[1] = new Book(102, "Atomic Habits", "James Clear", 499.00);
        books[2] = new Book(103, "Ikigai", "Héctor García", 299.00);
        books[3] = new Book(104, "Rich Dad Poor Dad", "Robert Kiyosaki", 450.00);
        books[4] = new Book(105, "Sapiens", "Yuval Noah Harari", 699.00);

        // Display all book details
        System.out.println("Welcome to Bookworm's Paradise\n");
        for (Book b : books) {
            b.displayBookDetails();
        }

        // Finding the most expensive book
        Book mostExpensive = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].price > mostExpensive.price) {
                mostExpensive = books[i];
            }
        }

        // Displaying the most expensive book
        System.out.println("Most Expensive Treasure in the Store:");
        mostExpensive.displayBookDetails();
    }
}

