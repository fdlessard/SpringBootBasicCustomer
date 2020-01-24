# Start with a base image containing Java runtime
<<<<<<< HEAD

=======
>>>>>>> 0c765ee2fd1a16736f64298abb23a3134d7477c0
FROM openjdk:11

# Add Maintainer Info
LABEL maintainer="fdlessard@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080/tcp
EXPOSE 5005/tcp

# The application's jar file
<<<<<<< HEAD
ARG JAR_FILE=target/customer-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} customer.jar

# Run the jar file
ENTRYPOINT ["java","-Xdebug", "-agentlib:jdwp=transport=dt_socket,address=5005,suspend=n,server=y","-Djava.security.egd=file:/dev/./urandom", "-jar","/customer.jar"]
=======
ARG JAR_FILE=target/basic-customer-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} basic-customer.jar

# Run the jar file
ENTRYPOINT ["java","-Xdebug", "-agentlib:jdwp=transport=dt_socket,address=5005,suspend=n,server=y","-Djava.security.egd=file:/dev/./urandom", "-jar","/basic-customer.jar"]

HEALTHCHECK CMD curl --fail http://localhost:8080/actuator/health || exit 1
>>>>>>> 0c765ee2fd1a16736f64298abb23a3134d7477c0
