package com.test.service;

import java.sql.*;

public class test {
    public static void main(String[] args) {

//        System.out.println("66666666666666");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC","root","root123");
            Statement statement = connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from actor  limit 0,3");
            while (resultSet.next()){

//                System.out.println(resultSet.getString(1));
                System.out.println("------");
                System.out.println(resultSet.getString(2));;
                System.out.println(resultSet.getString(3));;
                System.out.println(resultSet.getString(4));;
                System.out.println("+++++++++");
                System.out.println("                    ");


            }
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }





    }
}
