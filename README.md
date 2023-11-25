# Seam Java Library

[![Maven Central](https://img.shields.io/maven-central/v/io.github.seamapi/java)](https://central.sonatype.com/artifact/io.github.seamapi/java) 
[![fern shield](https://img.shields.io/badge/%F0%9F%8C%BF-SDK%20generated%20by%20Fern-brightgreen)](https://buildwithfern.com/?utm_source=seamapi/java/readme)

## Documentation

API documentation is available at https://docs.seam.co/latest/api-clients/overview.

## Install

### Gradle

Add the dependency in your `build.gradle`:

```groovy
dependencies {
    implementation 'io.github.seamapi:java:0.x.x'
}
```

### Maven

Add the dependency in your `pom.xml`:

```xml
<dependency>
    <groupId>io.github.seamapi</groupId>
    <artifactId>java</artifactId>
    <version>0.x.x</version>
</dependency>
```

## Usage
```java
import com.seam.api.Seam;
import com.seam.api.types.AccessCode;
import com.seam.api.resources.accesscodes.requests.AccessCodesCreateRequest;

Seam seam = Seam.builder()
        .token("MY_API_KEY")
        .build();
AccessCode accessCode = seam.accessCodes().create(AccessCodesCreateRequest.builder()
        .deviceId(someDevice.getDeviceId())
        .name("Test code")
        .code("4444")
        .build());
System.out.println(accessCode);
```

## Handling Errors
When the API returns a non-success status code (4xx or 5xx response),
a subclass of [ApiError](src/main/java/com/seam/api/core/ApiError.java)
will be thrown:

```ts
import com.seam.api.core.ApiError;

try {
  seam.accessCodes().create(...);
} catch (ApiError error) {
  System.out.println(error.getBody());
  System.out.println(error.getStatusCode());
}
```

## Staged Builders
The generated builders all follow the staged builder pattern. 
Read more [here](https://immutables.github.io/immutable.html#staged-builder).
Staged builders only allow you to construct the object once all required 
properties have been specified. 

For example, in the snippet below, you will not be able to access the build
method on `AccessCodesCreateRequest` until you have specified the mandatory 
deviceId variable.

```java
import com.seam.api.resources.accesscodes.requests.AccessCodesCreateRequest;

AccessCodesCreateRequest.builder()
    .deviceId(someDevice.getDeviceId())
    .name("Test code")
    .code("4444")
    .build()
```

## Beta status

This SDK is in beta, and there may be breaking changes between versions without a major version update. 
Therefore, we recommend pinning the package version to a specific version in your build.gradle file. 
This way, you can install the same version each time without breaking changes unless you are 
intentionally looking for the latest version.

## Contributing

While we value open-source contributions to this SDK, this library is generated programmatically. 
Additions made directly to this library would have to be moved over to our generation code, 
otherwise they would be overwritten upon the next generated release. Feel free to open a PR 
as a proof of concept, but know that we will not be able to merge it as-is. We suggest opening an issue first to discuss with us!

On the other hand, contributions to the README are always very welcome!
