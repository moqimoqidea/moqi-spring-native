# Spring Native 探索

## [官方文档: Spring Native documentation](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)

## 错误处理

### 需要代理支持

执行时从 Github 拉取资源，需要代理支持。

```text
[creator]       GraalVM JDK 11.0.12: Contributing to layer
[creator]         Downloading from https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.2.0/graalvm-ce-java11-linux-amd64-21.2.0.tar.gz
[creator]         Verifying checksum
[creator]         Expanding to /layers/paketo-buildpacks_graalvm/jdk
[creator]         Adding 129 container CA certificates to JVM truststore
[creator]       GraalVM Native Image Substrate VM 11.0.12
[creator]         Downloading from https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.2.0/native-image-installable-svm-java11-linux-amd64-21.2.0.jar
[creator]         Verifying checksum
[creator]         Installing substrate VM
```

### 增加 Docker 内存配置

碰到这个错误时增加 Docker 引擎的内存配置。

```text
[creator]     Error: Image build request failed with exit status 137
[creator]     unable to invoke layer creator
[creator]     unable to contribute native-image layer
[creator]     error running build
[creator]     exit status 137
[creator]     ERROR: failed to build: exit status 1
```
