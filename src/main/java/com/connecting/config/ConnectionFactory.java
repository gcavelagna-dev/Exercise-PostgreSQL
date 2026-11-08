package com.connecting.config;

import com.connecting.shared.connection.ConnectionFileNotFoundException;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    public static Connection connection() throws SQLException {

        Properties properties = new Properties();

        try (InputStream file = ConnectionFactory.class.getClassLoader().getResourceAsStream("database.properties")) {

            if (file == null) {
                throw new ConnectionFileNotFoundException("Error: file database.properties not found.");
            }
            properties.load(file);

        } catch (IOException e) {
            throw new ConnectionFileNotFoundException("Error: File is not load.", e);
        }

        String url = properties.getProperty("db.url");
        String username = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");

        if (url == null || url.isBlank() || username == null || password == null) {
            throw new IllegalArgumentException("Error: Null access credentials.");
        }

        return DriverManager.getConnection(url, username, password);
    }
}
