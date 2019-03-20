package com.example.connectionmysql;

import java.sql.*;
import java.util.Scanner;

public class Tables {
    public static void create() {
        System.out.println("Hier können sie die eine Neue Tabelle erzeugen!");
        System.out.println("-----------------------------------------------");
        System.out.println("Wir brauchen nur ein parr Werte :)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie soll die die Tabelle heißen?");
        String tn = sc.next();
        //System.out.println("Was soll die Tabelle enthalten");


        String createTableSQL = "CREATE TABLE" + tn + "(" + "ID Integer(5) NOT NULL AUTO_INCREMENT, " + "vorname VARCHAR(20) NOT NULL, "
                + "Nachname VARCHAR(20) NOT NULL, " + "CREATED_DATE DATE NOT NULL, " + "PRIMARY KEY (USER_ID) " + ")";

        try {

            System.out.println("Connecting to database...");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikum", "root", "");
            Statement stm = conn.createStatement(); // Variable zur Statement erzeugung ;)
            DatabaseMetaData dbm = conn.getMetaData();
            ResultSet rs = dbm.getTables(null, null, "ITAM", null);
            if (rs.next()) {

                System.out.println("Tabelle existiert schon!");

                return;


            } else {
                stm.execute(createTableSQL); // Erzeugt eine Tabelle
                return;
            }
        } catch (Exception e) {
            System.out.print("Do not connect to DB - Error:" + e);
        }
    }

    public static void delete() {

    }
}

