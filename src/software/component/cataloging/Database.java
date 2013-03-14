/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software.component.cataloging;

/**
 *
 * @author R0$H4N
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    Connection conn = null;

    public Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String dbName = "software_catalog";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "software_catalog";
            String password = "12345678";
            try {
                Class.forName(driver).newInstance();
                conn = DriverManager.getConnection(url + dbName, userName, password);

            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("Database.getConnection() Error -->" + ex.getMessage());
                return null;
            }
            return conn;
        } catch (InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
}