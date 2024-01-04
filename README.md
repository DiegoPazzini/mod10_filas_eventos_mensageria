# Sistema de Mensageria com Spring Boot e RabbitMQ

Este projeto consiste em uma aplicação Java desenvolvida com o framework Spring Boot para demonstrar a integração entre sistemas usando o protocolo de mensageria RabbitMQ. A aplicação possui três módulos principais: produtor, consumidor e configuração.

Módulo Produtor:

O módulo com.pazzini.filas.produtor é responsável por disponibilizar uma API REST para envio de mensagens para uma fila RabbitMQ.
Um controlador REST (ProdutorController) recebe mensagens via requisições HTTP POST e utiliza um serviço (ServicoRabbitMQ) para enviá-las à fila configurada.

Módulo Consumidor:

O módulo com.pazzini.filas.consumidor contém um consumidor RabbitMQ (Consumidor) que escuta a mesma fila configurada pelo produtor.
As mensagens recebidas pelo consumidor são processadas e impressas no console.

Módulo Configuração:

O módulo com.pazzini.filas.configuracao é responsável por configurar elementos essenciais do RabbitMQ, como a fila, exchange e rota.
A classe ConfiguracaoRabbitMQ define beans para a fila, exchange e binding, além de constantes para os nomes desses componentes.

Outros Módulos:

Os demais módulos (com.pazzini.filas.service, com.pazzini.filas) contêm serviços e configurações auxiliares necessários para a integração com o RabbitMQ.

Instruções de Execução:

Certifique-se de ter uma instância do RabbitMQ em execução.
Clone o repositório e importe o projeto em sua IDE favorita.
Execute a classe FilasApplication no módulo principal para iniciar a aplicação Spring Boot.

Testes:

Testes unitários e de contexto estão disponíveis para verificar o correto funcionamento dos componentes.
Para mais detalhes, consulte a documentação e os comentários nos códigos-fonte. Este projeto visa fornecer uma base simples e clara para iniciar o desenvolvimento de sistemas baseados em mensageria com Spring Boot e RabbitMQ.


## Skills utilizadas:
<div style="display: inline_block"><br>
   <img align="center" alt="Spring" height="50" width="50" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg">
  <img align="center" alt="Spring" height="60" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">






