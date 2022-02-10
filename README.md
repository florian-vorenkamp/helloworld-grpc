# helloworld-grpc

Small hello-world project showcasing vanilla gRPC functionality.

## Explanation
* Setup
  * src/main/proto contains service and model definitions
  * protobuf-maven-plugin is used to generate classes (models and stubs) based on protobuf files
    * Configuration is based on readme.md found in https://github.com/grpc/grpc-java
* Code
  * GreeterService extends generated stub
    * ResponseObserver is way to handle responses
  * Main class contains code to start grpc server with the earlier mentioned GreeterService
  * Result: When running the app a server is started at 9090. 
  * Using Postman one can import the helloworld.proto and send HelloRequest requests to localhost:9090

    
