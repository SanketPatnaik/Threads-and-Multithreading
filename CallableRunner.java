package com.in28minutes.ThreadsAndMultithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {

		Thread.sleep(1000);
		return "I Love " + name;
	}


}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(3);

		Future<String> welcomeFuture = ex.submit(new CallableTask("Neetushri Kabi"));

		System.out.println("New CallableTask(\"Neetushri Kabi\") is Executing ");

		String welcomeMessage = welcomeFuture.get();
		System.out.println(welcomeMessage);

		System.out.println("New CallableTask(\"Neetushri Kabi\") Execution is Finished ");

		System.out.println("Main method completed");

		ex.shutdown();
	}


}
