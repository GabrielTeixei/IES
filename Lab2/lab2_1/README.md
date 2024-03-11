## Criar o Projeto

```
mvn archetype:generate -DgroupId=com.myServer.app -DartifactId=MyJettyApp -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

# Projeto Maven com Servidor Java Embutido(Server-side programming with servlet)
* No exercio A):
Serve para ler a página web baseado no seu input, basicamente o servlet container é usar java para gerar  a página web do lado do server. Sendo assim, o servlet container faz uma parte do servidor web que interage com os servlets.

* Exercício B:
Foi  adaptado o exemplo do A) para que o utilizador possa enviar opcionalmente uma mensagem a ser impressa num determinado parâmetro e se não for enviado nada, imprima uma mensagem padrão.



## Configuração do Projeto

1. **Clonar o Repositório:**
git clone [URL_DO_SEU_REPOSITORIO]
cd nome-do-seu-projeto



2. **Maven:**
Certifique-se de ter o Maven instalado. Você pode baixá-lo em [Maven Apache](https://maven.apache.org/download.cgi).

## Executando o Projeto

1. **Instalando Dependências:**
   
```
mvn clean install
```


2. **Iniciando o Servidor Java Embutido:**
   
```
mvn exec:java -Dexec.mainClass="com.myServer.app.EmbeddedJettyExample"
```

3. Após iniciar o servidor, você pode acessar o aplicativo em [http://0.0.0.0:8680/](http://0.0.0.0:8680/).

## Encerrando o Servidor

Para encerrar o servidor, basta pressionar `Ctrl + C` no terminal onde o servidor está sendo executado.

## Estrutura do Projeto

- `src/` - Contém o código-fonte do projeto.
- `pom.xml` - Arquivo de configuração do Maven com as dependências do projeto.

## Exemplo de execução da alinia B)
```
http://0.0.0.0:8680/?msg=ola tudo bem
```

