FROM frolvlad/alpine-oraclejdk8:slim
EXPOSE 9000
VOLUME /tmp
ADD dockerized_claims_adjudication-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]