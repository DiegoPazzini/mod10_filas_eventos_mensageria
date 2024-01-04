// Declara o nome do pacote para a classe de configuração do RabbitMQ
package com.pazzini.filas.configuracao;

// Importa classes necessárias do Spring Framework para configuração
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Classe de configuração do RabbitMQ
@Configuration
public class ConfiguracaoRabbitMQ {

    // Constantes para definir o nome da fila, exchange e rota
    public static final String NOME_FILA = "fila-diego";
    public static final String NOME_EXCHANGE = "exchange-diego";
    public static final String NOME_ROTA = "diego.rota.#";

    // Método que cria um bean para configurar a fila
    @Bean
    public Queue queue() {
        return new Queue(NOME_FILA, false);
    }

    // Método que cria um bean para configurar a exchange
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(NOME_EXCHANGE);
    }

    // Método que cria um bean para configurar o binding entre a fila e a exchange
    @Bean
    public Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(NOME_ROTA);
    }
}
