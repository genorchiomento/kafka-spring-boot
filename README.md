<h1 align="center">
  Spring Boot with Kafka - Messaging
</h1>

<p align="center">
<a href="https://twitter.com/genorchiomento" target="_blank">
    <img align="center" src="https://img.shields.io/static/v1?label=Twitter&message=@genorchiomento&style=flat&logo=Twitter&logoColor=white&color=00acee&labelColor=000000" alt="twitter"/>  
</a>
<img align="center" src="https://img.shields.io/static/v1?label=Type&message=Demo&color=8257E5&labelColor=000000" alt="Demo"/>

</p>

Demo for messaging with Spring Boot and Kafka.

## Technologies

![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)&nbsp;
![Apache Kafka](https://img.shields.io/badge/Apache%20Kafka-000?style=for-the-badge&logo=apachekafka)&nbsp;
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)&nbsp;

## How to Run

- Clone the git repository:

```
git clone https://github.com/genorchiomento/kafka-spring-boot.git
```

- Add Host to Docker Container

```
sudo vim /etc/hosts
```

- Add hostname 'kafka'

```
127.0.0.1       kafka
```
![kafka-hostname](hostname.png)

- Run docker

```
docker-compose up -d
```

- Build the project:

```
./gradlew clean build
```

- Execute:

```
java -jar ./build/libs/kafka-spring-boot-0.0.1-SNAPSHOT.jar
```

- Test

```
http kafka:8080/kafka/hello/{name}
```

- Response

```
Ok! It's works!
```