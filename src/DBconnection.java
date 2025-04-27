/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBconnection {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/shop"; 
        String user = "root"; 
        String password = ""; 

        
        Class.forName("com.mysql.cj.jdbc.Driver");

        
        return DriverManager.getConnection(url, user, password);
    }

    public static void main(String[] args) {
        try {
            Connection conn = getConnection();
            if (conn != null) {
                System.out.println(" Connection Successful!");
                conn.close(); 
            }
        } catch (Exception e) {
            System.out.println(" Connection Failed:");
        }
    }
    
}
