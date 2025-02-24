package cars;

import java.util.ArrayList;
import java.util.List;

public class RentalService {
    private List<Car> cars = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>();
    private List<Rental> rentalHistory = new ArrayList<>(); // Add this line
    private int rentalCounter = 0;

    // Methods to add car, customer, rental, and manage rentals
    public void addCar(Car car) {
        cars.add(car);
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void rentCar(String carID, String customerID,String Date) {
        Car car = findCarByID(carID);
        if (car != null && car.isAvailable()) {
            car.setAvailable(false);
            Rental rental = new Rental(String.valueOf(++rentalCounter), carID, customerID,Date);
            rentals.add(rental);
            rentalHistory.add(rental); // Add this line
            System.out.println("Car rented successfully!");
        } else {
            System.out.println("Car is not available for rent.");
        }
    }
    public void returnCar(String carID) {
        Car car = findCarByID(carID);
        if (car != null && !car.isAvailable()) {
            car.setAvailable(true);
            System.out.println("Car returned successfully!");
        } else {
            System.out.println("Car was not rented.");
        }
    }
    public void displayCars() {
        for (Car car : cars) {
            System.out.println(car.getCarID() + ": " + car);
        }
    }
    public void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer.getCustomerID() + ": " + customer);
        }
    }

    public void removeCar(String carID) {
        Car car = findCarByID(carID);
        if (car != null) {
            cars.remove(car);
            System.out.println("Car removed successfully!");
        } else {
            System.out.println("Car not found.");
        }
    }

    private Car findCarByID(String carID) {
        for (Car car : cars) {
            if (car.getCarID().equals(carID)) {
                return car;
            }
        }
        return null;
    }

    public void removeCustomer(String customerID) {
        Customer customer = findCustomerByID(customerID);
        if (customer != null) {
            customers.remove(customer);
            System.out.println("Customer removed successfully!");
        } else {
            System.out.println("Customer not found.");
        }
    }

    private Customer findCustomerByID(String customerID) {
        for (Customer customer : customers) {
            if (customer.getCustomerID().equals(customerID)) {
                return customer;
            }
        }
        return null;
    }

    public void displayRentalStatus() {
        for (Rental rental : rentals) {
            System.out.println("Rental ID: " + rental.getRentalID() +
                               ", Car ID: " + rental.getCarID() +
                               ", Customer ID: " + rental.getCustomerID()+
                               ", Date:"+rental.getDate()+" Rented");
        }
    }

    public void displayRentalHistory() { // Add this method
        for (Rental rental : rentalHistory) {
            System.out.println("Rental ID: " + rental.getRentalID() +
                               ", Car ID: " + rental.getCarID() +
                               ", Customer ID: " + rental.getCustomerID()+
                               ", Date:"+rental.getDate()+" Rented");
        }
    }
}
