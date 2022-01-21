package com.in28minutes.ThreadsAndMultithreading;

class Task4 extends Thread {
	@Override
	public void run() {
		System.out.println("\n Task4 is Started");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\nTask4 is Done");
	}
}

class Task5 implements Runnable {

	@Override
	public void run() {
		System.out.println("\n Task5 is Started");
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask5 is done");
	}
}

public class ThreadBasicRunner {


	public static void main(String[] args) throws InterruptedException {
		// Task4
		System.out.println("\n Task4 is Kicked off");
		Task4 task4 = new Task4();
		task4.start();

		// Task5
		System.out.println("\n Task5 is Kicked off");
		Task5 task5 = new Task5();
		Thread task2Thread = new Thread(task5);
		task2Thread.start();

		task4.join();
		task2Thread.join();

		// Task6
		System.out.println("\n Task6 is Kicked off");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask6 is done");
		System.out.println("Main mehtod is done");

	}

}
