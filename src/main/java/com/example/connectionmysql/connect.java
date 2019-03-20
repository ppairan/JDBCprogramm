package com.example.connectionmysql;

import java.sql.*;

public class connect {
    public static void sqlconnect()  {





        try {

            System.out.println("Connecting to database...");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikum", "root", "");

            System.out.println("Verbindung steht :)");



            conn.close();

        } catch (Exception e) {
            System.out.print("Do not connect to DB - Error:" + e);
        }

        MenueRp.reapeat();
    }
}
