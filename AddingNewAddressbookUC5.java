package com.Bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddingNewAddressbookUC5 {
    static Map<String, AddressbookDeleteContactsUC4> addressBookMap = new HashMap<>();
    ArrayList<Contacts> list = new ArrayList<Contacts>();
    public static Scanner sc = new Scanner(System.in);


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
}
