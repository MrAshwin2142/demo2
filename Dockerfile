# FROM  openjdk:17
FROM --platform=linux/amd64 maven:3-jdk-17
ADD target/demo-0.0.1-SNAPSHOT.jar demo-docker.jar
ENTRYPOINT [ "java","-jar","demo-docker.jar" ]
