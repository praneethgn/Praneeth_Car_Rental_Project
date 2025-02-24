package cars;

import java.util.Scanner;

public class CarRentalConsoleApp {
    private static boolean isAdmin;

    public static void main(String[] args) {
        RentalService rentalService = new RentalService();
        rentalService.addCar(new Car("1", "Toyota", "Camry", 2020));
        rentalService.addCar(new Car("2", "Honda", "Accord", 2019));
        rentalService.addCustomer(new Customer("101", "John Doe"));
        rentalService.addCustomer(new Customer("102", "Jane Smith"));

        Scanner scanner = new Scanner(System.in);
        isAdmin = false;

        while (true) {
            System.out.println("1. Admin Login");
            System.out.println("2. User Menu");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter admin password: ");
                    String password = scanner.next();
                    if (password.equals("admin")) {
                        isAdmin = true;
                        adminMenu(rentalService, scanner);
                    } else {
                        System.out.println("Incorrect password.");
                    }
                    break;
                case 2:
                    userMenu(rentalService, scanner);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void adminMenu(RentalService rentalService, Scanner scanner) {
        while (true) {
            System.out.println("Admin Menu:");
            System.out.println("1. Add Car");
            System.out.println("2. Add Customer");
            System.out.println("3. View Cars");
            System.out.println("4. View Customers");
            System.out.println("5. Remove Car");
            System.out.println("6. Remove Customer");
            System.out.println("7. View Rental Status");
            System.out.println("8. View Rental History"); // Add this line
            System.out.println("9. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Car ID: ");
                    String carID = scanner.next();
                    System.out.print("Enter Brand: ");
                    String brand = scanner.next();
                    System.out.print("Enter Model: ");
                    String model = scanner.next();
                    System.out.print("Enter Year: ");
                    int year = scanner.nextInt();
                    rentalService.addCar(new Car(carID, brand, model, year));
                    System.out.println("Car added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Customer ID: ");
                    String customerID = scanner.next();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    rentalService.addCustomer(new Customer(customerID, name));
                    System.out.println("Customer added successfully!");
                    break;
                case 3:
                    rentalService.displayCars();
                    break;
                case 4:
                    rentalService.displayCustomers();
                    break;
                case 5:
                    System.out.print("Enter Car ID: ");
                    carID = scanner.next();
                    rentalService.removeCar(carID);
                    break;
                case 6:
                    System.out.print("Enter Customer ID: ");
                    customerID = scanner.next();
                    rentalService.removeCustomer(customerID);
                    break;
                case 7:
                    rentalService.displayRentalStatus();
                    break;
                case 8: // Add this case
                    rentalService.displayRentalHistory();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void userMenu(RentalService rentalService, Scanner scanner) {
        while (true) {
            System.out.println("User Menu:");
            System.out.println("1. Rent Car");
            System.out.println("2. Return Car");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Car ID: ");
                    String carID = scanner.next();
                    System.out.print("Enter Customer ID: ");
                    String customerID = scanner.next();
                    System.out.print("Enter the Date dd/mm/yyyy: ");
                    String Date = scanner.next();
                    rentalService.rentCar(carID, customerID,Date);
                    break;
                case 2:
                    System.out.print("Enter Car ID: ");
                    carID = scanner.next();
                    rentalService.returnCar(carID);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
