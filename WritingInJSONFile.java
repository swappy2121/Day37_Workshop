package com.Bridgelabz;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class WritingInJSONFile {

        @SuppressWarnings("unchecked")
        public static void main( String[] args )
        {

            JSONObject addressbookDetails1 = new JSONObject();
            addressbookDetails1.put("FirstName", "swapnil");
            addressbookDetails1.put("LastName", "pawar");
            addressbookDetails1.put("Email", "swapnilPawar25@gmail.com");
            addressbookDetails1.put("mob. no.", "8600127352");
            addressbookDetails1.put("Address", "hastinagar,pune");

            JSONObject addressbookObject1 = new JSONObject();
            addressbookObject1.put("Addressbook1", addressbookDetails1);


            JSONObject addressbookDetails2 = new JSONObject();
            addressbookDetails2.put("FirstName", "Akshay");
            addressbookDetails2.put("LastName", "Pawar");
            addressbookDetails2.put("Email", "PawarAkshay04@.com");
            addressbookDetails2.put("mob.no.", "9423912661");
            addressbookDetails2.put("Address", "hastinagar,pune");

            JSONObject addressbookObject2 = new JSONObject();
            addressbookObject2.put("Addressbook2", addressbookDetails2);

            JSONObject addressbookDetails3 = new JSONObject();
            addressbookDetails3.put("FirstName", "rahul");
            addressbookDetails3.put("LastName", "patil");
            addressbookDetails3.put("Email", "patilRahul30@gmail.com");
            addressbookDetails3.put("mob. no.", "9404200733");
            addressbookDetails3.put("Address", "hadapsar,pune");

            JSONObject addressbookObject3 = new JSONObject();
            addressbookObject3.put("Addressbook3", addressbookDetails3);


            JSONArray addressbookList = new JSONArray();
            addressbookList.put(addressbookObject1);
            addressbookList.put(addressbookObject2);
            addressbookList.put(addressbookObject3);

            try (FileWriter file = new FileWriter("C:\\swappy\\addressbookdata.json")) {
                file.write(addressbookList.toString());
                file.flush();
                System.out.println("File is created successfully");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
