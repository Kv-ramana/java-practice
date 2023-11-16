import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int rollNumber;
    private String name;
    private double marks;

    public Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Marks: " + marks;
    }
}

public class StudentDataManagement {
    private ArrayList<Student> students;

    public StudentDataManagement() {
        this.students = new ArrayList<>();
    }

    public void addStudent(int rollNumber, String name, double marks) {
        Student student = new Student(rollNumber, name, marks);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void removeStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                students.remove(student);
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("Details of all students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("Student details:");
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDataManagement studentDataManagement = new StudentDataManagement();

        studentDataManagement.addStudent(1, "venky", 80);
        studentDataManagement.addStudent(2, "sai", 92.0);
        studentDataManagement.addStudent(3, "vv", 75);

        studentDataManagement.displayAllStudents();

        System.out.println("Enter the roll number to search:");
        int searchRollNumber = sc.nextInt();
        studentDataManagement.searchStudent(searchRollNumber);

        System.out.println("Enter the roll number to remove:");
        int removeRollNumber = sc.nextInt();
        studentDataManagement.removeStudent(removeRollNumber);

        studentDataManagement.displayAllStudents();
    }
}
