package com.example.connectionmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;





@SpringBootApplication
public class ConnectionmysqlApplication{

    public static void main(String[] args)  {
        ApplicationContext app = SpringApplication.run(ConnectionmysqlApplication.class, args);
        System.out.println();
        System.out.println();
        Menue.auswahl();

    }


}
