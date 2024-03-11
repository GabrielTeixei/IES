
# Dockerized Tomcat Deployment for Java Web Application

This repository demonstrates how to deploy a Java web application packaged as a `.war` file using Docker and Docker Compose.

## Prerequisites

- Docker installed on your system.
- Java web application packaged as a `.war` file.


# Dockerized Tomcat Deployment for Java Web Application

This repository demonstrates how to deploy a Java web application packaged as a `.war` file using Docker and Docker Compose.


## Getting Started
Start Docker containers:


```sh
docker-compose up
```
List running containers:

```sh
docker ps
```
View logs for all services:

```sh
docker-compose logs
```

View logs for a specific service (replace my-web-app with your service name):

```sh
docker-compose logs my-web-app
```

Rebuild images and restart services:
```sh
docker-compose up --build
```
Compile, package, and run the application locally:

```sh
mvn clean package tomcat:run
```

## Notes

If you need to redeploy your app, stop the deployment using:

```sh
docker-compose down
```
2. Build and start the Docker containers:

   ```sh
   docker-compose up

   ```
