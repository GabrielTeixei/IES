# 3.1 Accessing databases in SpringBoot

Foi nos inbotidos a criar projeto Spring Boot e implementar um aplicativo CRUD (Create, Read, Update, Delete) usando Spring Data JPA com foco em acesso e persistência de dados. 

(1) Comecamos criar um novo projeto Spring Boot usando o [Spring Initializr](https://start.spring.io/).

(2) Adicionou as seguintes dependências ao seu projeto: 
* Spring Web
* Thymeleaf
* Spring Data
* JPA
* H2 
* Database
* Validation

Essas dependências são as que vao construir um aplicativo da web com acesso a banco de dados.
### The “UserController” class gets an instance of “userRepository” through its constructor; how is this new repository instantiated?
* A classe "UserController" obtém uma instância do "userRepository" por meio de seu construtor. 

### List the methods invoked in the “userRepository” object by the “UserController”. Where are these methods defined?

+ O objeto "userRepository" no "UserController" é usado para realizar várias operações de acesso a dados, como guardar, atualizar e consultar dados de utilizador e eliminar.
+ 
### Where is the data being saved?
* Os dados são salvos usando o método "save" fornecido pelo "userRepository". Quando um novo utilizador é criado, o método "save" é usado para persistir os dados no banco de dados.

### Where is the rule for the “not empty” email address defined?
* A regra "não vazio" é definida na classe User, com a anotação @NotBlank ao declarar o atributo.

Foi adicionado o campo `phone` na classe User.java
```java
@Pattern(regexp="(^$|[0-9]{10})")
    @NotBlank(message = "Phone is mandatory")
    private String phone;
```
E implementado Getter and Setter e uma pequena adicão ao toString
```java
public String getPhone(){
        return this.phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
```
