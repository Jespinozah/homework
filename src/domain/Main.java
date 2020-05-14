package domain;

import java.util.ArrayList;
import java.util.List;

public class Main {

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

	public static List<Customer> loadCustomer() {
		List<Customer> customers = new ArrayList<Customer>();
		Customer firstCustomer = new Customer(1, "Greys", "Espinoza", "95456", "234 Brown st", "");
		Customer secondCustomer = new Customer(2, "Juan", "Perez", "945646", "33 belleville ave", "juan@gmail.com");
		customers.add(firstCustomer);
		customers.add(secondCustomer);

		return customers;

	}

	public static void main(String[] args) {

		loadDvds();
		loadCustomer();

	}

}
