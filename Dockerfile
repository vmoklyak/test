FROM openjdk:8

ENV JAVA_OPTS="-server -Xms512m -Xmx1024m"
ENV GC_OPTS="-XX:+UseG1GC"

COPY ./build/libs/calculator-0.0.1-SNAPSHOT.jar /calculator.jar

CMD /bin/bash -c "java $JAVA_OPTS $GC_OPTS -jar /calculator.jar"