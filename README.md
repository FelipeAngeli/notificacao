# Notificação de Tarefas

Este projeto é uma aplicação Spring Boot que envia notificações de tarefas por e-mail utilizando Thymeleaf para renderizar os templates de e-mail.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Thymeleaf
- Gradle

## Configuração do Projeto

### Pré-requisitos

- Java 11 ou superior
- Gradle
- Conta de e-mail no Gmail

### Configuração do E-mail

No arquivo `src/main/resources/application.yaml`, configure as propriedades do e-mail:

```yaml
spring:
  mail:
    host: smtp.gmail.com
    port: 587
    username: SEU EMAIL
    password: SEU PASSWORD DO GMAIL
    protocol: smtp
    properties:
      mail:
        smtp:
          socketFactory:
            port: 465
            class: javax.net.ssl.SSLSocketFactory
            fallback: false
          auth: true
          starttls:
            enable: true
          connectiontimeout: 5000
          timeout: 3000
          writetimeout: 5000

  thymeleaf:
    enable: true

envio:
  email:
    remetente: SEU EMAIL
    nomeRemetente: 'SEU NOME'

server:
  port: 8082
```

### Executando a Aplicação

Para executar a aplicação, utilize o seguinte comando:

```sh
./gradlew bootRun
```

A aplicação estará disponível em `http://localhost:8082`.

## Estrutura do Projeto

- `src/main/java/com/felipe/notificacao/NotificacaoApplication.java`: Classe principal da aplicação.
- `src/main/resources/templates/notificacao.html`: Template Thymeleaf para o e-mail de notificação.
- `src/main/resources/application.yaml`: Arquivo de configuração da aplicação.

## Licença

Este projeto está licenciado sob os termos da licença MIT. Para mais informações, consulte o arquivo `LICENSE`.
