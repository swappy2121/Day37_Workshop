package com.Bridgelabz;

import java.sql.*;

public class RetrievingContactsOfPersons {
    public static Connection connection;

    public static String retrieveContact(String contact) throws SQLException {
        String jdbcUrl="jdbc:mysql://localhost:3306/addressbookservice";
        String userName="root";
        String password="sopi@1234";
        String query="select * from addressbookforfriends";

        connection= DriverManager.getConnection(jdbcUrl,userName,password);
        String getContact=" ";
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        ResultSet resultSet=preparedStatement.executeQuery();

        while(resultSet.next()) {
            for (int i = 0; i <= 2; i++) {
                getContact = (resultSet.getString("phone"));
            }
        }
        if(getContact.equalsIgnoreCase(contact)){
            return contact;
        }else{
            System.out.println("please enter valid contact");
        }
        return contact;
    }

    public static void main(String[] args) throws SQLException {

        String jdbcUrl = "jdbc:mysql://localhost:3306/addressbookservice";
        String userName = "root";
        String password = "sopi@1234";
        String query = "select * from addressbookforfriends";

        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, password);
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            System.out.println("contacts of persons : ");
            while (result.next()) {
                String name = result.getString("phone");
                System.out.print(name + " \n");
            }
        } catch (SQLException exec) {
            exec.printStackTrace();
        }
    }
}

