package com.in28minutes.ThreadsAndMultithreading;

class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("\n Task1 is Started");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\nTask1 is Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\n Task2 is Started");
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 is done");
	}
}

public class ThreadPriorityRunner {

	public static void main(String[] args) {

		// Task1
		System.out.println("\n Task1 is Kicked off");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();

		// Task2
		System.out.println("\n Task2 is Kicked off");
		Task2 task2 = new Task2();
		Thread thread = new Thread(task2);
		thread.setPriority(10);
		thread.start();

		// Task3
		System.out.println("\n Task3 is Kicked off");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 is done");
		System.out.println("Main mehtod is done");

	}

}
