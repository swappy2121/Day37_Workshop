package com.Bridgelabz;

import java.sql.*;

public class RetrivingContactCountOfAddressbook {
    public static Connection connection;
    public static String getContactDetails(String phoneNum) throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/addressbookservice";
        String userName = "root";
        String password = "sopi@1234";
        String query = "select * from addressbookforfriends";

        connection = DriverManager.getConnection(jdbcUrl, userName, password);
        String getContact = " ";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            for (int i = 0; i <= 6; i++) {
                getContact = (resultSet.getString("phone"));
            }
        }
        if (getContact.equalsIgnoreCase(phoneNum)) {
            return phoneNum;
        } else {
            System.out.println("please enter valid phone");
        }
        return getContact;
    }

    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/addressbookservice";
        String userName = "root";
        String password = "sopi@1234";
        String query = "select count(phone) from addressbookforfriends";


        connection = DriverManager.getConnection(jdbcUrl, userName, password);
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);

        String userData = "";
        while(result.next()){
            userData = result.getString(1);
            System.out.println("the total contact count is : "+ userData);
        }
        statement.close();
        connection.close();
    }
}

