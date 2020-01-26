package com.example.db.connection;

import java.sql.*;

public class Main {

    private static final String URL
            = "jdbc:sqlite:/home/vlad/java-core/Databases, JDBC, SQL /connection-to-database-example/test.db";

    private static final String CREATE_TABLE_CONTACTS
            = "CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)";

    public static void main(String[] args) {

        try (Connection myConn = DriverManager.getConnection(URL);
             Statement myStmt = myConn.createStatement()) {

            myStmt.executeQuery(CREATE_TABLE_CONTACTS);

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
