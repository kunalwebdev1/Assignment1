package Training;

// Rectangle.java
// Magical rectangles come alive with constructors and area calculation!

public class Rectangle {

    // Attributes for length and breadth
    int length;
    int breadth;

    // Default constructor (tiny 1x1 rectangle)
    public Rectangle() {
        this.length = 1;
        this.breadth = 1;
    }

    // Parameterized constructor for custom-size rectangles
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return area
    public int calculateArea() {
        return length * breadth;
    }

    // Method to display rectangle details
    public void displayDetails() {
        System.out.println("Rectangle Details:");
        System.out.println("Length : " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area   : " + calculateArea() + " sq units");
        System.out.println("-----------------------------");
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a tiny default rectangle
        Rectangle tinyRectangle = new Rectangle();

        // Creating a custom-designed rectangle
        Rectangle customRectangle = new Rectangle(7, 4);

        // Displaying both rectangles
        System.out.println("Welcome to the Magical Art Studio!\n");
        tinyRectangle.displayDetails();
        customRectangle.displayDetails();
    }
}