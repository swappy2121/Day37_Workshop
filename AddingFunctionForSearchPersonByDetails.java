package com.Bridgelabz;

import java.util.*;
import java.util.stream.Collectors;

public class AddingFunctionForSearchPersonByDetails {
    static Map<String, AddressbookDeleteContactsUC4> addressBookMap = new HashMap<>();
    ArrayList<Contacts> list = new ArrayList<Contacts>();
    public static Scanner sc = new Scanner(System.in);


    public boolean equalsFirstName(Contacts compareContacts) {
        for (Contacts contacts : list) {
            if (compareContacts.equals(contacts)) {
                return true;
            }
        }
        return false;
    }


    public static void addNewAddressBook() {
        System.out.println("Enter the Address Book Name :");
        String addressbookName = sc.next();
        if (addressBookMap.containsKey(addressbookName)) {
            System.out.println("Entered AddressBook is Already Available");
        } else {
            AddressbookDeleteContactsUC4 addressBook = new AddressbookDeleteContactsUC4();
            addressBookMap.put(addressbookName, addressBook);
        }

    }

    // method to search contact by name
    public List<Contacts> searchByName(String name) {
        return list.stream().filter(person -> person.getFirstName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    // by city
    public List<Contacts> searchByCity(String city) {
        return list.stream().filter(person -> person.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    // by state
    public List<Contacts> searchByState(String state) {
        return list.stream().filter(person -> person.getState().equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }


    public void searchByOptions() {
        AddressbookDeleteContactsUC4 addressBook = new AddressbookDeleteContactsUC4();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. By name");
        System.out.println("2. By city");
        System.out.println("3. By state");
        System.out.println("Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                list.forEach(book -> searchByName(name).forEach(System.out::println));
                break;
            case 2:
                System.out.println("Enter city: ");
                String city = sc.nextLine();
                list.forEach(book -> searchByCity(city).forEach(System.out::println));
                break;
            case 3:
                System.out.println("Enter state: ");
                String state = sc.nextLine();
                list.forEach(book -> searchByState(state).forEach(System.out::println));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }


    public static void displayAddressBooks() {
        for (Map.Entry<String, AddressbookDeleteContactsUC4> entry : addressBookMap.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().showContacts();

        }
    }
    public void addContacts() {

        Contacts contacts = new Contacts();

        System.out.println("Enter the Contact details");

        System.out.println("Enter the First Name :");
        contacts.setFirstName(sc.next());

        System.out.println("Enter the Last Name :");
        contacts.setLastName(sc.next());

        System.out.println("Enter the Address :");
        contacts.setAddress(sc.next());

        System.out.println("Enter the City :");
        contacts.setCity(sc.next());

        System.out.println("Enter the State :");
        contacts.setState(sc.next());

        System.out.println("Enter the Zip Code :");
        contacts.setZip(sc.next());

        System.out.println("Enter the Phone Number :");
        contacts.setPhoneNumber(sc.next());

        System.out.println("Enter the EMail ID :");
        contacts.setEmail(sc.next());

        list.add(contacts);
    }

    //Method to Show the Contact Details
    public void showContacts() {
        for (Contacts contacts : list) {
            System.out.println("Contact Details -");
            System.out.println("First Name : " + contacts.getFirstName());
            System.out.println("Last Name : " + contacts.getLastName());
            System.out.println("Address : " + contacts.getAddress());
            System.out.println("City : " + contacts.getCity());
            System.out.println("State : " + contacts.getState());
            System.out.println("Zip Code : " + contacts.getZip());
            System.out.println("Phone Number : " + contacts.getPhoneNumber());
            System.out.println("EMail ID : " + contacts.getEmail());
        }

    }

    public void editContacts() {
        // Editing contact detail by using first name.

        System.out.println("Enter the first name");
        String firstName = sc.next();

        boolean isAvailable = false;
        for (Contacts contacts : list) {
            if (firstName.equalsIgnoreCase(contacts.getFirstName())) {
                isAvailable = true;
                System.out.println("Enter the Last Name :");
                contacts.setLastName(sc.next());
                System.out.println("Enter the Address :");
                contacts.setAddress(sc.next());
                System.out.println("Enter the City :");
                contacts.setCity(sc.next());
                System.out.println("Enter the State :");
                contacts.setState(sc.next());
                System.out.println("Enter the Zip Code :");
                contacts.setZip(sc.next());
                System.out.println("Enter the Phone Number :");
                contacts.setPhoneNumber(sc.next());
                System.out.println("Enter the EMail ID :");
                contacts.setEmail(sc.next());
                break;
            }
        }
        if (!isAvailable) {
            System.out.println("Contact Number Not found ");
        }
    }

    public void deleteContact() {
        System.out.println("Enter the first name");
        String firstName = sc.next();

        boolean isAvailable = false;
        for (Contacts contacts : list) {
            if (firstName.equalsIgnoreCase(contacts.getFirstName())) {
                isAvailable = true;
                list.remove(contacts);
                System.out.println("Contact Deleted ");
                break;
            }
            if (!isAvailable) {
                System.out.println("Contact Number Not found ");
            }
        }
    }

}
