FROM java:7
VOLUME /tmp
ADD recipes-1.0-SNAPSHOT.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8982
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
