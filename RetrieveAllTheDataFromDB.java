package com.Bridgelabz;

import java.sql.*;

public class RetrieveAllTheDataFromDB {
    public static String query = "select * from addressbookforfriends";
   public static String userData = "";

    public String Query(String query1) {
        if (query.equalsIgnoreCase(query1)) {
            return query;
        } else {
            System.out.println("please enter correct query");
        }
        return userData;
    }

        public static void main(String[] args) throws SQLException {

            String jdbcUrl = "jdbc:mysql://localhost:3306/addressbookservice";
            String userName = "root";
            String password = "sopi@1234";

            Connection connection;

            connection = DriverManager.getConnection(jdbcUrl, userName, password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);


            while(result.next()){
                userData = result.getString(1)+ " | " + result.getString(2)+" | " + result.getString(3)+" | "+result.getString(4)+" | "+result.getString(5)+" | "+result.getString(6);
                System.out.println(userData);
            }
            statement.close();
            connection.close();

        }
    }

