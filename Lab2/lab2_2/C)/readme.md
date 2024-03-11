# Server-side programming and application servers (Tomcat)

* O exercio C) funciona para todo o Server-side programming and application servers (Tomcat). 
*  Este é um projeto Maven JavaEE usando o Jakarta EE Web Application Archetype com um servidor Java embutido. O projeto usa o Apache Maven para gerenciamento de dependências e compilação.
crair y creating a new Jakarta EE application, based on the Web profile.

##  My Jakarta EE Project
**Criação do projeto**
```
mvn archetype:generate -DgroupId=com.example -DartifactId=my-jakartaee-project -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Pré-requisitos

Antes de começar, certifique-se de ter o Maven instalado em sua máquina.

## Instalação

1. **Clone o repositório:**

```bash
git clone https://github.com/seu-usuario/my-jakartaee-project.git
```


1. **Navegue até o diretório do projeto:**
   
```
cd my-jakartaee-project
```

2.**Compile o projeto usando o Maven:**

```
mvn clean install
```
3.**Execute o aplicativo**
```
docker-compose up
```
5.**Para aceser ao aplicativo:**
```
http://localhost:8888/
```
