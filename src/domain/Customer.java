package domain;

public class Customer {
	
	//Class declaration
	private int id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	private String email;

	public Customer(int id, String firstName, String lastName, String phone, String address, String email) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}

	//Return id
	public int getId() {
		return id;
	}

	//Set id
	public void setId(int id) {
		this.id = id;
	}

	// Return first name
	public String getFirstName() {
		return firstName;
	}

	//Set first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//Return last name
	public String getLastName() {
		return lastName;
	}

	//Set last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//Return phone
	public String getPhone() {
		return phone;
	}

	//Set phone
	public void setPhone(String phone) {
		this.phone = phone;
	}

	//Return address
	public String getAddress() {
		return address;
	}

	//Set address
	public void setAddress(String address) {
		this.address = address;
	}

	//Return email
	public String getEmail() {
		return email;
	}

	//Set email
	public void setEmail(String email) {
		this.email = email;
	}

	public String getInfo() {
		return "Id customer: " + getId() + "\n" + "Name: " + getFirstName() + "\n" + "Lastname: " + getLastName() + "\n"
				+ "Phone: " + getPhone() + "\n" + "Address" + getAddress() + "\n" + "Email: " + getEmail() + "\n";

	}
}
