
import java.util.ArrayList;

public class Admin {
    private ArrayList<Student> students;

    public Admin() {
        this.students = new ArrayList<>();
    }

    
    public void addStudent(int id, String name) {
        students.add(new Student(id, name));
        System.out.println("Student added successfully!");
    }

    
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                s.displayInfo();
            }
        }
    }

    
    public void deleteStudent(int id) {
        boolean removed = students.removeIf(s -> s.getId() == id);
        if (removed) {
            System.out.println("Student with ID " + id + " deleted.");
        } else {
            System.out.println("Student ID not found.");
        }
    }

    
    public void updateGrade(int id, double newGrade) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setGrade(newGrade);
                System.out.println("Grade updated successfully!");
                return;
            }
        }
        System.out.println("Student ID not found.");
    }
}