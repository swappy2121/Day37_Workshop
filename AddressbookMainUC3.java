package com.Bridgelabz;

import java.util.Scanner;

public class AddressbookMainUC3 {
    public static void main(String[] args) {


        AddressbookEditContactsUC3 addressbookData = new AddressbookEditContactsUC3();
        int choice;
        do {
            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to Address Book Program");
            System.out.println("Kindly Enter choice \n 1. Add new Contact \n 2. Show Contact details \n 3. Edit contact Details");

            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    addressbookData.addContacts();
                    break;
                case 2:
                    addressbookData.showContacts();
                    break;
                case 3:
                    addressbookData.editContacts();
            }
        } while (choice != 4);
    }
}
