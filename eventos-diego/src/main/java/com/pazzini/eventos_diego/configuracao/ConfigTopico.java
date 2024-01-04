// Declara o nome do pacote para a classe de configuração
package com.pazzini.eventos_diego.configuracao;

// Importa classes do Spring Framework necessárias para configuração
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

// Classe de configuração Spring
@Configuration
public class ConfigTopico {

    // Injeta o valor da propriedade "kafka.diego.nome.topico" do arquivo de configuração
    @Value("${kafka.diego.nome.topico}")
    private String nomeTopico;

    // Método que cria um bean do tipo NewTopic para configurar um tópico no Apache Kafka
    @Bean
    public NewTopic topicoDiego() {
        // Utiliza o TopicBuilder do Spring Kafka para criar e configurar o tópico
        return TopicBuilder.name(nomeTopico)
                    .partitions(1)
                    .replicas(1)
                    .build();
    }
}
