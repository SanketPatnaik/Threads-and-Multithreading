package com.in28minutes.ThreadsAndMultithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService ex = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks = List.of(new CallableTask("Neetu "), new CallableTask("Liza "),
				new CallableTask("Shona "));

		List<Future<String>> welcomeFuture = ex.invokeAll(tasks);

		for (Future<String> list : welcomeFuture) {

			System.out.println(list.get());

			Thread.sleep(5000);

		}

		System.out.println("By the way, All of them are the same girl in case you wondering");

		ex.shutdown();

	}

}
