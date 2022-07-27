FROM openjdk:8
ADD target/java-jenkins-docker.jar java-jenkins-docker.jar
ENTRYPOINT ["java&quot;, "-jar&quot;,"java-jenkins-docker.jar"]
EXPOSE 9091