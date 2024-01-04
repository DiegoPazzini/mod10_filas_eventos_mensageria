// Declara o nome do pacote para o controlador
package com.pazzini.diego_toggle_client.controller;

// Importa as anotações do Spring Framework
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Indica que este bean deve ser recarregado quando há uma atualização no servidor de configuração
@RefreshScope
// Marca a classe como um controlador Spring MVC
@RestController
// Mapeia as requisições para o caminho "/mensagens" para este controlador
@RequestMapping("/mensagens")
public class MessageController {

    // Injeta o valor da propriedade "client.message" do servidor de configuração
    @Value("${client.message:Oi, não tenho mensagem!}")
    private String message;

    // Injeta o valor da propriedade "cliente.lisgadesliga" do servidor de configuração
    @Value("${cliente.lisgadesliga:false}")
    private boolean ligaDesliga;

    // Mapeia as requisições HTTP GET para este método
    @GetMapping
    // Retorna a mensagem com base na configuração do cliente
    public String getMessage() {
        // Verifica se a funcionalidade está ligada, se sim, retorna a mensagem, caso contrário, informa que está desligada
        if (ligaDesliga) return this.message;
        return "Funcionalidade desligada.";
    }
}
