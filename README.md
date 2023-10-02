Spring Boot 3.1.4

A Simple Spring Boot Docker Hello World Application 

Steps
1. Install Docker Desktop [https://docs.docker.com/desktop/install/windows-install/]
2. Open command prompt in admin mode and run  "wsl install"
3. swl -l -v should be version 2
4. check docker version -> docker -v
5. Check the Dockerfile for instructions
6. run maven build check target folder for jar [mentioned jar name in pom.xml] [mvn clean install]
7. run docker build from project root directory like > docker build -t springboot.jar [mentioned jar name in pom.xml] .
8. Example : docker build -t spring-boot-docker-helloworld.jar  . [dot -> from same directory]
9. docker image ls
10. docker run -p 9090:8080 spring-boot-docker-helloworld.jar
11. 8080 : is springboot port runs in docker
12. 9090 : on which we can access the API
13. http://localhost:9090/message

----
docker tag spring-boot-docker-helloworld.jar .../spring-boot-docker-helloworld.jar

docker push .../spring-boot-docker-helloworld.jar
