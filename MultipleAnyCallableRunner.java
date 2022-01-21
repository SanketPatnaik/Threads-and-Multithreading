package com.in28minutes.ThreadsAndMultithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService ex = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks = List.of(new CallableTask("Neetu "), new CallableTask("Liza "),
				new CallableTask("Shona "));

		String result = ex.invokeAny(tasks);

		System.out.println(result);

		System.out.println("By the way, All of them are the same girl in case you wondering");

		ex.shutdown();

	}

}
