package test;

import java.util.concurrent.TimeUnit;

public class CalculLong implements Runnable {
	
	public void run() {
		System.out.println("Play in 10 seconds");
		for (int i=0;i<10;i++) {
			System.out.println(i);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
