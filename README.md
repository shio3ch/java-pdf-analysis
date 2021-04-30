# Spring-Boot Web Application

This project is study for Spring-Boot webapp.

## Project overview

### Java version

* Java 11

### Framework

* Spring-Boot

### Build

* Gradle

### DB

* PostgresSQL

## Start up

### Make your local development environment

Run the following command in your project directory.
Run DB in docker.

```shell
docker-compose up -d
```

Initialize tables and records.

```shell
docker-compose run --rm flyway-migrate
```

Run java application.

```shell
gradlew bootRun
```
