// Declara o nome do pacote para a classe do consumidor
package com.pazzini.eventos_diego.consumidor;

// Importa classes do Spring Framework necessárias para configuração do consumidor Kafka
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.stereotype.Component;

// Marca a classe como um componente gerenciado pelo Spring
@Component
public class ConfigConsumidor {

    // Configura o consumidor Kafka com retry e tópico especificado
    @RetryableTopic(attempts = "2")
    @KafkaListener(topics = "${kafka.diego.nome.topico}", groupId = "diegoGroup")
    // Método que consome mensagens do tópico configurado
    public void consumirMensagem(String mensagem) {
        // Verifica se a mensagem contém "DLT" e lança uma exceção para simular um erro
        if (mensagem.contains("DLT")) {
            throw new IllegalArgumentException("Teste de DLT");
        }

        // Imprime a mensagem recebida no console
        System.out.println("=============== RECEBENDO MENSAGEM ===============");
        System.out.println("=============== " + mensagem);
        System.out.println("=============== FIM RECEBENDO MENSAGEM ===============");
    }

    // Método que consome mensagens da fila morta (DLT - Dead Letter Topic) configurada pelo RetryTemplate
    @DltHandler
    public void consumirMensagemDlt(String mensagem) {
        // Imprime a mensagem recebida da fila morta no console
        System.out.println("=============== RECEBENDO MENSAGEM DLT ===============");
        System.out.println("=============== " + mensagem);
        System.out.println("=============== FIM RECEBENDO MENSAGEM DLT ===============");
    }
}
