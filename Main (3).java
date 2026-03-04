
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin(); 
        boolean running = true; 

        while (running) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1- Add Student");
            System.out.println("2- View Students");
            System.out.println("3- Delete Student");
            System.out.println("4- Update Grade");
            System.out.println("5- Exit");
            System.out.print("Choose: ");

            if (input.hasNextInt()) {
                int choice = input.nextInt();
                input.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = input.nextInt();
                        input.nextLine(); 
                        System.out.print("Enter Name: ");
                        String name = input.nextLine();
                        admin.addStudent(id, name);
                        break;
                    case 2:
                        admin.viewStudents();
                        break;
                    case 3:
                        System.out.print("Enter ID to delete: ");
                        int delId = input.nextInt();
                        admin.deleteStudent(delId);
                        break;
                    case 4:
                        System.out.print("Enter ID: ");
                        int upId = input.nextInt();
                        System.out.print("Enter New Grade: ");
                        double grade = input.nextDouble();
                        admin.updateGrade(upId, grade);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            } else {
                System.out.println("Please enter a number.");
                input.next();
            }
        }
        input.close();
    }
}