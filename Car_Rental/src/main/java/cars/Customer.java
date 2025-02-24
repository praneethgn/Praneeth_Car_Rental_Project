package cars;

public class Customer {
    private String customerID;
    private String name;

    // Constructor
    public Customer(String customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }

    // Getters
    public String getCustomerID() { return customerID; }
    public String toString() { return name; }
}
