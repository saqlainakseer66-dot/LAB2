import java.util.Scanner;
public class StudentManage{
    static int[] roll = new int[50];
    static String[] name = new String[50];
    static int[] marks = new int[50];
    static int count = 0; // total students
    // Add Student
    public static void addStudent(int r, String n, int m) {
        roll[count] = r;
        name[count] = n;
        marks[count] = m;
        count++;
        System.out.println("Student added.");
    }
    //  Display All
    public static void displayAll() {
        if (count == 0) {
            System.out.println("No students yet.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("Roll: " + roll[i] +
                        " | Name: " + name[i] +
                        " | Marks: " + marks[i] +
                        " | Grade: " + grade(marks[i]));
            }
        }
    }
    // Search by Roll
    public static void search(int r) {
        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                System.out.println("Found: " + roll[i] + " " + name[i] + " " + marks[i]);
                return;
            }
        }
        System.out.println("Not found!");
    }
    // Search by Name
    public static void search(String n) {
        for (int i = 0; i < count; i++) {
            if (name[i].equalsIgnoreCase(n)) {
                System.out.println("Found: " + roll[i] + " " + name[i] + " " + marks[i]);
                return;
            }
        }
        System.out.println("Not found!");
    }
    //  Average
    public static double computeAverage(int[] m, int c) {
        if (c == 0) return 0;
        int sum = 0;
        for (int i = 0; i < c; i++) {
            sum += m[i];
        }
        return (double) sum / c;
    }
    //  Grade
    public static String grade(int m) {
        if (m >= 85) return "A";
        else if (m >= 70) return "B";
        else if (m >= 50) return "C";
        else return "F";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n==== MENU ====");
            System.out.println("1) Add Student");
            System.out.println("2) Display All");
            System.out.println("3) Search Student");
            System.out.println("4) Class Average & Topper");
            System.out.println("5) Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume enter
            if (choice == 1) {
                System.out.print("Enter Roll: ");
                int r = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String n = sc.nextLine();
                System.out.print("Enter Marks (0-100): ");
                int m = sc.nextInt();

                if (m < 0 || m > 100) {
                    System.out.println("Invalid marks. Try again.");
                    continue; // skip wrong input
                }
                addStudent(r, n, m);

            } else if (choice == 2) {
                displayAll();

            } else if (choice == 3) {
                System.out.println("1) Search by Roll");
                System.out.println("2) Search by Name");
                int opt = sc.nextInt();
                sc.nextLine();
                if (opt == 1) {
                    System.out.print("Enter Roll: ");
                    int r = sc.nextInt();
                    search(r);
                } else if (opt == 2) {
                    System.out.print("Enter Name: ");
                    String n = sc.nextLine();
                    search(n);
                } else {
                    System.out.println("Invalid option.");
                }
            } else if (choice == 4) {
                double avg = computeAverage(marks, count);
                System.out.println("Class Average: " + avg);
                // find topper
                if (count > 0) {
                    int maxIndex = 0;
                    for (int i = 1; i < count; i++) {
                        if (marks[i] > marks[maxIndex]) {
                            maxIndex = i;
                        }
                    }
                    System.out.println("Topper: " + name[maxIndex] +
                            " (" + marks[maxIndex] + ")");
                }
            } else if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice.");
                continue;
            }
        }
        sc.close();
    }
}
