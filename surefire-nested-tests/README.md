# Maven Doesn't Execute All JUnit Tests by Default

This directory contains the demo projects of my [blog post](http://blog.rweisleder.de/maven-doesnt-execute-all-junit-tests-by-default/).

## Gradle
```bash
$ cd gradle
$ ./gradlew test
```

## Maven
```bash
$ cd maven
$ ./mvnw test # with default configuration
$ ./mvnw test -P without-excludes # with modified configuration
```
