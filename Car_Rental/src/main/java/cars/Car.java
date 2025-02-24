package cars;

public class Car {
    private String carID;
    private String brand;
    private String model;
    private int year;
    private boolean isAvailable;

    // Constructor
    public Car(String carID, String brand, String model, int year) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isAvailable = true;
    }

    // Getters and setters
    public String getCarID() { return carID; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
    public String toString() { return brand + " " + model + " (" + year + ")"; }
}
