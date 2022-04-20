FROM openjdk:8-jdk-alpine

EXPOSE 9091

ADD /target/demo-mongodb-0.0.1-SNAPSHOT.jar demo-mongodb-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/demo-mongodb-0.0.1-SNAPSHOT.jar"]
