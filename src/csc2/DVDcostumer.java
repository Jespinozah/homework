package csc2;
import java.time.LocalDate;
//import java.text.NumberFormat;

public class DVDcostumer {
 
	    private String Name;
	    private int Phone;
	    private String Address;
	    private String movie;
	    private LocalDate checkoutDate;
	    private LocalDate returnDate;
	    private double rentalPrice;

	    public DVDcostumer(String Name,int Phone, String Address,String movie,LocalDate checkoutDate,LocalDate returnDate,double rentalPrice) {
	    	this.Name=Name;
	    	this.Phone=Phone;
	    	this.Address=Address;
	    	this.movie=movie;
	    	this.checkoutDate=checkoutDate;
	    	this.returnDate=returnDate;
	    	this.setRentalPrice(rentalPrice);
	    }

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public int getPhone() {
			return Phone;
		}

		public void setPhone(int phone) {
			Phone = phone;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}

		public String getMovie() {
			return movie;
		}

		public void setMovie(String movie) {
			this.movie = movie;
		}

		public LocalDate getCheckoutDate() {
			return checkoutDate;
		}

		public void setCheckoutDate(LocalDate checkoutDate) {
			this.checkoutDate = checkoutDate;
		}

		public LocalDate getReturnDate() {
			return returnDate;
		}

		public void setReturnDate(LocalDate returnDate) {
			this.returnDate = returnDate;
		}
		
		public double getRentalPrice() {
			return rentalPrice;
		}

		public void setRentalPrice(double rentalPrice) {
			this.rentalPrice = rentalPrice;
		}
		
		@Override
	    public String toString()
	    {
	        /*
	        Output example:
	            Name: Jack
	            Movie title: Harry Potter
	            Rent price: $20.99
	            Checkout date: 2017-07-28
	            Return date: 2017-08-05
	            Overdue fee: $0.00
	        */
	       // NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

	       
	        StringBuilder strBld = new StringBuilder();
	        strBld.append("Name: ").append(Name).append("\n");
	        strBld.append("Movie title: ").append(getMovie()).append("\n");
	        strBld.append("Rent price: ").append(getRentalPrice()).append("\n");
	        strBld.append("Checkout date: ").append(checkoutDate).append("\n");
	        strBld.append("Return date: ").append(returnDate).append("\n");
	       

	        return strBld.toString();
	    }

	
	}

	   