package studentapp;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Student Management Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayAll(); break;
                case 3: searchStudent(); break;
                case 4: updateStudent(); break;
                case 5: deleteStudent(); break;
                case 6: System.out.println("Exit!"); System.exit(0);
                default: System.out.println("Invalid choice");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter Roll No: ");
        int rollno = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Year: ");
        String year = sc.nextLine();
        System.out.print("Enter Grade: ");
        int grade = sc.nextInt(); sc.nextLine();

        Student s = new Student(rollno, name, year, grade);
        students.add(s);
        System.out.println(" Student added successfully!");
        System.out.println("Press Enter to continue...");
        sc.nextLine();
    }

    static void displayAll() {
        if (students.isEmpty()) {
            System.out.println(" No students available.");
        } else {
            for (Student s : students) {
                s.display();
            }
        }
        System.out.println("Press Enter to continue...");
        sc.nextLine();
    }

    static void searchStudent() {
        System.out.print("Enter Roll No to search: ");
        int roll = sc.nextInt(); sc.nextLine();
        for (Student s : students) {
            if (s.getRollno() == roll) {
                s.display();
                System.out.println("Press Enter to continue...");
                sc.nextLine();
                return;
            }
        }
        System.out.println(" Student not found.");
        System.out.println("Press Enter to continue...");
        sc.nextLine();
    }

    static void updateStudent() {
        System.out.print("Enter Roll No to update: ");
        int roll = sc.nextInt(); sc.nextLine();
        for (Student s : students) {
            if (s.getRollno() == roll) {
                System.out.print("New Name: ");
                s.setName(sc.nextLine());
                System.out.print("New Year: ");
                s.setYear(sc.nextLine());
                System.out.print("New Grade: ");
                s.setGrade(sc.nextInt()); sc.nextLine();
                System.out.println(" Student updated!");
                System.out.println("Press Enter to continue...");
                sc.nextLine();
                return;
            }
        }
        System.out.println(" Student not found.");
        System.out.println("Press Enter to continue...");
        sc.nextLine();
    }

    static void deleteStudent() {
        System.out.print("Enter Roll No to delete: ");
        int roll = sc.nextInt(); sc.nextLine();

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            if (it.next().getRollno() == roll) {
                it.remove();
                System.out.println(" Student deleted.");
                System.out.println("Press Enter to continue...");
                sc.nextLine();
                return;
            }
        }

        System.out.println(" Student not found.");
        System.out.println("Press Enter to continue...");
        sc.nextLine();
    }
}
