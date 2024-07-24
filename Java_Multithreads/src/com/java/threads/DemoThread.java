package com.java.threads;

public class DemoThread extends  Thread {
	@Override
		public void run() {
			for(int i=1;i<=10;i++) {
				System.out.println(Thread.currentThread().getName());
			}
		}
public static void main(String[] args) throws InterruptedException {
	DemoThread dm= new DemoThread();
	
	Thread t1= new Thread(dm);
	Thread t2 = new Thread(dm);
	
	t1.start();
	//t1.join();
	t2.start();
	
}
}
