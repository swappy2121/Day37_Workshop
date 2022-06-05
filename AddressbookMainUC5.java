package com.Bridgelabz;

import java.util.Scanner;

public class AddressbookMainUC5 {
    static Scanner sc = new Scanner(System.in);

    //Using hashmap creating multiple Address book

    public static void main(String[] args) {
        AddingNewAddressbookUC5 ab = new AddingNewAddressbookUC5();
        ab.addNewAddressBook();
        ab.addContacts();
    }
}
