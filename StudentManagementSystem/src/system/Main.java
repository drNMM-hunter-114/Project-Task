package system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Admin admin = new Admin();

        boolean running = true;

        while (running) {

            System.out.println("===== Student Management System =====");
            System.out.println("1- Add Student");
            System.out.println("2- View Students");
            System.out.println("3- Delete Student");
            System.out.println("4- Update Grade");
            System.out.println("5- Exit");
            System.out.print("Choose: ");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = input.next();
                    System.out.print("Enter ID: ");
                    int id = input.nextInt();
                    System.out.print("Enter Grade: ");
                    double grade = input.nextDouble();

                    Student s = new Student(name, id, grade);
                    admin.addStudent(s);
                    break;

                case 2:
                    admin.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = input.nextInt();
                    admin.deleteStudent(deleteId);
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int updateId = input.nextInt();
                    System.out.print("Enter new Grade: ");
                    double newGrade = input.nextDouble();
                    admin.updateGrade(updateId, newGrade);
                    break;

                case 5:
                    running = false;
                    System.out.println("Program closed.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}