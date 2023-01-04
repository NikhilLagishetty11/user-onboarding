
# User Onboarding

1. The Service is built based on Microservice Architecture. The main Use of the Service is to onbaord the user.
2. Once the User is Registered, he  can login with "UserName" And "Password".
3. The Kafka message is published to Kafka cluster once the user is registered.


## Tech Stack

1. Java
2. Springboot
3. Gradle
4. Spring-Kafka
5. Swagger
6. H2 DataBase



## Run Project in Local

Pull the source code from GitHub

```bash
  git clone https://github.com/NikhilLagishetty11/user-onboarding.git
```

Wait for gradle to download all the dependencies. Once it is done run the project

## Access Apis using Swagger

```bash
  http://localhost:9091/onboarding-api/swagger-ui/index.html#
```
