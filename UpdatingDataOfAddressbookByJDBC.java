package com.Bridgelabz;

import java.sql.*;

public class UpdatingDataOfAddressbookByJDBC {
    public static Connection connection;

    public static void main(String[] args) throws SQLException {

        String jdbcUrl = "jdbc:mysql://localhost:3306/addressbookservice";
        String userName = "root";
        String password = "sopi@1234";
        String query = "update addressbookforfriends set city='pune' where firstname='prafull' ";


        connection = DriverManager.getConnection(jdbcUrl, userName, password);
        PreparedStatement statement = connection.prepareStatement(query);
        int count = statement.executeUpdate();
        System.out.println(count + " row affected");
        statement.close();
        connection.close();
    }


    public static String retrieveData(String city) throws SQLException{
        String jdbcUrl="jdbc:mysql://localhost:3306/addressbookservice";
        String userName="root";
        String password="sopi@1234";
        String query="select city from addressbookforfriends where firstname ='prafull'";

        connection=DriverManager.getConnection(jdbcUrl,userName,password);
        String getCity=" ";
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        ResultSet resultSet=preparedStatement.executeQuery();

        while(resultSet.next()){
            for(int i=0;i<=6;i++){
                getCity=(resultSet.getString("city"));
                if(getCity.equalsIgnoreCase(city)){
                    return city;
                }else{
                    System.out.println("please enter valid city");
                }
                System.out.println(getCity);
            }
        }
        return city;
    }
}


