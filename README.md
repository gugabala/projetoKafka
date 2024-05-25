# Teste de Aplicação Kafka

Este repositório contém uma aplicação de teste para integração com o Apache Kafka. A aplicação consiste em um produtor e um consumidor Kafka simples, construídos com o Spring Boot.

## Como Usar

### Pré-requisitos

Certifique-se de ter o Docker instalado na sua máquina.

### Iniciando o Kafka

Execute o seguinte comando para iniciar uma instância do Kafka usando Docker Compose:

```bash
docker-compose up -d
```

### Testando a Aplicação

Você pode testar a aplicação Kafka usando os seguintes comandos cURL:

1. Publicando uma mensagem no tópico "topicA":

```bash
curl -X POST http://localhost:8080/publish?topic=topicA \
     -H "Content-Type: application/json" \
     -d '{"content": "HelloTopicA", "sender": "UserA"}'
```

2. Publicando uma mensagem no tópico "topicB":

```bash
curl -X POST http://localhost:8080/publish?topic=topicB \
     -H "Content-Type: application/json" \
     -d '{"content": "HelloTopicB", "sender": "UserB"}'
```

## Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request ou relatar um problema.
