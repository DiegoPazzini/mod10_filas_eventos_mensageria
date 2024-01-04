// Declara o nome do pacote para a classe Java
package com.pazzini.diego_eventos;

// Importa a classe SpringApplication do framework Spring Boot
import org.springframework.boot.SpringApplication;

// Importa a anotação SpringBootApplication do framework Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Marca a classe como uma aplicação Spring Boot
@SpringBootApplication
public class DiegoEventosApplication {

    // Método principal, ponto de entrada para a aplicação
    public static void main(String[] args) {
        // Chama o método run de SpringApplication para iniciar a aplicação Spring Boot
        SpringApplication.run(DiegoEventosApplication.class, args);
    }
}
