# Car Rental Console Application

This is a Java-based console application for managing a car rental service. It allows administrators to manage cars and customers, and users to rent and return cars.

## Features

### Admin Features
- Add a new car
- Add a new customer
- View all cars
- View all customers
- Remove a car
- Remove a customer

### User Features
- Rent a car
- Return a car

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or later
- A Java IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VSCode)

### Running the Application
1. Clone or download the repository to your local machine.
2. Open the project in your Java IDE or text editor.
3. Compile and run the `CarRentalConsoleApp` class.

### Sample Admin Credentials
- Admin Password: `admin`

### Sample Data
- Cars: 
  - Toyota Camry (2020)
  - Honda Accord (2019)
- Customers:
  - John Doe
  - Jane Smith

## Usage

1. **Admin Login:**
   - Enter `1` at the main menu.
   - Enter the admin password (`admin`).
   - Use the admin menu to manage cars and customers.

2. **User Menu:**
   - Enter `2` at the main menu.
   - Use the user menu to rent or return a car.

3. **Exit:**
   - Enter `3` at the main menu to exit the application.

## Classes and Methods

### `CarRentalConsoleApp`
- `main(String[] args)`: Entry point of the application.
- `adminMenu(RentalService rentalService, Scanner scanner)`: Admin menu operations.
- `userMenu(RentalService rentalService, Scanner scanner)`: User menu operations.

### `RentalService`
- `addCar(Car car)`: Adds a new car to the system.
- `addCustomer(Customer customer)`: Adds a new customer to the system.
- `rentCar(String carID, String customerID)`: Rents a car to a customer.
- `returnCar(String carID)`: Returns a rented car.
- `displayCars()`: Displays all cars.
- `displayCustomers()`: Displays all customers.
- `removeCar(String carID)`: Removes a car from the system.
- `removeCustomer(String customerID)`: Removes a customer from the system.

### `Rental`
- `Rental(String rentalID, String carID, String customerID)`: Constructor for creating a rental record.

### `Customer`
- `Customer(String customerID, String name)`: Constructor for creating a customer record.

### `Car`
- `Car(String carID, String brand, String model, int year)`: Constructor for creating a car record.
- `isAvailable()`: Checks if a car is available for rent.
- `setAvailable(boolean available)`: Sets the availability status of a car.

