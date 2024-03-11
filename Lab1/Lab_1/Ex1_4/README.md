# IES_107876
Introdução à Engenharia de Software

Foi feitos exercicos de docker e docker compose exestentes em links de referência.

**Docker Compose Example**

+ Create a directory for the project:
```
mkdir composetest
cd composetest
```

+ Create a file called app.py.

+ Create another file called requirements.txt in your project directory and paste the following code in:
```
flask
redis
```

+ create a file named Dockerfile

+ Create a file called compose.yaml in your project directory and paste the following:
```
services:
  web:
    build: .
    ports:
      - "8000:5000"
  redis:
    image: "redis:alpine"
```


+ Build and run your app with Compose:
```
docker compose up.
```


+ To view the containers created by Docker Compose:
```
docker images
ou 
docker images ls

```

+ To stop the containers created by Docker Compose:

```
docker ps
```

+ Used to stop and remove the containers that have been created docker compose:
```
docker-compose down
```
+ In a browser to see the application running.
```
http://localhost:8000/

```
 + run a java file from command line passing arguments
```
mvn exec:java -Dexec.mainClass="what to put here?" -Dexec.args="arg0 arg1 arg2"
```

***Experiment with some other commands***

+ If you want to run your services in the background, you can pass the -d
```
docker compose up -d
```

+ Command allows you to run one-off commands for your services

```
docker compose run web env
```

+  Stop your services once you've finished with them:
```
docker compose stop
```

+ You can bring everything down, removing the containers entirely, with the down command. Pass --volumes to also remove the data volume used by the Redis container:
```
docker compose down --volumes
```
