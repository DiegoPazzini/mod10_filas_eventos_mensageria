// Declara o nome do pacote para a classe do produtor
package com.pazzini.eventos_diego.produtor;

// Importa classes do Spring Framework necessárias para configuração do controlador REST
import com.pazzini.eventos_diego.servico.ServicoEnvioMensagensKafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Marca a classe como um controlador REST
@RestController
// Mapeia as requisições para o caminho "/eventos" para este controlador
@RequestMapping("/eventos")
public class ProdutorController {

    // Injeta uma instância do ServicoEnvioMensagensKafka
    @Autowired
    private ServicoEnvioMensagensKafka servicoEnvioMensagensKafka;

    // Mapeia as requisições HTTP POST para este método
    @PostMapping
    // Método que recebe uma mensagem no corpo da requisição e a envia para o Kafka usando o serviço injetado
    public void enviaMensagem(@RequestBody String mensagem) {
        // Chama o método do serviço para enviar a mensagem para o Kafka
        servicoEnvioMensagensKafka.enviarMensagem(mensagem);
    }
}
