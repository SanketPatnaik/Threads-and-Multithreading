package com.in28minutes.ThreadsAndMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("\n Task" + number + " is Started");
		for (int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\nTask" + number + " is Done");
	}
}

public class ExecutorProgramRunner {

	public static void main(String[] args) {
		// ExecutorService ex = Executors.newSingleThreadExecutor();

		ExecutorService ex = Executors.newFixedThreadPool(5);
		ex.execute(new Task(1));
		ex.execute(new Task(2));
		ex.execute(new Task(3));
		ex.execute(new Task(4));
		ex.execute(new Task(5));
		ex.execute(new Task(6));
		ex.execute(new Task(7));
		ex.execute(new Task(8));

		/*
		 * System.out.println("\n Task3 is Kicked off"); for (int i = 301; i <= 399;
		 * i++) { System.out.print(i + " "); } System.out.println("\nTask3 is done");
		 * System.out.println("Main mehtod is done");
		 */
		ex.shutdown();
	}
}
