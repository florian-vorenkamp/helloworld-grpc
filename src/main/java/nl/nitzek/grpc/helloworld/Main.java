package nl.nitzek.grpc.helloworld;

import java.io.IOException;

import io.grpc.ServerBuilder;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Awaiting requests at 9090...");
			ServerBuilder.forPort(9090)
						 .addService(new GreeterService())
						 .build()
						 .start()
						 .awaitTermination();
		}
		catch (IOException | InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
