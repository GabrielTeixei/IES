# 3.2 Multilayer applications: exposing data with REST interface

### Configurando um Servidor MySQL com Docker

(1) Execute o seguinte comando para iniciar um contêiner Docker com o servidor MySQL (certifique-se de que o número da porta seja exclusivo e não esteja em uso em seu sistema):

```bash
docker run --name mysql5 -e MYSQL_ROOT_PASSWORD=secret1 -e MYSQL_DATABASE=demo -e MYSQL_USER=demo -e MYSQL_PASSWORD=secret2 -p 33060:3306 -d mysql/mysqlserver:5.7
```

(2) Comecamos criar um novo projeto Spring Boot usando o [Spring Initializr](https://start.spring.io/).

(3) Adicionou as seguintes dependências ao seu projeto: 
* Spring Web
* JPA
* MySQL 
* DevTools
* Validation

(3) Criar Employee entity,Repository para Employees e "REST" controller para disponibilizar a entidade Employee
