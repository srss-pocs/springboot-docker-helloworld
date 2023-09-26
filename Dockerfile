FROM openjdk:21
EXPOSE 8080
ADD target/spring-boot-docker-helloworld.jar spring-boot-docker-helloworld.jar 
ENTRYPOINT ["java","-jar","/spring-boot-docker-helloworld.jar"]