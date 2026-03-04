import java.util.ArrayList;

public class Admin {


    private ArrayList<Student> students;


    public Admin() {
        students = new ArrayList<>();
    }


    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added");
    }


    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Students list is empty");
        } else {
            for (Student student : students) {
                System.out.println("ID: " + student.getId());
            }
        }
    }


    public Student searchById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }


    public void delete(int id) {
        Student student = searchById(id);

        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted");
        } else {
            System.out.println("Student not found");
        }
    }
}
