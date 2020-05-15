package domain;

/**********************************************************
 *  This is DVD rental Program                             *
 ***********************************************************/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    // List for DVD and their details
    public static void getDvds(List<DVD> dvds) {

        System.out.println(
            "============================================DVDs LIST=====================================================");
        System.out.printf("%5s %10s %20s %20s %20s %20s", "ID", "TITLE", "RELEASE YEAR", "GENDER",
            "IN STOCK", "RENTAL PRICE");
        System.out.println();
        System.out.println(
            "==============================================================================================================");

        dvds.forEach(c -> {
            System.out.printf("%5s %10s %20s %20s %20s %20s", c.getId(), c.getTitle(),
                c.getReleaseYear(), c.getGender(), c.getInStock(), c.getRentalPrice());
            System.out.println();
        });
        System.out.println(
            "==============================================================================================================");
    }

    // List for Customer and their details
    public static List<Customer> getCustomers(List<Customer> customers) {
        System.out.println(
            "============================================CUSTOMER LIST=====================================================");
        System.out.printf("%5s %10s %20s %20s %20s %20s", "ID", "FIRSTNAME", "LASTNAME", "PHONE",
            "ADDRESS", "EMAIL");
        System.out.println();
        System.out.println(
            "==============================================================================================================");

        customers.forEach(c -> {
            System.out.printf("%5s %10s %20s %20s %20s %20s", c.getId(), c.getFirstName(),
                c.getLastName(), c.getPhone(), c.getAddress(), c.getEmail());
            System.out.println();
        });
        System.out.println(
            "==============================================================================================================");

        return customers;
    }

    public static List<Customer> initDataCustomers(List<Customer> customers) {
        Customer firstCustomer = new Customer(1, "Greys", "Espinoza", "95456", "234 Brown st", "");
        Customer secondCustomer = new Customer(2, "Juan", "Perez", "945646", "33 belleville ave",
            "juan@gmail.com");
        customers.add(firstCustomer);
        customers.add(secondCustomer);
        return customers;
    }

    public static void initDataDvds(List<DVD> dvds) {
        DVD firstDvd = new DVD(1, "Parasite", "2020", "Drama", 7, 6.0);
        DVD SecondDvd = new DVD(2, "Toy Story 3", "2010", "Animation", 4, 5.0);
        DVD ThirdDvd = new DVD(3, "Mad Max", "2015", "Action", 7, 6.0);
        dvds.add(firstDvd);
        dvds.add(SecondDvd);
        dvds.add(ThirdDvd);
    }

    public static void saveCustomer(Customer customer, List<Customer> customers) {
        customers.add(customer);
    }

    @SuppressWarnings("resource")
    public static void addCustomer(List<Customer> customers) {
        int id = 2;
        Scanner input = new Scanner(System.in);
        System.out.println("\n--------------");
        id += 1;
        System.out.println("Please enter your first name: ");
        String firstName = input.next();
        System.out.println("Please enter your lastName name: ");
        String lastName = input.next();
        System.out.println("Please enter your phone number: ");
        String phone = input.next();
        System.out.println("Please enter your address: ");
        String address = input.next();
        System.out.println("Please enter your email: ");
        String email = input.next();
        customers.add(new Customer(id, firstName, lastName, phone, address, email));

    }

    // List for the rentals
    public static void getRentals(List<Rental> rentals) {

        System.out.println(
            "============================================ RENTALS ============================================================================");
        System.out
            .printf("%5s %30s %30s %20s %20s %20s", "ID", "CUSTOMER-INFO", "DVD-INFO", "DATE-OUT",
                "DATE-RETURNED", "AMOUNT-DUE");
        System.out.println();
        System.out.println(
            "==================================================================================================================================");

        rentals.forEach(c -> {
            System.out.printf("%5s %30s %30s %20s %20s %20s", c.getId(),
                c.getCustomer().getFirstName() + " " + c.getCustomer().getLastName()
                , c.getDvd().getTitle() + " " + c.getDvd().getReleaseYear(), c.getDateOut(),
                c.getDateReturned(), c.getAmountDue());
            System.out.println();
        });
        System.out.println(
            "==================================================================================================================================");
    }

    public static void initRentals(List<Rental> rentals) {
        Customer firstCustomer = new Customer(1, "Greys", "Espinoza", "95456", "234 Brown st", "");
        DVD firstDvd = new DVD(1, "Parasite", "2020", "Drama", 7, 6.0);
        Rental rental = new Rental(1, firstCustomer, firstDvd, " 5/10/2020", "10/10/2020", 6.0);
        rentals.add(rental);
    }

    @SuppressWarnings("resource")
    public static void rentDvd(List<Rental> rentals, List<Customer> customers, List<DVD> dvds) {

        Scanner input = new Scanner(System.in);
        System.out.println("\n--------------");
        System.out.println("Please enter your customer ID: ");
        int customerId = input.nextInt(); // reads
        System.out.println("Please enter your DVD ID: ");
        int dvdId = input.nextInt();
        String dateOut = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Please enter the day of return: ");
        String dateReturner = input.next();
        System.out.println("Please enter the amount due: ");
        Double amountDue = input.nextDouble();

        int idRent = 1;
        idRent += 1;
        Optional<Customer> customer = customers.stream().filter(p -> p.getId() == customerId)
            .findFirst();
        Optional<DVD> dvd = dvds.stream().filter(p -> p.getId() == dvdId).findFirst();
        Rental rental = new Rental(idRent, customer.get(), dvd.get(), dateOut, dateReturner,
            amountDue);
        rentals.add(rental);

        dvds.forEach(
            p -> {
                if (p.getId() == dvdId) {
                    p.setInStock(p.getInStock()-1);
                }
            }
        );
    }

    // main method to start the program

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        boolean activeSession = true;
        List<Customer> customers = new ArrayList<>();
        List<Rental> rentals = new ArrayList<>();
        List<DVD> dvds = new ArrayList<>();
        initDataCustomers(customers);
        initDataDvds(dvds);
        initRentals(rentals);
        do {
            int options;
            Scanner scan = new Scanner(System.in);

            System.out.println("======MENU========");
            System.out.println("Available options:");
            System.out.println("1 - List of rents");
            System.out.println("2 - List of customers");
            System.out.println("3 - List of DVDs");
            System.out.println("4 - Add new customer");
            System.out.println("5 - Rent DVD");
            System.out.println("6 - Exit");
            System.out.println("Choice: ");
            options = scan.nextInt();
            switch (options) {
                case 1:
                    getRentals(rentals);
                    break;
                case 2:
                    getCustomers(customers);
                    break;
                case 3:
                    getDvds(dvds);
                    break;
                case 4:
                    addCustomer(customers);
                    break;
                case 5:
                    rentDvd(rentals, customers, dvds);
                    break;
                case 6:
                    activeSession = false;
                    break;
                default:
                    System.out.println("Invalid input");

            }
        } while (activeSession);

        // loadDvds();
        // loadCustomer();
        // loadRentals();

    }

}
