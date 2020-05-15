package domain;

public class DVD {
	// Class declaration
	private int id;
	private String title;
	private String releaseYear;
	private String gender;
	private int inStock;
	private double rentalPrice;

	public DVD(int id, String title, String releaseYear, String gender, int inStock, double rentalPrice) {
		this.id = id;
		this.title = title;
		this.releaseYear = releaseYear;
		this.gender = gender;
		this.inStock = inStock;
		this.rentalPrice = rentalPrice;
	}

	// Return ID
	public int getId() {
		return id;
	}

	// Set Id
	public void setId(int id) {
		this.id = id;
	}

	// Return title
	public String getTitle() {
		return title;
	}

	// Set Title
	public void setTitle(String title) {
		this.title = title;
	}

	// Return Release Year
	public String getReleaseYear() {
		return releaseYear;
	}

	// Set Release year
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	// Return gender
	public String getGender() {
		return gender;
	}

	// Set gender
	public void setGender(String gender) {
		this.gender = gender;
	}

	// Return inStock
	public int getInStock() {
		return inStock;
	}

	// Set inStock
	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

	// Return Rental Price
	public double getRentalPrice() {
		return rentalPrice;
	}

	// Set Rental Price
	public void setRentalPrice(double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	public String getInfo() {
		return "Number dvd: " + getId() + "\n" + "Title: " + getTitle() + "\n" + "Release year: " + getReleaseYear()
				+ "\n" + "Gender: " + getGender() + "\n" + "In stock: " + getInStock() + "\n" + "Rental Price: "
				+ getRentalPrice() + "\n";

	}
}
