FROM openjdk:11.0.2-jre-slim
COPY out/artifacts/formalGreeting_jar/formalGreeting.jar .
CMD /usr/bin/java -cp formalGreeting.jar src.main.java.com.example.restservice
EXPOSE 5050