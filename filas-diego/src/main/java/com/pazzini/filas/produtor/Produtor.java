// Declara o nome do pacote para a classe do produtor de filas RabbitMQ
package com.pazzini.filas.produtor;

// Importa a classe de serviço do RabbitMQ
import com.pazzini.filas.service.ServicoRabbitMQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Marca a classe como um controlador REST do Spring
@RestController
// Mapeia as requisições para o caminho "/mensagens" para este controlador
@RequestMapping("/mensagens")
public class Produtor {

    // Injeta uma instância do ServicoRabbitMQ
    @Autowired
    private ServicoRabbitMQ servicoRabbitMQ;

    // Mapeia as requisições HTTP POST para este método
    @PostMapping
    // Método que recebe uma mensagem no corpo da requisição e a envia para a fila RabbitMQ usando o serviço injetado
    public void enviarMensagem(@RequestBody String mensagem) {
        // Imprime a mensagem a ser enviada no console para fins de demonstração
        System.out.println("========= Enviando mensagem: " + mensagem);

        // Chama o método do serviço para enviar a mensagem para a fila RabbitMQ
        servicoRabbitMQ.enviaMenssagem(mensagem);
    }
}
