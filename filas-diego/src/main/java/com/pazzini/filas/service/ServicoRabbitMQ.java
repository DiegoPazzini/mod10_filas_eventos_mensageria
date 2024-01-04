// Declara o nome do pacote para a classe do serviço RabbitMQ
package com.pazzini.filas.service;

// Importa classes necessárias do Spring Framework para configuração do serviço
import com.pazzini.filas.configuracao.ConfiguracaoRabbitMQ;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Marca a classe como um componente gerenciado pelo Spring
@Component
public class ServicoRabbitMQ {

    // Injeta uma instância de RabbitTemplate para interagir com o RabbitMQ
    @Autowired
    private RabbitTemplate rabbitTemplate;

    // Método que envia uma mensagem para a exchange RabbitMQ usando o RabbitTemplate
    public void enviaMenssagem(String mensagem) {
        // Utiliza o RabbitTemplate para converter e enviar a mensagem para a exchange e rota configuradas
        rabbitTemplate.convertAndSend(ConfiguracaoRabbitMQ.NOME_EXCHANGE, "sam.rota.mensagem", mensagem);
    }
}
