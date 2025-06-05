package Training;

// Student.java
// A mini digital roll call system using class and constructor

// Class to represent a Student
public class Student {

    // Attributes of each student
    int rollNumber;
    String name;
    float marks;

    // Constructor to initialize the student
    public Student(int rollNumber, String name, float marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    // Method to print student details like a report card
    public void displayStudentDetails() {
        System.out.println("📚 Report Card 📚");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks + "/100");
        System.out.println("----------------------------");
    }

    // Main method – the teacher starts the roll call here
    public static void main(String[] args) {
        // Creating student objects using constructor
        Student student1 = new Student(1, "Shivam Chaudhary", 94.5f);
        Student student2 = new Student(2, "Kunal Maheshwari", 89.0f);

        // Displaying student details
        System.out.println("Welcome to the Class Roster!\n");
        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }
}
