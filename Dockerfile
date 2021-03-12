FROM openjdk:8
COPY ./target/MiniProjectSPE-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "MiniProjectSPE-1.0-SNAPSHOT.jar", "Main"]