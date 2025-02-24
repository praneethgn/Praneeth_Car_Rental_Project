package cars;



public class Rental {
    private String rentalID;
    private String carID;
    private String customerID;
    private String Date;

    // Constructor
    public Rental(String rentalID, String carID, String customerID,String Date) {
        this.rentalID = rentalID;
        this.carID = carID;
        this.customerID = customerID;
        this.Date=Date;
      
    }

	// Getters and setters
    public String getCarID() { 
    	return carID; 
    }
    public String getCustomerID() { 
    	return customerID;
    }

	public String getRentalID() {
		// TODO Auto-generated method stub
		return rentalID;
	}
	public String getDate() {
		// TODO Auto-generated method stub
		return Date;
	}

    
}

