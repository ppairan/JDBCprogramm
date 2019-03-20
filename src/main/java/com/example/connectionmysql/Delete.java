package com.example.connectionmysql;

import java.sql.*;
import java.util.Scanner;

public class Delete {
    public static void kill() {
        System.out.println("Hier können sie Tabellenreihen löschen");
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.println("Von Welcher Tabelle wollen sie löschen?");
        System.out.print("Eingabe:");
        Scanner sc = new Scanner(System.in);
        String eingabe = sc.next();


        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikum", "root", "");
            PreparedStatement stm = conn.prepareStatement("SELECT * FROM " + eingabe + ";");

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3));
            }

            stm.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Welchen Namen wollen sie löschen");
        int id = sc.nextInt();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikum", "root", "");
            PreparedStatement stm = conn.prepareStatement("DELETE FROM " + eingabe + " WHERE ID = ? ;");

            stm.setInt(1, id);

            stm.executeUpdate();

            conn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }return;
    }
}
