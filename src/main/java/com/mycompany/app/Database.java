package com.mycompany.app;

import java.sql.*;

public class Database {
    private static final Database database;
    private Connection conn;

    static {
        try {
            database = new Database();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Database() throws SQLException {
        String dbUrl = "jdbc:h2:˜/module4db";
        try {
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection(dbUrl, "sa", "");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Database getInstance() {
        return database;
    }

    public Connection getConnection() {
        return conn;
    }
}
