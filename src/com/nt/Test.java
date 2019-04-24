package com.nt;

import java.util.concurrent.TimeUnit;

public class Test {
	static int sum = 0;

	public static void main(String[] args) {

		Runnable addition = () -> {
			for (int i = 0; i <= 10; i++) {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				sum = sum + i;
			}
			System.out.println("Done 1");
		};

		Thread t1 = new Thread(addition);
		t1.start();

		Runnable display = () -> {
			try {
				t1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(sum);
			System.out.println("Done 2");

		};

		Thread t2 = new Thread(display);
		t2.start();

	}
}
