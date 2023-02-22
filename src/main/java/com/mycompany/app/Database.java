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
        String dbUrl = "jdbc:h2:module4db";
        try {
            conn = DriverManager.getConnection(dbUrl);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Database getInstance() {
        return database;
    }

    public Connection getConnection() {
        return conn;
    }
}
