package domain;

/**********************************************************
*  This is DVD rental Program                             *
***********************************************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	// List for DVD and their details
	public static void loadDvds() {
		List<DVD> dvds = new ArrayList<DVD>();
		DVD firstDvd = new DVD(1, "Parasite", "2020", "Drama", 7, 6.0);
		DVD SecondDvd = new DVD(2, "Toy Story 3", "2010", "Animation", 4, 5.0);
		DVD ThirdtDvd = new DVD(3, "Mad Max", "2015", "Action", 7, 6.0);
		dvds.add(firstDvd);
		dvds.add(SecondDvd);
		dvds.add(ThirdtDvd);
		System.out.println("==================DVD List===================");
		dvds.forEach(dvd -> {
			System.out.print(dvd.getInfo());
			System.out.println("============================================");
		});

	}

	// List for Customer and their details
	public static List<Customer> loadCustomer() {
		List<Customer> customers = new ArrayList<Customer>();
		Customer firstCustomer = new Customer(1, "Greys", "Espinoza", "95456", "234 Brown st", "");
		Customer secondCustomer = new Customer(2, "Juan", "Perez", "945646", "33 belleville ave", "juan@gmail.com");
		customers.add(firstCustomer);
		customers.add(secondCustomer);
		System.out.println("==================Costumer List===================");
		customers.forEach(costumer -> {
			System.out.print(costumer.getInfo());
			System.out.println("============================================");
		});
		return customers;

	}

	@SuppressWarnings("resource")
	public static void addCustomer() {
		Scanner input = new Scanner(System.in);
		List<Customer> customers = new ArrayList<Customer>(10);
		System.out.println("\n--------------");
		System.out.println("Please enter your customer ID: ");
		int id = input.nextInt(); // reads
		System.out.println("Please enter your first name: ");
		String firstName = input.nextLine();
		System.out.println("Please enter your lastName name: ");
		String lastName = input.nextLine();
		System.out.println("Please enter your phone number: ");
		String phone = input.nextLine();
		System.out.println("Please enter your address: ");
		String address = input.nextLine();
		System.out.println("Please enter your email: ");
		String email = input.nextLine();
		customers.add(new Customer(id, firstName, lastName, phone, address, email));

	}

	// List for the rentals
	public static List<Rental> loadRentals() {
		List<Rental> rentals = new ArrayList<Rental>();
		Customer firstCustomer = new Customer(1, "Greys", "Espinoza", "95456", "234 Brown st", "");
		DVD firstDvd = new DVD(1, "Parasite", "2020", "Drama", 7, 6.0);
		Rental rental = new Rental(1, firstCustomer, firstDvd, " 5/10/2020", "10/10/2020", 6.0);
		rentals.add(rental);
		System.out.println("==================Rental List===================");
		rentals.forEach(rental1 -> {
			System.out.print(rental1.getInfo());
			System.out.println("============================================");
		});

		return rentals;
	}

	// main method to start the program

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		do {
			int options;
			Scanner scan = new Scanner(System.in);

			System.out.println("Available options:");
			System.out.println("1 - List of rents");
			System.out.println("2 - List of customers");
			System.out.println("3 - List of DVDs");
			System.out.println("4 - Add new customer");
			System.out.println("Choice: ");
			options = scan.nextInt();
			switch (options) {
			case 1:
				loadRentals();
				break;
			case 2:
				loadCustomer();
				break;
			case 3:
				loadDvds();
				break;
			case 4:
				addCustomer();
				break;
			default:
				System.out.println("Invalid input");

			}
		} while (true);

		// loadDvds();
		// loadCustomer();
		// loadRentals();

	}

}
