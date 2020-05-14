package domain;

public class Rental {

	private int id;
	private Customer customer;
	private DVD dvd;
	private String dateOut;
	private String dateReturned;
	private Double amoutDue;

	private Rental(int id, Customer customer, DVD dvd, String dateOut, String dateReturned, Double amoutDue) {
		
		this.id = id;
		this.customer = customer;
		this.dvd = dvd;
		this.dateOut = dateOut;
		this.dateReturned = dateReturned;
		this.amoutDue = amoutDue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public DVD getDvd() {
		return dvd;
	}

	public void setDvd(DVD dvd) {
		this.dvd = dvd;
	}

	public String getDateOut() {
		return dateOut;
	}

	public void setDateOut(String dateOut) {
		this.dateOut = dateOut;
	}

	public String getDateReturned() {
		return dateReturned;
	}

	public void setDateReturned(String dateReturned) {
		this.dateReturned = dateReturned;
	}

	public Double getAmoutDue() {
		return amoutDue;
	}

	public void setAmoutDue(Double amoutDue) {
		this.amoutDue = amoutDue;
	}

}
