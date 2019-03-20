package com.example.connectionmysql;

import java.util.Scanner;

public class Menue {
    public static void auswahl() {
        System.out.println("--------------------------------");
        System.out.println("");
        System.out.println("1.Werte eingeben in eine Tabelle");
        System.out.println("2.Werte ausgeben aus einer Tabelle");
        System.out.println("3.Werte Löschen aus einer Tabelle");
        System.out.println("4.Werte bearbeiten aus einer Tabelle WIP");
        System.out.println("5.Neue Tabelle einpflegen WIP");
        System.out.println("6.Ganze Tabelle löschen WIP");
        System.out.println("7.Server check");
        System.out.println("-----------------------------------");
        System.out.print("Eingabe: ");

        boolean x = true;


        Scanner sc = new Scanner(System.in);
        int eingabe = sc.nextInt();
        switch (eingabe) {
            case 1:
                insertInto.insert();
                MenueRp.reapeat();
                break;
            case 2:
                Ausgabe.auslese();
                MenueRp.reapeat();

                break;
            case 3:
                Delete.kill();
                MenueRp.reapeat();

                break;
            case 4:
                Bearbeiten.change();
                MenueRp.reapeat();

                break;
            case 5:
                Tables.create();
                MenueRp.reapeat();

                break;
            case 6:
                Tables.delete();
                MenueRp.reapeat();

                break;
            case 7:
                connect.sqlconnect();
                MenueRp.reapeat();

                break;
            default:
                System.out.println("Bitte geben sie die Zahlen ein");

        }

    }
}
