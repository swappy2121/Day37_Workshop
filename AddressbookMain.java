package com.Bridgelabz;

import java.util.Scanner;

public class AddressbookMain {
    public static void main(String[] args) {


        AddressbookAddContacts addressbookData = new AddressbookAddContacts();
        int choice;
        do {
            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to Address Book Program");
            System.out.println("Kindly Enter choice \n 1. Add new Contact \n 2. Show Contact details");

            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    addressbookData.addContacts();
                    break;
                case 2:
                    addressbookData.showContacts();
                    break;
            }
        } while (choice != 3);
    }
}
