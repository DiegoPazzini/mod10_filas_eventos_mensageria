// Declara o nome do pacote para a classe principal
package com.pazzini.diego_toggle_client;

// Importa as classes do Spring Boot necessárias para configurar e iniciar a aplicação
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Anotação que combina @Configuration, @EnableAutoConfiguration e @ComponentScan
// Marca a classe como a classe de configuração principal de uma aplicação Spring Boot
@SpringBootApplication
public class DiegoToggleClientApplication {

    // Método principal, ponto de entrada para a aplicação Spring Boot
    public static void main(String[] args) {
        // Inicia a aplicação Spring Boot, passando a classe principal e os argumentos da linha de comando
        SpringApplication.run(DiegoToggleClientApplication.class, args);
    }
}
