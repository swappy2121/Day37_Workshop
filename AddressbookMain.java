package com.Bridgelabz;

import java.util.Scanner;

public class AddressbookMain {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        AddingFunctionForSearchPersonByDetails ab = new AddingFunctionForSearchPersonByDetails();
        ab.addNewAddressBook();
        ab.addContacts();
        ab.searchByOptions();

    }
}
