import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // Store session logs in memory during runtime using ArrayList
        ArrayList<String> sessions = new ArrayList<>();

        System.out.println("Welcome to the Music Practice Tracker!");
        System.out.println("Display Main Menu:");

        // Keep the loop running until user chooses to exit (choice 3)
        while (choice != 3) {
            System.out.println("1. Log Practice");
            System.out.println("2. View Summary");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            // Read the entire line so that hitting enter
            // doesn't cause the program to hang
            String input = scanner.nextLine();
            
            // Try to convert the input to an integer safely
            // without crashing the program
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number (1, 2, or 3).");
                continue;  // Skip the rest of the while loop and show the main menu again
            }   

            if (choice == 1) {
                System.out.println("Enter instrument: ");
                String instrument = scanner.nextLine();

                int minutes = -1;
                while (minutes < 0) {
                    System.out.println("Enter practice time (minutes): ");
                    // Read minutes as a string in case the user gives letters or just hits enter as input
                    String minutesInput = scanner.nextLine();

                    // Try to convert minutesInput into an integer safely without crashing the program
                    try {
                        minutes = Integer.parseInt(minutesInput);

                        // Check if the user put in a negative number (edge-case)
                        if (minutes < 0) {
                            System.out.println("Please enter a positive number for minutes spent practicing.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                }

                // Format it this way so that we can use split(",")
                // to break the instrument and practice (in minutes) 
                // data to caculate the summary statistics
                String sessionEntry = instrument + "," + minutes;
                sessions.add(sessionEntry);

                System.out.println("Session saved successfully!");
            } else if (choice == 2) {
                System.out.println("This feature will be coming soon!");
            } else if (choice == 3) {
                System.out.println("Thank you for choosing the Music Practice Tracker!");
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
        scanner.close();
    }
}