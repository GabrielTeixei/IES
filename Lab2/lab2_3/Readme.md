# Spring Boot: Desenvolvimento de Aplicações Rápidas

* O Spring Boot é uma plataforma de desenvolvimento de aplicativos rápidos construída sobre o popular Spring Framework. Ao assumir escolhas opinativas por padrão, 
como opções de configuração comuns sem a necessidade de especificar tudo, o Spring Boot é uma adição de convenção sobre configuração à plataforma Spring. Isso torna mais fácil começar com o mínimo de esforço e criar aplicati
vos autônomos de qualidade para produção.

## Configuração Inicial

* Para começar com o projeto Spring Boot,temos que usar o Spring Initializr, uma ferramenta online que facilita a configuração inicial do nosso aplicativo.
Basa aceder ao [Spring Initializr](https://start.spring.io/) para criar um novo projeto Maven com a dependência "Spring Web". Faça o download do "starter kit" gerado.

### Como Executar o Aplicativo

* Após baixar o projeto,devemos usar os seguintes comandos para compilar e executar seu aplicativo Spring Boot:

```bash
mvn install -DskipTests && java -jar target\webapp1-0.0.1-SNAPSHOT.jar
or
./mvnw spring-boot:run

```
Acesse seu aplicativo atravez:
```
http://localhost:8080/
```

### Spring Boot Actuator

* Se for preciso utilizar o Spring Boot basta executar os seguintes comandos:

```bash
mvn clean install
./mvnw spring-boot:run
```
Exemplo do exercicio 2.3 C):
```
http://localhost:8080/greeting?name=melo
```
