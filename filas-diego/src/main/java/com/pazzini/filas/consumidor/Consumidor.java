// Declara o nome do pacote para a classe do consumidor de filas RabbitMQ
package com.pazzini.filas.consumidor;

// Importa a classe de configuração do RabbitMQ
import com.pazzini.filas.configuracao.ConfiguracaoRabbitMQ;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

// Marca a classe como um componente gerenciado pelo Spring
@Component
// Configura o consumidor para escutar a fila definida na classe de configuração
@RabbitListener(queues = ConfiguracaoRabbitMQ.NOME_FILA)
public class Consumidor {

    // Método que manipula as mensagens recebidas da fila RabbitMQ
    @RabbitHandler
    public void consumirMenssagem(String mensagem) {
        // Imprime a mensagem recebida no console
        System.out.println("================ RECEBENDO MENSAGEM ================");
        System.out.println("================ " + mensagem);
        System.out.println("================ FIM RECEBENDO MENSAGEM ================");
    }

}
