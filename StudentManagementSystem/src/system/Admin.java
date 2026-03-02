package system;

import java.util.ArrayList;

public class Admin {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    public void deleteStudent(int id) {
        for (Student s : students) {
            if (s.id == id) {
                students.remove(s);
                System.out.println("Student deleted!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void updateGrade(int id, double newGrade) {
        for (Student s : students) {
            if (s.id == id) {
                s.grade = newGrade;
                System.out.println("Grade updated!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}