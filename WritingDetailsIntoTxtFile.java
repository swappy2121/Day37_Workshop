package com.Bridgelabz;

import java.io.FileOutputStream;

public class WritingDetailsIntoTxtFile {

    public static void main(String[] args) {
        try{
            FileOutputStream file = new FileOutputStream("C:\\swappy\\AddressbookData.txt");
            String details = "first name : swapnil    Akshay    Rahul\n last name : Pawar      Pawar      Patil\n mob no. : 8600127352  9404200733  9423912661\n address : hastinagar  gandhinagar  sakri";
            byte  list[] = details.getBytes();
            System.out.println("this is addressBook details ");
            file.write(list);
            file.close();
            System.out.println("success");

        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("All process is successful");
        }
    }
}
