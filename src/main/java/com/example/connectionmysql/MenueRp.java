package com.example.connectionmysql;

import java.util.Scanner;

public class MenueRp {
    public static void reapeat(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Wollen sie zurük zum Menü?");
        String jaNein = sc.next();
        if (jaNein.equals("j")){
            Menue.auswahl();
        }else {
            MenueRp.exit();
        }
    }
    public static void exit(){
        System.out.println("Das Programm wird beendet");
        System.exit(0);
    }

}
