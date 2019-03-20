package com.example.connectionmysql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class insertInto {
    public static void insert(){
        System.out.println("Wie viele werte wollen sie eingeben?");
        Scanner sc = new Scanner(System.in);
        System.out.print("Eingabe : " );
        int zahl = sc.nextInt();

        for (int i = 0;i< zahl; ++i){

            System.out.print("Geben sie den Vornamen ein: ");
            String vn = sc.next();
            System.out.print("Geben sie den Nachnamen ein: ");
            String nn = sc.next();
            System.out.println("Geben sie das Geburtsdatum ein: ");
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            java.util.Date d = new GregorianCalendar(year, month-1, day).getTime();
            System.out.println("Das eingegebene Datum ist: "+d);

        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikum", "root", "");
            PreparedStatement stm = conn.prepareStatement("insert into itam (vorname,Nachname,CREATED_DATE ) values ( ?, ?,?)");

            stm.setString(1,vn);
            stm.setString(2,nn);
            stm.setDate(3,new java.sql.Date(d.getTime()));

            stm.execute();
            stm.close();
        }catch (Exception e){
          System.err.println(e.getMessage());
        }

        }return;
    }
}
