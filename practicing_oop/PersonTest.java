import java.util.ArrayList;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> personList = new ArrayList<>();

        int choice;

        do {
            System.out.println("Main Menu:");
            System.out.println("1. Create new data");
            System.out.println("2. View all data");
            System.out.println("0. Close app");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter surname: ");
                    String surname = scanner.next();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.next();

                    Person newPerson = new Person(name, surname, age, phoneNumber);
                    personList.add(newPerson);

                    System.out.println("Data created successfully!");
                    break;
                case 2:
                    if (personList.isEmpty()) {
                        System.out.println("No data available.");
                    } else {
                        System.out.println("All Data:");
                        for (Person person : personList) {
                            System.out.println("Name: " + person.name + ", Surname: " + person.surname +
                                    ", Age: " + person.age + ", Phone Number: " + person.phoneNumber);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Closing app. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);
    }
}
