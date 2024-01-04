// Declara o nome do pacote para a classe do serviço de envio de mensagens para o Kafka
package com.pazzini.eventos_diego.servico;

// Importa classes do Spring Framework necessárias para configuração do serviço
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

// Marca a classe como um componente gerenciado pelo Spring
@Component
public class ServicoEnvioMensagensKafka {

    // Injeta uma instância de KafkaTemplate para envio de mensagens para o Kafka
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    // Injeta o valor da propriedade "kafka.diego.nome.topico" do arquivo de configuração
    @Value("${kafka.diego.nome.topico}")
    private String nomeTopico;

    // Método que envia uma mensagem para o Kafka no tópico configurado
    public void enviarMensagem(String mensagem) {
        // Imprime a mensagem a ser enviada no console para fins de demonstração
        System.out.println("================== ENVIANDO MENSAGEM: " + mensagem);
        // Usa o KafkaTemplate para enviar a mensagem para o Kafka no tópico configurado
        kafkaTemplate.send(nomeTopico, mensagem);
    }
}
