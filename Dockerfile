FROM openjdk:11
COPY ./target/MiniProjectSPE-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "jar", "MiniProjectSPE-1.0-SNAPSHOT-jar-with-dependencies.jar", "Main"]
