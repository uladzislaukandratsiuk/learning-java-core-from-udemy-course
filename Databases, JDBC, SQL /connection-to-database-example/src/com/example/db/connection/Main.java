package com.example.db.connection;

import java.sql.*;

public class Main {

    private static final String URL
            = "jdbc:sqlite:/home/vlad/java-core/Databases, JDBC, SQL /connection-to-database-example/test.db";

    private static final String CREATE_TABLE_CONTACTS
            = "CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)";

    public static void main(String[] args) {

        try (Connection myConn = DriverManager.getConnection(URL);
             Statement myStmt = myConn.createStatement()) {

            myStmt.execute(CREATE_TABLE_CONTACTS);

            myStmt.execute("INSERT INTO contacts (name, phone, email) " +
                    "VALUES  ('Vlad', 1425232, 'vlad@mail.com')");
            myStmt.execute("INSERT INTO contacts (name, phone, email) " +
                    "VALUES  ('Ivan', 7451232, 'ivan@mail.com')");
            myStmt.execute("INSERT INTO contacts (name, phone, email) " +
                    "VALUES  ('Ann', 2371243, 'ann@mail.com')");

            myStmt.execute("UPDATE contacts SET phone=5217451 WHERE name='Ann'");

            myStmt.execute("DELETE FROM contacts WHERE name='Vlad'");

            myStmt.execute("SELECT * FROM contacts");

            try (ResultSet myRs = myStmt.getResultSet()) {
                while (myRs.next()) {
                    System.out.println(myRs.getString("name") + " "
                            + myRs.getInt("phone") + " "
                            + myRs.getString("email"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
