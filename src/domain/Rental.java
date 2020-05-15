package domain;

public class Rental {

	// Class declaration
	private int id;
	private Customer customer;
	private DVD dvd;
	private String dateOut;
	private String dateReturned;
	private Double amoutDue;

	public Rental(int id, Customer customer, DVD dvd, String dateOut, String dateReturned, Double amoutDue) {

		this.id = id;
		this.customer = customer;
		this.dvd = dvd;
		this.dateOut = dateOut;
		this.dateReturned = dateReturned;
		this.amoutDue = amoutDue;
	}
	
	//Returns
	public int getId() {
		return id;
	}

	//Set ID
	public void setId(int id) {
		this.id = id;
	}

	//Returns
	public Customer getCustomer() {
		return customer;
	}

	//Set Customer
	public void setCustomer(Customer customer) {
	
		this.customer = customer;
	}
	
	//Returns
	public DVD getDvd() {
		return dvd;
	}

	//set DVD
	public void setDvd(DVD dvd) {
		this.dvd = dvd;
	}

	//Returns
	public String getDateOut() {
		return dateOut;
	}

	//Set Date Out
	public void setDateOut(String dateOut) {
		this.dateOut = dateOut;
	}

	//Returns Date Returned
	public String getDateReturned() {
		return dateReturned;
	}

	//Set Date Returned
	public void setDateReturned(String dateReturned) {
		this.dateReturned = dateReturned;
	}

	//Returns Amount due
	public Double getAmoutDue() {
		return amoutDue;
	}

	// set amount due
	public void setAmoutDue(Double amoutDue) {
		this.amoutDue = amoutDue;
	}
 
	//Returns
	public String getInfo() {
		return "Costumer ID: " + getId() + "\n" + "First Customer: " + getCustomer() + "\n" + "First DVD: " + getDvd()
				+ "\n" + "Date of check out: " + getDateOut() + "\n" + "Date of return: " + getDateReturned() + "\n"
				+ "Amount due: " + getAmoutDue() + "\n";

	}

}
