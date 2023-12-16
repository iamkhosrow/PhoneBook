import java.util.Scanner;

public class PhoneBookApp {
    private static PhoneBookApp phoneBook = new PhoneBookApp();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    displayContacts();
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 3);
    }

    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add Contact");
        System.out.println("2. Display Contacts");
        System.out.println("3. Exit");
    }

    private static void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        Contact newContact = new Contact(name, phoneNumber);
        phoneBook.addContact(newContact);

        System.out.println("Contact added successfully!");
    }

    private static void displayContacts() {
        System.out.println("\nAll Contacts:");
        phoneBook.displayContacts();
    }
}