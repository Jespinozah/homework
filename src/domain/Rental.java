package domain;

public class Rental {

	// Class declaration
	private int id;
	private Customer customer;
	private DVD dvd;
	private String dateOut;
	private String dateReturned;
	private Double amountDue;

	public Rental(int id, Customer customer, DVD dvd, String dateOut, String dateReturned, Double amountDue) {

		this.id = id;
		this.customer = customer;
		this.dvd = dvd;
		this.dateOut = dateOut;
		this.dateReturned = dateReturned;
		this.amountDue = amountDue;
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
	public Double getAmountDue() {
		return amountDue;
	}

	// set amount due
	public void setAmountDue(Double amountDue) {
		this.amountDue = amountDue;
	}
 
	//Returns
	public String getInfo() {
		return "Costumer ID: " + getId() + "\n" + "First Customer: " + getCustomer().getInfo() + "\n" + "First DVD: " + getDvd().getInfo()
				+ "\n" + "Date of check out: " + getDateOut() + "\n" + "Date of return: " + getDateReturned() + "\n"
				+ "Amount due: " + getAmountDue() + "\n";

	}

}
