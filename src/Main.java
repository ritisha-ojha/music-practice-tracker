import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("Welcome to the Music Practice Tracker!");
            System.out.println("1. Log Practice");
            System.out.println("2. View Summary");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.println("This feature will be coming soon!");
                } else if (choice == 2) {
                    System.out.println("This feature will be coming soon!");
                } else if (choice == 3) {
                    System.out.println("Thank you for choosing the Music Practice Tracker!");
                } else {
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
        }
        scanner.close();
    }
}