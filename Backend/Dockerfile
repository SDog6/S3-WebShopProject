# This file is a template, and might need editing before it works on your project.

FROM openjdk:11-jdk
ENV PORT 4567
EXPOSE 4567
COPY Backend\src\main\java\project
RUN make /Backend
WORKDIR /Backend

CMD ["/bin/bash", "-c", "find -type f -name '*-with-dependencies.jar' | xargs java -jar"]
