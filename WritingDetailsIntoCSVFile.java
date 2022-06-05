package com.Bridgelabz;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WritingDetailsIntoCSVFile {
    public static void main(String[] args) {
        CSVWriter writer = null;
        try {
            //location to write the CSV file
            String path = "C:\\swappy\\AddressbookDetails.csv";
            FileWriter outputfile = new FileWriter(new File(path));

            writer = new CSVWriter(outputfile);

            // create a List of String array
            List<String[]> dataToWrite = new ArrayList<String[]>();
            dataToWrite.add(new String[]{"firstName", "lastName", "EmailId", "mobileNumber","Address"});
            dataToWrite.add(new String[]{"Swapnil", "Pawar", "swapnilPawar25@gmail.com", "8600127352","hastinagar"});
            dataToWrite.add(new String[]{"Sonali", "Patil", "patilSonali23@gmail.com", "9423912661","gandhinagar"});
            dataToWrite.add(new String[]{"Akshay", "Pawar", "PawarAkshaygmail.com", "9404200733","hastinagar"});
            dataToWrite.add(new String[]{"Rahul", "Patil", "rahulPatil55@gmail.com", "9876645342","sakri"});

            writer.writeAll(dataToWrite);
            System.out.println("Complete");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
