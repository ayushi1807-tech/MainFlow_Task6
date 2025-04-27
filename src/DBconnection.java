/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBconnection {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/shop"; // Replace 'shop' with your database name
        String user = "root"; // Change if your username is different
        String password = ""; // Add your MySQL password here

        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Create and return connection
        return DriverManager.getConnection(url, user, password);
    }

    // Main method to test the connection
    public static void main(String[] args) {
        try {
            Connection conn = getConnection();
            if (conn != null) {
                System.out.println(" Connection Successful!");
                conn.close(); // Always close the connection
            }
        } catch (Exception e) {
            System.out.println(" Connection Failed:");
        }
    }
    
}
