package com.dreng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application
{
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/springdata";
        String username = "keesun";
        String password = "pass";

        try (Connection connection = DriverManager.getConnection(url, username, password)){
            System.out.println("Connection create:"+connection);

            String sql = "CREATE TABLE ACCOUNT (id int, username varchar(255), password varchar(255));";
            //String sql = "INSERT INTO ACCOUNT VALUES(1, 'keesun', 'pass');";
            try(PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.execute();
            }
        }


    }
}
