package com.example.connectionmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ausgabe {
    public static void auslese() {
        System.out.println("Hier Kannst du deine Tabelle mit Werten aus lesen");
        System.out.println("-------------------------------------------------" + "\n");
        System.out.println("Welche Tabelle möchtest du ausgelesen bekommen?");
        Scanner sc = new Scanner(System.in);
        String eingabe = sc.next();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikum", "root", "");
            PreparedStatement stm = conn.prepareStatement("SELECT * FROM " + eingabe + ";");

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getString(4));
            }

            stm.close();
            conn.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return;
    }
}
