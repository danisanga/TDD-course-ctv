# ☕🚀 TDD Course. TDD: Test-Driven Development

## ℹ️ Introduction

This project was created using the following Github template - https://github.com/CodelyTV/java-basic-skeleton.


## 🏁 How To Start

1. Install Java 18: `brew install corretto` or download it [here](https://docs.aws.amazon.com/corretto/latest/corretto-18-ug/downloads-list.html)
2. Set it as your default JVM: `export JAVA_HOME='/Library/Java/JavaVirtualMachines/amazon-corretto-18.jdk/Contents/Home'`
3. Clone this repository: `git clone https://github.com/CodelyTV/java-basic-skeleton`.
4. Execute some [Gradle lifecycle tasks](https://docs.gradle.org/current/userguide/java_plugin.html#lifecycle_tasks) in order to check everything is OK:
    1. Create [the project JAR](https://docs.gradle.org/current/userguide/java_plugin.html#sec:jar): `make build`
    2. Run the tests and plugins verification tasks: `make test`
5. Start developing!


## ☝️ How to update dependencies

* Gradle (current version: 5.6 - [releases](https://gradle.org/releases/)):
`./gradlew wrapper --gradle-version=5.6 --distribution-type=bin` or modifying the [gradle-wrapper.properties](gradle/wrapper/gradle-wrapper.properties#L3)
* JUnit (current version: 5.5.1 - [releases](https://junit.org/junit5/docs/snapshot/release-notes/index.html)):
[`build.gradle:11`](build.gradle#L11-L12)

## Exercises

### Product pricing
Introductory TDD exercise.

### User story description
We need to sell products in our online platform, so we have to calculate the total price of them.

The total price of a product that we are going to show to the customer must have the 21% VAT included.

During the exercise development, try to use 🔴 , 🟢 and 🔵 to identify in which TDD phase you are.

#### Extra work
Nice job! Now you know what you need to pay when you buy in Spain.
* What about Australia? VAT in Australia: 10%
* What about Canada? VAT in Canada: 13%
