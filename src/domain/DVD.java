package domain;

public class DVD {

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

	public double getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	public String getInfo() {
		return "Number dvd: " + getId() + "\n" + "Title: " + getTitle() + "\n" + "Release year: " + getReleaseYear()
				+ "\n" + "Gender: " + getGender() + "\n" + "In stock: " + getInStock() + "\n" + "Rental Price: "
				+ getRentalPrice() + "\n";

	}
}
