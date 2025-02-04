package com.example.sample2.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseTest {

    @Test
    public void ConnectionTest() throws Exception {

        Class.forName("org.mariadb.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/test",
                "root",
                "admin"
        );

        Assertions.assertNotNull(connection);

        connection.close();
    }
}
