FROM amazoncorretto:17
MAINTAINER LUCASORTIZ
COPY target/LucasOrtiz-0.0.1-SNAPSHOT.jar lucas-ortiz-app.jar
ENTRYPOINT ["java","-jar","/lucas-ortiz-app.jar"]
EXPOSE 8080