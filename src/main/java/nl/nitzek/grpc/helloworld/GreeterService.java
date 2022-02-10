package nl.nitzek.grpc.helloworld;

import io.grpc.stub.StreamObserver;

public class GreeterService extends GreeterGrpc.GreeterImplBase
{

	public void sayHello(HelloRequest request,
						 StreamObserver<HelloReply> responseObserver)
	{

		System.out.println("Got request from " + request.getName());

		responseObserver.onNext(HelloReply.newBuilder()
										  .setMessage("Hallo daar, %s!".formatted(request.getName()))
										  .build());
		responseObserver.onCompleted();
	}
}
