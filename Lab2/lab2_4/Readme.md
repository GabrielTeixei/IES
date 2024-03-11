# RESTful Web Service: Random Quotes from Movies/Shows

Este é um exemplo simples de uma API REST que fornece citações aleatórias de filmes e shows. A API suporta os seguintes endpoints:

- **GET /quotes:** Retorna uma citação com base no ID do filme/show fornecido como parâmetro.
- **GET /shows:** Retorna uma lista de todos os filmes/shows disponíveis.
- **GET /quote:** Retorna uma citação aleatória de um filme/show.

## Tecnologias Utilizada
- **Java:** Spring Boot para construir a API RESTful.
- **spring-boot:** Framework Java que simplifica o desenvolvimento de aplicativos, fornecendo configuração fácil e recursos prontos para uso. 
- **JSON:** Formato de troca de dados para respostas da API.


1. **Executar a aplicação:**
```sh
$ mvn install -DskipTests && java -jar target\webapp1-0.0.1-SNAPSHOT.jar
or
$ ./mvnw spring-boot:run
```


4. **Acessar os endpoints da API:**
- Citação com ID específico: `http://localhost:8080/quotes?show=<id_do_filme>`
- Lista de Shows: `http://localhost:8080/shows`
- Citação Aleatória: `http://localhost:8080/quote`

## Exemplos de Respostas da API

### GET /quotes?show=<id_do_filme>
```json
{
"id": 1,
"title": "Avengers: Age of Ultron",
"quote": "There is only one path to peace... your extinction.",
"name": "Ultron"
}
```

### GET /shows
```json
[
  {
    "id": 1,
    "title": "Avengers: Age of Ultron",
    "name": "Ultron"
  },
  {
    "id": 2,
    "title": "Barbie",
    "name": "Barbie"
  },
 
]
```

### GET /quote

```json
{
  "id": 3,
  "title": "hacker",
  "quote": "Teste.",
  "name": "hacker"
}
```
