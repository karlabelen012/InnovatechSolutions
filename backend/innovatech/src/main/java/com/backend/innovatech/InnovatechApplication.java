package com.backend.innovatech;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration; // Importa esto

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) // Añade la exclusión aquí
public class InnovatechApplication {
    public static void main(String[] args) {
        SpringApplication.run(InnovatechApplication.class, args);
    }
}