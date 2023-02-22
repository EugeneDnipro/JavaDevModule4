package com.mycompany.app;

import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitService {
    public static void main(String[] args) throws SQLException {
        try (Statement stmt = Database.getInstance().getConnection().createStatement()) {
        }
    }
}