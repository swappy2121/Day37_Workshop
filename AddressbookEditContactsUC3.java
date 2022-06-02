package com.Bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressbookEditContactsUC3 {
    ArrayList<Contacts> list = new ArrayList<Contacts>();
    Scanner sc = new Scanner(System.in);


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
        list.stream().filter(e -> {
            System.out.println("Contact Details -");
            System.out.println("First Name : " + e.getFirstName());
            System.out.println("Last Name : " + e.getLastName());
            System.out.println("Address : " + e.getAddress());
            System.out.println("City : " + e.getCity());
            System.out.println("State : " + e.getState());
            System.out.println("Zip Code : " + e.getZip());
            System.out.println("Phone Number : " + e.getPhoneNumber());
            System.out.println("EMail ID : " + e.getEmail());
            return false;
        }).forEach(System.out::println);

    }

    public void editContacts() {
        // Editing contact detail by using first name.

        System.out.println("Enter the first name");
        String firstName = sc.next();

        boolean isAvailable = false;
        for (Contacts contacts : list) {
            if (firstName.equalsIgnoreCase(contacts.getFirstName())) {
                isAvailable = true;
                System.out.println("***** YOU CAN EDIT THE DETAILS ****");
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

}
