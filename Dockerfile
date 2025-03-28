FROM eclipse-temurin:17
COPY target/taskproducer.jar taskproducer.jar
CMD [ "java","-jar","taskproducer.jar" ]